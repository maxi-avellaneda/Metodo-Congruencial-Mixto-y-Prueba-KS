
package interfaz;

import java.awt.Image;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import metodo.congruencial.mixto.Variables;


public class pantallaPrincipal extends javax.swing.JFrame {
    
    ArrayList<Variables> lista = new ArrayList<Variables>();
    Integer iter;
    public pantallaPrincipal() {
        initComponents();
        ImageIcon imagen= new ImageIcon("src/imagenes/logo.png");
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(logoFacu.getWidth(),logoFacu.getHeight(), Image.SCALE_DEFAULT));
        logoFacu.setIcon(icono);
        //this.repaint();
         setIconImage (new ImageIcon(getClass().getResource("/Imagenes/analisis.jpg")).getImage());
         pruebaKS.setEnabled(false);
         pruebaKS.setVisible(false);
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Generar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoX0 = new javax.swing.JTextField();
        vblA = new javax.swing.JTextField();
        vblC = new javax.swing.JTextField();
        vblM = new javax.swing.JTextField();
        vblIteracion = new javax.swing.JTextField();
        logoFacu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaaa = new javax.swing.JTable();
        pruebaKS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar_1.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.setContentAreaFilled(false);
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Método: CONGRUENCIAL MIXTO");

        jLabel2.setText("Ingresa el valor de las variables...");

        jLabel3.setText("x0");

        jLabel4.setText("a:");

        jLabel5.setText("c:");

        jLabel6.setText("m:");

        jLabel7.setText("iteraciones:");

