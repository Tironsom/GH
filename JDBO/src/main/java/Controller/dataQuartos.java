/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import VIew.Hotel;
import VIew.Quartos;
import VIew.except;

/**
 *
 * @author edufr
 */
public class dataQuartos {
    String info  = "";
    DAO d = new DAO();
    String p2;
    except e = new except();
     public void addQuartos()
    {

        System.out.println(info);
        String[] partes = info.split(";");
        String p1 = partes[0].trim();
        String p2 = partes[1].trim();
        String p3 = partes[2].trim();
        System.out.print(p1);
        except e = new except();

        Quartos y = new Quartos();
        y.setId(Integer.parseInt(p1));
        y.setPrecoPorNoite(Double.parseDouble(p2));
        int id = Integer.parseInt(p3);
        d.inserirQ(y.getId(), y.getPrecoPorNoite(), id);
    }
    public void upQuartos()
    {
        Hotel y = new Hotel();
        Quartos q = new Quartos();
        String[] partes = info.split(";");
        String p1 = partes[0].trim();
        String p2 = partes[1].trim();
        String p3 = partes[2].trim();

        System.out.println(info);
        q.setId(Integer.parseInt(p1));
        q.setPrecoPorNoite(Integer.parseInt(p2));
        int id = Integer.parseInt(p3);
        d.AtualiazarObj(y, q, id);
    }
    public void delQuartos()
    {

        System.out.println(info);
        String[] partes = info.split(";");
        String p1 = partes[0].trim();
        String p2 = partes[1].trim();
        System.out.print(p1);
        except e = new except();


        d.DeletarOBJ(Integer.parseInt(p1),Integer.parseInt(p2));
    }
    public void setA(String alfa){
        this.info = alfa;
    }
}
