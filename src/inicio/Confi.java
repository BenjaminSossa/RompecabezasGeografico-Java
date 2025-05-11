
package inicio;
import Armado.NorteAmerica;
import java.awt.Color;
import javax.sound.sampled.Clip;
import javax.swing.JButton;


public class Confi extends javax.swing.JFrame {

    
    
    public static boolean sonidoActivado = true;
        private static boolean musicaFondoActivada = true; // Controlar si la música de fondo está activada

    private Inicio inicio; // Instancia de la clase Inicio
    
    public Confi() {
        initComponents();
         setLocationRelativeTo(null);
        setResizable(Boolean.FALSE);
        
        JButton bloquearSonido = new JButton("Bloquear Sonido");
        bloquearSonido.addActionListener(e -> toggleSonido());
        add(bloquearSonido);;
        
                bloquearSonido.setText("Sonido Activado"); // Texto inicial del botón
                
                
   
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btanterior = new javax.swing.JButton();
        bloquearSonido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 107, 31));
        jLabel3.setText("Configuración");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 330, 75));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel2.setText("Sonido: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        btanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        btanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btanterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 147, 50));

        bloquearSonido.setText("Sonido Activado");
        bloquearSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloquearSonidoActionPerformed(evt);
            }
        });
        jPanel1.add(bloquearSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio/fondo (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanteriorActionPerformed
        Inicio secm = new Inicio ();
        secm.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btanteriorActionPerformed

    
    
    
    private void bloquearSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloquearSonidoActionPerformed
    
     // Cambia el estado del sonido
    sonidoActivado = !sonidoActivado;

    // Cambia el texto del botón según el estado actual del sonido
    if (sonidoActivado) {
        bloquearSonido.setText("Sonido Activado");
    } else {
        bloquearSonido.setText("Sonido Desactivado");
    }

    // Muestra en la consola el estado actual para verificar
    System.out.println("Sonido activado: " + sonidoActivado);
        
    }//GEN-LAST:event_bloquearSonidoActionPerformed

    
    
    
    
     private void toggleSonido() {
       // Cambia el estado del sonido
        sonidoActivado = !sonidoActivado;

        // Cambia el texto del botón según el estado actual del sonido
        if (sonidoActivado) {
            bloquearSonido.setText("Sonido Activado");
            bloquearSonido.setBackground(Color.GREEN); // Color rojo cuando el sonido está desactivado
        } else {
            bloquearSonido.setText("Sonido Desactivado");
             bloquearSonido.setBackground(Color.RED); // Color rojo cuando el sonido está desactivado
    
        }

        // Muestra en la consola el estado actual para verificar
        System.out.println("Sonido activado: " + sonidoActivado);
    }
     
     
     
      public static boolean isSonidoActivado() {
        return sonidoActivado;
    }
  

    
    
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
            java.util.logging.Logger.getLogger(Confi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bloquearSonido;
    private javax.swing.JButton btanterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
