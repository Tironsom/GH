/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jasper;
import Controller.DAO;
import net.sf.jasperreports.engine.JasperPrint;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
public class Calling {
 
    public static final String pasta_relatorios = System.getProperty("user.dir") + "/src/main/java/Jasper/";
    public static final File Hotel = new File(pasta_relatorios, "Blank_A4_3.jrxml");
    public static final File Quarto = new File(pasta_relatorios, "Quartos.jrxml");
    public static final File QPH = new File(pasta_relatorios, "Total.jrxml");
  
 
 
    public static void  MostrarRHotel()
    {
     JasperPrint impressao ; 
     try{
         FileInputStream arq =  new FileInputStream( Hotel );
            JasperReport relatorio = JasperCompileManager.compileReport(arq);
            impressao = JasperFillManager.fillReport(
                    relatorio,
                    null,
                    DAO.conectar());

            //opcao de visualizar o relatorio
            JasperViewer.viewReport(impressao);

     }
     catch (JRException | FileNotFoundException erro) {
        System.err.println("Não foi possível exportar o relatório.\n\n" + erro);
     }
    } 
     public static void MostrarQuartos()
     {
        JasperPrint impressao ;
        try{
            FileInputStream arq  = new FileInputStream(Quarto);
            JasperReport r = JasperCompileManager.compileReport(arq);
            impressao = JasperFillManager.fillReport(
                    r,
                    null,
                    DAO.conectar()     
            );
            JasperViewer.viewReport(impressao );
        }
        catch (JRException | FileNotFoundException erro) {
        System.err.println("Não foi possível exportar o relatório.\n\n" + erro);
        }
     }
     public void chamarQPH()
     {
      JasperPrint impressao;
      try{
          FileInputStream arq = new FileInputStream(QPH);
          JasperReport r = JasperCompileManager.compileReport(arq);
           impressao = JasperFillManager.fillReport(
            r,//arquivo .jasper
            CP(),
            DAO.conectar());
        JasperViewer.viewReport(impressao);
        } catch (FileNotFoundException | JRException ex) {
            System.err.println("Não foi possível exportar o relatório.\n\n");
            ex.printStackTrace();
        }
     }
     
    private Map CP() {
        Map params = new HashMap();

        int idh = Integer.valueOf(JOptionPane.showInputDialog(
                null,
                "Digite o id do Hotel",
                "Entrada de dados",
                JOptionPane.QUESTION_MESSAGE));

        params.put("P1", idh);
        return params;
    }
     
      
}
 
    
    
    
    
    


