package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import VIew.Hotel;
import VIew.Quartos;
import Model.Model;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class DAO  {

    public static String sql = "";
    public static String url = "jdbc:sqlserver://DESKTOP-5F3LU5P;databaseName=HotelDB;trustServerCertificate=true";
    public static String user = "aj";
    public static String pass = "aj";
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void inserirH(int id, String nome, String endereco) {
        String sql = "{call setHot(?,?,?)}";
        try (Connection con = conectar(); CallableStatement c = con.prepareCall(sql)) {
            c.setInt(1, id);
            c.setString(2, nome);
            c.setString(3, endereco);

            c.execute();
            showMessage("Sucesso", "Banco", 0);
        } catch (SQLException e) {
            Error(e);
        }
    }
    public static void inserirQ(int id, double preco, int idHot){
        sql = "{call setQ(?, ?, ?)}";
        try(Connection con = conectar();
        CallableStatement c = con.prepareCall(sql))
        {
            c.setInt(1, id);
            c.setDouble(2, preco);
            c.setInt(3, idHot);
            
            c.execute();
            showMessage("Sucesso","Banco",0);
        }
        catch(SQLException e)
        {
            Error(e);
        }
        
    }
    public static void AtualiazarObj(Hotel h, Quartos q, int id  )
    {
        if(id != 4040)
        {
            sql = "{call UpdateQuarto(?, ?, ?)}";
            try(Connection con = conectar();
            CallableStatement c = con.prepareCall(sql)){
                c.setInt(1, id);
                c.setInt(2, q.getId());
                c.setDouble(3, q.getPrecoPorNoite());                
                c.execute();
                showMessage("Sucesso","Banco",0);
                
            }
            catch(SQLException e)
            {
                Error(e);
            }
        }
        else{
            sql = "{call UpdateHotel(?, ?, ?)}";
            try(Connection con  = conectar();
            CallableStatement c =  con.prepareCall(sql)){
                System.out.print(h.getId());
                c.setInt(1,h.getId());
                c.setString(2,h.getEndereco() );
                c.setString(3,h.getNome());
                
                c.execute();
                showMessage("Sucesso","Banco de Dados",0);  
            }
            catch(SQLException e)
            {
                Error(e);
            }
        }
            
            
    }
    public static void DeletarOBJ(int idH, int idQ)
    {
        sql= "{call DELETAR(?,?)}";
        try(Connection con  = conectar();
        CallableStatement c = con.prepareCall(sql))
        {
            if(idQ == 40404040 )
            {
              c.setInt(1, idH);    
              idQ = 40404040;
              c.setInt(2, idQ);
            }
            else{
                c.setInt(1, idH);

                c.setInt(2 ,idQ);
            }
            c.execute();
            showMessage("Sucesso","Banco de Dados",0);  
        }
        catch(SQLException e)
        {
            Error(e);
        }
        
    }
    public List<Quartos> RetornarLQ(int id) {
        List<Quartos> quartos = new ArrayList<>();

        String sql = "{call requestQuartos(?)}";
        try (Connection con = conectar(); CallableStatement c = con.prepareCall(sql)) {
            c.setInt(1, id);
            ResultSet rs = c.executeQuery();

            while (rs.next()) {
                int numeroQuarto = rs.getInt("Numero_quarto");
                int preco = rs.getInt("preco");
                Quartos quarto = new Quartos();
                quarto.setId(numeroQuarto);
                quarto.setPrecoPorNoite(preco);
                quartos.add(quarto);
            }
        } catch (SQLException e) {
            Error(e);
        }

        return quartos;
    }
    public List<Hotel> RetornarLH() {
        List<Hotel> H = new ArrayList<>();

        String sql = "{call requestH()}";
        try (Connection con = conectar(); CallableStatement c = con.prepareCall(sql)) {
            
            ResultSet rs = c.executeQuery();

            while (rs.next()) {
                int Id = rs.getInt("id_hotel");
                String End = rs.getString("Endereco");
                String Nome = rs.getString("Nome");
                Hotel h = new Hotel();
                h.setId(Id);
                h.setEndereco(End);
                h.setNome(Nome);
                H.add(h);
            }
        } catch (SQLException e) {
            Error(e);
        }

        return H;
    }
    public Hotel RetornarH(int id)
    {
       
        Hotel h = new Hotel();
        sql ="{call UnicoH(?)}";
        try(Connection con =  conectar();
        CallableStatement c  = con.prepareCall(sql))
        {
            c.setInt(1, id);
            ResultSet rs = c.executeQuery();
            if (rs.next()) {
                h = new Hotel(); // Instancie o objeto apenas se houver resultado
                h.setId(rs.getInt("id_hotel"));
                h.setNome(rs.getString("Nome"));
                h.setEndereco(rs.getString("Endereco"));
            }
            
            
        }
        catch(SQLException e)
        {
            Error(e);
        }
        finally{
            return h;
        }
        
    }
       public Quartos RetornarQ(int idh, int idq)
    {
        Quartos q  = new Quartos();
        sql = "{call UnicoQ(?, ?)}";
        try(Connection con  = conectar();
        CallableStatement c =  con.prepareCall(sql))
        {
            c.setInt(1, idh);
            c.setInt(2, idq);
            ResultSet rs = c.executeQuery();
            
            if(rs.next())
            {
                q.setId(rs.getInt("Numero_quarto"));
                q.setPrecoPorNoite(rs.getInt("preco"));
                System.out.println(q.getPrecoPorNoite());
            }

            
        }
        catch(SQLException e)
        {
            Error(e);
        }
        finally{
            return q;
        }
   
    }
        
        
    public static void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void Error(SQLException e)
    {
         showMessage("Problema no Banco de dados " + e.getMessage(),"Erro",0);
    }
}
