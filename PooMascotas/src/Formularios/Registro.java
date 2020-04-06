/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author nesto
 */
public class Registro extends javax.swing.JFrame {
     
    public static ArrayList <datosL> lanimales;
   
    public Registro() {
        initComponents();
        lanimales= new ArrayList();
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGgenero = new javax.swing.ButtonGroup();
        BGVacunas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBclase = new javax.swing.JComboBox<>();
        txtnombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBtipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        RbHembra = new javax.swing.JRadioButton();
        RBMacho = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RBsi = new javax.swing.JRadioButton();
        rbno = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtAlimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Datos de la mascota");

        jLabel2.setText("Nombre");

        jLabel3.setText("Clase");

        jLabel4.setText("Edad");

        CBclase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anfibios", "Reptiles", "Aves", "Mamiferos" }));
        CBclase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBclaseActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo");

        CBtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rana", "Salamandra", "tritones" }));

        jLabel6.setText("Genero");

        BGgenero.add(RbHembra);
        RbHembra.setText("Hembra");

        BGgenero.add(RBMacho);
        RBMacho.setText("Macho");

        jLabel7.setText("Color");

        jButton1.setText("Guardar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Vacunas");

        BGVacunas.add(RBsi);
        RBsi.setText("si");

        BGVacunas.add(rbno);
        rbno.setText("No");

        jLabel9.setText("Tipo de Alimento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(RBsi)
                        .addGap(18, 18, 18)
                        .addComponent(rbno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombre)
                                    .addComponent(CBclase, 0, 105, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEdad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RbHembra)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBMacho))
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RbHembra)
                    .addComponent(RBMacho)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(RBsi)
                    .addComponent(rbno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBclaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBclaseActionPerformed
            switch (CBclase.getSelectedItem().toString()) {
            case "Anfibios":
            
                CBtipo.removeAllItems();
                CBtipo.setModel(new javax.swing.DefaultComboBoxModel<>
                            (new String[] { "Rana", "Salamandra", "tritones"}));
                break;
            case "Reptiles":
                CBtipo.removeAllItems();
                CBtipo.setModel(new javax.swing.DefaultComboBoxModel<>
                    (new String[] { "Iguana", "Camaleon", "Tortuga", "Serpiente" }));
                break;
            case "Mamiferos":
                CBtipo.removeAllItems();
                CBtipo.setModel(new javax.swing.DefaultComboBoxModel<>
                    (new String[] { "Perro", "Gato", "Hamster", "Rata Blanca", "Conejo"}));
                break;
                case "Aves":
                CBtipo.removeAllItems();
                CBtipo.setModel(new javax.swing.DefaultComboBoxModel<>
                    (new String[] { "Perico australiano", "Loro"}));
                break;
                
            default:
                break;
        }
    }//GEN-LAST:event_CBclaseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       HistorialMascotas HM = new HistorialMascotas();
       HM.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Anfibios anfi= new Anfibios();
        Aves av = new Aves();
        Mamiferos ma= new Mamiferos();
        Reptiles rep= new Reptiles();
        String genero,vacuna;
        if (RBMacho.isSelected())
            {
                genero="Macho";
            }else{ genero="hembra";}
        
        if (RBsi.isSelected())
             {
                 vacuna="Si";
             }
              else 
                {
                    vacuna="No";
                }
        switch (CBclase.getSelectedItem().toString()) {
            case "Anfibios":
                  anfi.setNombreM(txtnombre.getText());
                  anfi.setEdadM(Integer.parseInt(txtEdad.getText()));
                  anfi.setClase("Anfibios");
                  anfi.setTipo(CBtipo.getSelectedItem().toString());
                  anfi.setGenero(genero);
                  anfi.setColor(txtColor.toString());
                  anfi.setVacunas(vacuna);
                  anfi.setTipodeAlimento(txtAlimento.getText());
                  
                break;
                
                 case "Reptiles":
                      rep.setNombreM(txtnombre.getText());
                  rep.setEdadM(Integer.parseInt(txtEdad.getText()));
                  rep.setClase("Reptiles");
                  rep.setTipo(CBtipo.getSelectedItem().toString());
                  rep.setGenero(genero);
                  rep.setColor(txtColor.toString());
                  rep.setVacunas(vacuna);
                  rep.setTipodeAlimento(txtAlimento.getText());
                break;
                
            case "Mamiferos":
                     ma.setNombreM(txtnombre.getText());
                  ma.setEdadM(Integer.parseInt(txtEdad.getText()));
                  ma.setClase("Mamiferos");
                  ma.setTipo(CBtipo.getSelectedItem().toString());
                  ma.setGenero(genero);
                  ma.setColor(txtColor.toString());
                  ma.setVacunas(vacuna);
                  ma.setTipodeAlimento(txtAlimento.getText());
                break;
                
                case "Aves":
                    av.setNombreM(txtnombre.getText());
                  av.setEdadM(Integer.parseInt(txtEdad.getText()));
                  av.setClase("Aves");
                  av.setTipo(CBtipo.getSelectedItem().toString());
                  av.setGenero(genero);
                  av.setColor(txtColor.toString());
                  av.setVacunas(vacuna);
                  av.setTipodeAlimento(txtAlimento.getText());
                break;
            default:
                throw new AssertionError();
        }
          
            lanimales.add(new datosL(txtnombre.getText(),
                                    Integer.parseInt(txtEdad.getText()),
                                    CBclase.getSelectedItem().toString(),
                                    CBtipo.getSelectedItem().toString(),
                                    genero,
                                    txtColor.getText(),
                                    vacuna,
                                    txtAlimento.getText()));
      
        txtnombre.setText("");txtEdad.setText("");txtAlimento.setText("");txtColor.setText("");
                     
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGVacunas;
    private javax.swing.ButtonGroup BGgenero;
    private javax.swing.JComboBox<String> CBclase;
    private javax.swing.JComboBox<String> CBtipo;
    private javax.swing.JRadioButton RBMacho;
    private javax.swing.JRadioButton RBsi;
    private javax.swing.JRadioButton RbHembra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbno;
    private javax.swing.JTextField txtAlimento;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
