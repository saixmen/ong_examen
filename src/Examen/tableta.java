package Examen;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Pedro Diez
 */
public class tableta extends javax.swing.JFrame {
    Scanner tec=new Scanner(System.in);
    private int tam;
    Conjunto arrayO;
    Ong ong;
    private int vista=0;
    private int metidos=0;
    public tableta() {
        initComponents();
            System.out.println("te vilijo desde la lejania");
             String resp=JOptionPane.showInputDialog(null, "¿Cuántas ONG´s quieres introducir?");
             tam=Integer.parseInt(resp);
             arrayO= new Conjunto(tam);
             this.buttonGroup1.add(this.radioInter);
             this.buttonGroup1.add(this.radioNaci);
             this.buttonGroup1.add(this.radioRegi);
             this.buttonGroup1.add(this.radioLocal);
             textNombre.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textActividad = new javax.swing.JTextField();
        botonVer = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        radioInter = new javax.swing.JRadioButton();
        radioNaci = new javax.swing.JRadioButton();
        radioRegi = new javax.swing.JRadioButton();
        radioLocal = new javax.swing.JRadioButton();
        botonGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Actividad:");

        botonVer.setText("Ver");
        botonVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerMouseClicked(evt);
            }
        });

        botonDerecha.setText(">>");
        botonDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDerechaMouseClicked(evt);
            }
        });

        botonIzquierda.setText("<<");
        botonIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIzquierdaMouseClicked(evt);
            }
        });

        radioInter.setText("Internacional");

        radioNaci.setText("Nacional");

        radioRegi.setText("Regional");

        radioLocal.setText("Local");

        botonGrabar.setText("Grabar");
        botonGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGrabarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(textActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(textNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(botonIzquierda)
                        .addGap(18, 18, 18)
                        .addComponent(botonVer)
                        .addGap(18, 18, 18)
                        .addComponent(botonDerecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGrabar)
                    .addComponent(radioLocal)
                    .addComponent(radioInter)
                    .addComponent(radioNaci)
                    .addComponent(radioRegi))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonVer)
                            .addComponent(botonDerecha)
                            .addComponent(botonIzquierda)
                            .addComponent(botonGrabar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(radioInter)
                        .addGap(6, 6, 6)
                        .addComponent(radioNaci)
                        .addGap(18, 18, 18)
                        .addComponent(radioRegi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioLocal)))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMouseClicked
        ong=arrayO.getOng(vista);
        textNombre.setText(ong.getNombre());
        textActividad.setText(ong.getActividad());       
        if(ong.getAmbito()=="Internacional")
        {
            radioInter.setSelected(true);
        }
        if(ong.getAmbito()=="Nacional")
            {
                radioNaci.setSelected(true);
            }
        if(ong.getAmbito()=="Regional")
        {
                radioRegi.setSelected(true);
        }
        if(ong.getAmbito()=="Local")
        {
                radioLocal.setSelected(true);
        }
        
    }//GEN-LAST:event_botonVerMouseClicked

    private void botonDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDerechaMouseClicked
           if(vista==0)
            {
                vista=metidos-1;
            }
            else
            {
                vista--;
            }
            ong=arrayO.getOng(vista);

        textNombre.setText(ong.getNombre());
        textActividad.setText(ong.getActividad());
         if(ong.getAmbito()=="Internacional")
        {
            radioInter.setSelected(true);
        }
        if(ong.getAmbito()=="Nacional")
            {
                radioNaci.setSelected(true);
            }
        if(ong.getAmbito()=="Regional")
        {
                radioRegi.setSelected(true);
        }
        if(ong.getAmbito()=="Local")
        {
                radioLocal.setSelected(true);
        }
    
                                      

     
    }//GEN-LAST:event_botonDerechaMouseClicked

    private void botonIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIzquierdaMouseClicked
                if(vista==0)
            {
                vista=metidos-1;
            }
            else
            {
                vista--;
            }
            ong=arrayO.getOng(vista);

        textNombre.setText(ong.getNombre());
        textActividad.setText(ong.getActividad());
         if(ong.getAmbito()=="Internacional")
        {
            radioInter.setSelected(true);
        }
        if(ong.getAmbito()=="Nacional")
            {
                radioNaci.setSelected(true);
            }
        if(ong.getAmbito()=="Regional")
        {
                radioRegi.setSelected(true);
        }
        if(ong.getAmbito()=="Local")
        {
                radioLocal.setSelected(true);
        }
    }//GEN-LAST:event_botonIzquierdaMouseClicked

    private void botonGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrabarMouseClicked
        ong= new Ong();            
        if(textNombre.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Nombre obligatorio", "Aviso", JOptionPane.WARNING_MESSAGE);
        }               
        else
        {
            if(arrayO.getPosicion()==tam)
            {
            JOptionPane.showMessageDialog(null, "La memoria ya está llena.");
            }
            else
            {
                ong.setNombre(textNombre.getText());
                ong.setActividad(textActividad.getText());                
                if(radioInter.isSelected())
                {
                    ong.setAmbito("Internacional");
                }
                if(radioNaci.isSelected())
                    {
                       ong.setAmbito("Nacional");
                    }
                if(radioRegi.isSelected())
                {
                    ong.setAmbito("Regional");
                }
                if(radioLocal.isSelected())
                {
                    ong.setAmbito("Local");
                }
            
            arrayO.anadirOng(ong);
            metidos++;
            }
        
            textNombre.setText(null);
            textActividad.setText(null);
            this.buttonGroup1.clearSelection();
        
        }
        
    }//GEN-LAST:event_botonGrabarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tableta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonGrabar;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JButton botonVer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton radioInter;
    private javax.swing.JRadioButton radioLocal;
    private javax.swing.JRadioButton radioNaci;
    private javax.swing.JRadioButton radioRegi;
    private javax.swing.JTextField textActividad;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