        textoX0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoX0ActionPerformed(evt);
            }
        });
        textoX0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoX0KeyTyped(evt);
            }
        });

        vblA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vblAActionPerformed(evt);
            }
        });
        vblA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vblAKeyTyped(evt);
            }
        });

        vblC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vblCKeyTyped(evt);
            }
        });

        vblM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vblMActionPerformed(evt);
            }
        });
        vblM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vblMKeyTyped(evt);
            }
        });

        vblIteracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vblIteracionKeyTyped(evt);
            }
        });

        tablaaa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Xi", "(a*Xi + c)", "(a*Xi + c) mod m", "Ui", "Ni"
            }
        ));
        jScrollPane1.setViewportView(tablaaa);

        pruebaKS.setText("Prueba K-S");
        pruebaKS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaKSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoX0)
                            .addComponent(vblA)
                            .addComponent(vblC)
                            .addComponent(vblM)
                            .addComponent(vblIteracion, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Borrar)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))))
                .addComponent(jScrollPane1)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(logoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pruebaKS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pruebaKS, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoX0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vblA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vblC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vblM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vblIteracion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Borrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        //al hacer click en generar,envio los valores de las variables y las guardo.
        if((textoX0.getText().equals(""))||(vblA.getText().equals(""))||(vblC.getText().equals(""))||(vblM.getText().equals(""))||(vblIteracion.getText().equals(""))){
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios","Error", JOptionPane.ERROR_MESSAGE);
            }else{
            
        
            DecimalFormat formato1= new DecimalFormat ("#.00");
        
        
        Double x0,a,c,m,xi;
        
        
        x0=Double.parseDouble(textoX0.getText());
        xi=x0;
        a=Double.parseDouble(vblA.getText());
        c=Double.parseDouble(vblC.getText());
        m=Double.parseDouble(vblM.getText());
        iter= Integer.parseInt(vblIteracion.getText());
        
        formato1.format(x0);
        formato1.format(xi);
        formato1.format(a);
        formato1.format(c);
        formato1.format(m);
        /*if(xi==x0){
            
        }*/
        //para calcular con formula
        Double b,d,Ui,Ni;
        
        
        /*b=(a*xi)+c;
        d=b%m;
        Ui=d/m;
        Ni=d;
        xi=Ni;
        Variables variable = new Variables(x0,b,d,Ui,Ni);
        lista.add(variable);*/
        for(int i=0;i<iter;i++){
            
            b=(a*xi)+c;
            d=b%m;
            Ui=d/m;
            Ni=d;
            
            Variables variable = new Variables(xi,b,d,Ui,Ni);
            xi=Ni;
            lista.add(variable);
            
            formato1.format(b);
            formato1.format(d);
            formato1.format(Ui);
            formato1.format(Ni);
            
            
        }
        //Variables variable = new Variables(x0,b,d,Ui,Ni);
        //lista.add(variable);
        
        //formato1.format(b);
        //formato1.format(d);
        //formato1.format(Ui);
        //formato1.format(Ni);
        
        mostrar(iter);
        Generar.setEnabled(false);
        pruebaKS.setEnabled(true);
        Generar.setVisible(false);
        pruebaKS.setVisible(true);
       }
        
    }//GEN-LAST:event_GenerarActionPerformed
    
    public void mostrar(Integer iter){
        Double matris[][]= new Double[lista.size()][5];
        
        for(int j=0;j<iter;j++){
            for(int i=0;i<lista.size();i++){
                matris[i][0]=lista.get(i).getX0();
                matris[i][1]=lista.get(i).getB();
                matris[i][2]=lista.get(i).getD();
                matris[i][3]=lista.get(i).getUi();
                matris[i][4]=lista.get(i).getNi();
            }
        }        
        tablaaa.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Xi", "(a*Xi + c)", "(a*Xi + c) mod m", "Ui", "Ni"
            }
        ));
    }
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        textoX0.setText(null);
        vblA.setText(null);
        vblC.setText(null);
        vblIteracion.setText(null);
        vblM.setText(null);
        Generar.setEnabled(true);
        pruebaKS.setEnabled(false);
        Generar.setVisible(true);
        pruebaKS.setVisible(false);
        
    }//GEN-LAST:event_BorrarActionPerformed

    private void textoX0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoX0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoX0ActionPerformed

    private void vblAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vblAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vblAActionPerformed

    private void vblMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vblMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vblMActionPerformed

    private void pruebaKSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaKSActionPerformed
        // TODO add your handling code here:
        if((textoX0.getText().equals(""))||(vblA.getText().equals(""))||(vblC.getText().equals(""))||(vblM.getText().equals(""))||(vblIteracion.getText().equals(""))){
           
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios","Error", JOptionPane.ERROR_MESSAGE);
            }else{
            
        
        pruebaKS prueba = new pruebaKS(lista,iter);
        prueba.setVisible(true);
        }
          
       
       // dispose();
    }//GEN-LAST:event_pruebaKSActionPerformed

    private void textoX0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoX0KeyTyped
        // TODO add your handling code here:
             char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         textoX0.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         textoX0.setCursor(null);
     }
     
    }//GEN-LAST:event_textoX0KeyTyped

    private void vblAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vblAKeyTyped
        // TODO add your handling code here:
              char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblA.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblA.setCursor(null);
     }
     
    }//GEN-LAST:event_vblAKeyTyped

    private void vblCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vblCKeyTyped
        // TODO add your handling code here:
             char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblC.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblC.setCursor(null);
     }
     
    }//GEN-LAST:event_vblCKeyTyped

    private void vblMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vblMKeyTyped
        // TODO add your handling code here:
             char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblM.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblM.setCursor(null);
     }
     
    }//GEN-LAST:event_vblMKeyTyped

    private void vblIteracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vblIteracionKeyTyped
        // TODO add your handling code here:
             char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblIteracion.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         vblIteracion.setCursor(null);
     }
     
    }//GEN-LAST:event_vblIteracionKeyTyped

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
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoFacu;
    private javax.swing.JButton pruebaKS;
    private javax.swing.JTable tablaaa;
    private javax.swing.JTextField textoX0;
    private javax.swing.JTextField vblA;
    private javax.swing.JTextField vblC;
    private javax.swing.JTextField vblIteracion;
    private javax.swing.JTextField vblM;
    // End of variables declaration//GEN-END:variables
}
