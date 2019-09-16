
package interfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import metodo.congruencial.mixto.KS;
import metodo.congruencial.mixto.Variables;
import metodo.congruencial.mixto.aleatorios;


public class adivine extends javax.swing.JFrame {

    ArrayList<KS> lista2 = new ArrayList<KS>();
    ArrayList<aleatorios> lista3 = new ArrayList<aleatorios>();
    double auxiliar;
    int auxi;
    public adivine(ArrayList <KS> c) {
        lista2=c;
        initComponents();
        Double Ui;
        for(int i=0;i<lista2.size();i++){
            Ui=lista2.get(i).getUi()*1000;
            aleatorios al = new aleatorios(Ui);
            lista3.add(al);
        }
        
        int aleatorio= (int)(Math.random()*lista3.size());
        auxiliar=generar(lista3,aleatorio);
        auxi=(int)auxiliar;
        
    }

    public Double generar(ArrayList <aleatorios> d,int a){
        Double aux;
        aux=lista3.get(a).getUi();
        return aux;
        
    }
    private adivine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtadivine = new javax.swing.JTextField();
        badivine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INTENTE ADIVINAR UN NUMERO");

        badivine.setText("ADIVINE");
        badivine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badivineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(badivine, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtadivine, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txtadivine, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(badivine, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void badivineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badivineActionPerformed
        // TODO add your handling code here:
        Integer recibido;
        //recibido=Double.parseDouble(txtadivine.getText());
        recibido=Integer.parseInt(txtadivine.getText());
        char a,ban='b';
        int intentos=0;
        System.out.print(auxi);
        do{
            intentos++;
            if(auxi>recibido){
                JOptionPane.showMessageDialog(null, "pista: el numero es MAYOR", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }else if(auxi<recibido){
                JOptionPane.showMessageDialog(null, "pista: el numero es MENOR", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
            recibido=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            
        }while(ban!='a'&&recibido!=auxi);
       
                JOptionPane.showMessageDialog(null, "USTED ADIVINO", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
       
        
    }//GEN-LAST:event_badivineActionPerformed

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
            java.util.logging.Logger.getLogger(adivine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adivine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adivine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adivine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adivine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badivine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtadivine;
    // End of variables declaration//GEN-END:variables
}
