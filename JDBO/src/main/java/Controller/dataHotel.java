/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import VIew.Hotel;
import VIew.Quartos;
import VIew.Registro;
import VIew.except;
import javax.swing.JOptionPane;
import VIew.except;

    

public class dataHotel {
    String info ;
    DAO d = new DAO();
    String p2;
    except e = new except();
        public void setHotel()
        {
            System.out.println(info);
            String[] partes = info.split(";");
            String p1 = partes[0].trim();
            String p2 = partes[1].trim();
            String p3 = partes[2].trim();
            System.out.print(p1);
            except e = new except();
            if(e.isInteger(p2) || e.isInteger(p3))
            {
                JOptionPane.showMessageDialog(null, "nome e endereço não podem ser numeros puros.", "Erro", JOptionPane.ERROR_MESSAGE);

            }
            else{
                Hotel y = new Hotel();
                y.setId(Integer.parseInt(p1));
                y.setEndereco(p3);
                y.setNome(p2);
                d.inserirH(y.getId(), y.getNome(), y.getEndereco());
            }   

        }
        
        public void upHotel()
        {
           Hotel y = new Hotel();
           Quartos q = new Quartos();
           String[] partes = info.split(";");
           String p1 = partes[0].trim();
           String p2 = partes[1].trim();
           String p3 = partes[2].trim();
           if(e.isInteger(p2) || e.isInteger(p3))
           {
               JOptionPane.showMessageDialog(null, "nome e endereço não podem ser numeros puros.", "Erro", JOptionPane.ERROR_MESSAGE);

           }
           System.out.println(info);
           y.setId(Integer.parseInt(p1));
           y.setNome(p2);
           y.setEndereco(p3);
           d.AtualiazarObj(y, q, 4040);
        }
        public void delHotel()
        {
            System.out.println(info);
            String[] partes = info.split(";");
            String p1 = partes[0].trim();
            System.out.print(p1);

            except e = new except();
            p2 = null;

            d.DeletarOBJ(Integer.parseInt(p1),40404040);
        }

        public void setA(String alfa){
            this.info = alfa;
        }
        
}