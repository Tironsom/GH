/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIew;

import Controller.DAO;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edufr
 */

public class Registro extends javax.swing.JFrame {
    except e = new except();
    static String p1 = "";
    static String p2 = " ";
    static String p3 = "";
    static String p4 = "";
    private static int count = 0;
    private static String info ;
    private static Registro rg;
    private int chamada = 0;
    private DefaultTableModel tableModel;
    DAO d = new DAO();
    
    
    public int  contador (){
        chamada  = chamada  + 1; 
        return chamada;
    }

    public Registro( ){
        initComponents();
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"Id/numero", "Nome/preco", "Endereco/idHotel"});

        // Configurar a tabela para usar o modelo
        jTable1.setModel(tableModel);
    }

    public static Registro getReg(){
        if (rg == null) {
            rg = new Registro();
        }
        return rg;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Adicionar Hotel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alterar Hotel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Deletar Hotel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Adicionar Quarto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Atualizar Preço");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Deixar Quarto Ocupado");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ver todos os quartos do Hotel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("ver todos os hoteis");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id/numero", "Nome/preco", "Endereco/idHotel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton9.setText("Achar Quarto ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Achar Hotel");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("retornar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(jButton11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(638, Short.MAX_VALUE)
                    .addComponent(jButton10)
                    .addGap(87, 87, 87)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(180, 180, 180))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(230, Short.MAX_VALUE)
                    .addComponent(jButton10)
                    .addGap(187, 187, 187)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddH();


        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateH();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          AddQ();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       UpdateQ();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DelH();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DelQ();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MostrarQ();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MostarHot();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       AcharH();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       AcharQ();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Principal r = new Principal();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed


   public void AddH()
   {

        Adicionar a = new Adicionar();
        a.setVisible(true);
        a.l3("ID:  ","Nome: ", "Endereco: ", "Adicionar Hotel");
        dispose();
   }
   public void UpdateH() 
   {
            Adicionar a = new Adicionar();
            a.l3("Id: ", "Nome: ", "Novo Endereco: ", "Atualizar Hotel");
            a.setVisible(true);
            dispose();   
   }
   public void DelH()
   {
            Adicionar a = new Adicionar();
            a.setVisible(true);
            a.l1("Id do Hotel: ", "Deletar Hotel");
            dispose();
   }
   public void AddQ()
   {           
        Adicionar a = new Adicionar();
        a.setVisible(true);
        a.l3("Numero: ","Preco: ", "Id do Hotel: ", "Adicionar Quarto");
        dispose();

   }
   public void UpdateQ()
   {
        Adicionar a = new Adicionar();
        a.l3("Id: ", "Preco: ", "Id Do Hotel", "Atualizar Quarto");
        a.setVisible(true);
        dispose();
   }
   public void DelQ()
   {
        Adicionar a = new Adicionar();
        a.setVisible(true);
        a.l2("Id do Hotel: ", "Numero do Quarto:", "Deletar Quarto");
        dispose();
   }
   public void MostarHot()
   {
      List<Hotel> hotel = d.RetornarLH();
      PreencherTabelaHotel(hotel);
   }
    public void MostrarQ() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Hotel ID:"));

        List<Quartos> quartos = d.RetornarLQ(id);

        System.out.println("Quartos para o Hotel ID: " + id);

        // Chamar o novo método para preencher a tabela
        PreencherTabelaQuartos(quartos, id);
    }
    
    public void AcharH()
    {
        Hotel h =  new Hotel();
        String ids = JOptionPane.showInputDialog("Informe o id do hotel");
        int  id = Integer.parseInt(ids);
        h = d.RetornarH(id);
        if(h.getId() == 0 )
        {
          JOptionPane.showMessageDialog(null, "Hotel inexistente.", "Hotel", JOptionPane.WARNING_MESSAGE);
        }
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(h);
        
        PreencherTabelaHotel(hotels);
    }
    public void AcharQ()
    {
        Quartos q = new Quartos();
        String idsH = JOptionPane.showInputDialog("Informe o id do hotel");
        int  id = Integer.parseInt(idsH);
        String idsQ = JOptionPane.showInputDialog("Informe o Numero do Quarto");
        int  idq = Integer.parseInt(idsQ);
        
        q = d.RetornarQ(id, idq);
        if(q.getId() == 0 )
        {
          JOptionPane.showMessageDialog(null, "Quarto inexistente.", "Quarto", JOptionPane.WARNING_MESSAGE);
        }
        else{
            List<Quartos> qa = new ArrayList<>();
            qa.add(q);
            PreencherTabelaQuartos(qa, id);
        }

    }
    
    
    
    
    
    
    
    
    
    
    

   public void setCount(int count)
   {
       this.count  = count;
   }
   public void setA(String alfa){
       Registro.info = alfa;
   }

    public void setJButton1Text(String text) {
        jButton1.setText(text);
    }
    public void setJButton2Text(String text) {
        jButton2.setText(text);
    }
    public void setJButton3Text(String text) {
        jButton3.setText(text);
    }
    public void setJButton4Text(String text) {
        jButton4.setText(text);
    }
    public void setJButton5Text(String text) {
        jButton5.setText(text);
    }
    private void PreencherTabelaQuartos(List<Quartos> quartos, int id) {
 
    tableModel.setRowCount(0);


        for (Quartos quarto : quartos) {
            tableModel.addRow(new Object[]{quarto.getId(), quarto.getPrecoPorNoite(), id});
        }
    }
    private void PreencherTabelaHotel(List<Hotel> Hotel) {
   
      tableModel.setRowCount(0);

 
        for (Hotel h : Hotel) {
            tableModel.addRow(new Object[]{h.getId(), h.getNome(), h.getEndereco() });
        }
    }
    
    
    
    
    
    
    /* informações para o Banco de dados importadas para controller para deixar mais limpo */

    
        
      
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
