
package Armado;
import inicio.SeleccionarMapa;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import inicio.Confi;

public class NorteAmerica extends javax.swing.JFrame {
 int poaX, poaY;
 int piezasColocadasCorrectamente = 0;
     private boolean sonidoActivo = true; // Variable de control para el sonido
      Confi confi = new Confi();


 
    public NorteAmerica() {
       initComponents();
         setLocationRelativeTo(null);
        setResizable(Boolean.FALSE);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        Espacio1 = new javax.swing.JLabel();
        Espacio2 = new javax.swing.JLabel();
        Espacio4 = new javax.swing.JLabel();
        Espacio5 = new javax.swing.JLabel();
        Espacio3 = new javax.swing.JLabel();
        Mapa = new javax.swing.JLabel();
        SelecMapa = new javax.swing.JButton();
        Comprobar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/northamerica/alaska.png"))); // NOI18N
        p1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p1MouseDragged(evt);
            }
        });
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p1MouseReleased(evt);
            }
        });
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, -1, -1));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/northamerica/canada.png"))); // NOI18N
        p2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p2MouseDragged(evt);
            }
        });
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p2MouseReleased(evt);
            }
        });
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, -1, -1));

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/northamerica/mexico.png"))); // NOI18N
        p3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p3MouseDragged(evt);
            }
        });
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p3MouseReleased(evt);
            }
        });
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, -1, -1));

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/northamerica/usa.png"))); // NOI18N
        p4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p4MouseDragged(evt);
            }
        });
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p4MouseReleased(evt);
            }
        });
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/northamerica/greenland.png"))); // NOI18N
        p5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p5MouseDragged(evt);
            }
        });
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p5MouseReleased(evt);
            }
        });
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 440, -1, -1));

        Espacio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 276, -1, -1));

        Espacio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 394, -1, -1));

        Espacio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 589, -1, 20));

        Espacio5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, 20));

        Espacio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 624, -1, -1));

        Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Norte Americaaaaaaaaaaaaaaaaaaaa.jpg"))); // NOI18N
        Mapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0), 10));
        jPanel1.add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 179, 500, 540));

        SelecMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        SelecMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecMapaActionPerformed(evt);
            }
        });
        jPanel1.add(SelecMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 790, 150, 50));

        Comprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comprobar.png"))); // NOI18N
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });
        jPanel1.add(Comprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 790, 150, 50));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 62)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 107, 31));
        jLabel3.setText("Norte America");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 420, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Barra.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 770, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo (4) (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 1380, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseDragged
             int deltaX = evt.getX()- poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p1.getX() + deltaX;
          int newLabelY = p1.getY() + deltaY;
          p1.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p1MouseDragged

    private void p2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p2.getX() + deltaX;
          int newLabelY = p2.getY() + deltaY;
          p2.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p2MouseDragged

    private void p3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p3.getX() + deltaX;
          int newLabelY = p3.getY() + deltaY;
          p3.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p3MouseDragged

    private void p4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p4.getX() + deltaX;
          int newLabelY = p4.getY() + deltaY;
          p4.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p4MouseDragged

    private void p5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseDragged
         int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p5.getX() + deltaX;
          int newLabelY = p5.getY() + deltaY;
          p5.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p5MouseDragged

    private void p1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MousePressed
         poaX = evt.getX();
          poaY=evt.getY();
          String rutaSonido = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\northamerica\\Audio OGG a WAV\\alaska.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p1MousePressed

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          String rutaSonido = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\northamerica\\Audio OGG a WAV\\canada.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p2MousePressed

    private void p3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MousePressed
         poaX = evt.getX();
          poaY=evt.getY();
          String rutaSonido = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\northamerica\\Audio OGG a WAV\\mexico.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p3MousePressed

    private void p4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          String rutaSonido = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\northamerica\\Audio OGG a WAV\\usa.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p4MousePressed

    private void p5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MousePressed
         poaX = evt.getX();
          poaY=evt.getY();
          String rutaSonido = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\northamerica\\Audio OGG a WAV\\greenland.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p5MousePressed

    private void p1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseReleased
  if (evt.getComponent().getBounds().intersects(Espacio1.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio1.getX()+ (Espacio1.getWidth() / 2) - (p1.getWidth() / 2);
            int y = Espacio1.getY()+ (Espacio1.getHeight() / 2) - (p1.getHeight() / 2);
            p1.setLocation(x, y);
        }
    }
  
  verificarTodasLasPiezas();  // Llamar a la función para verificar todas las posiciones
    }//GEN-LAST:event_p1MouseReleased

    private void SelecMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecMapaActionPerformed
        SeleccionarMapa secm = new SeleccionarMapa();
        secm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SelecMapaActionPerformed

    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed
  verificarTodasLasPiezas();

    // Verificar si las piezas colocadas correctamente son menos de 23
    if (piezasColocadasCorrectamente < 6) {
        JOptionPane.showMessageDialog(this, "Aún no se han colocado todas las piezas correctamente.");
        
    }
    }//GEN-LAST:event_ComprobarActionPerformed

    private void p2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseReleased
       
        if (evt.getComponent().getBounds().intersects(Espacio2.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio2.getX()+ (Espacio2.getWidth() / 2) - (p2.getWidth() / 2);
            int y = Espacio2.getY()+ (Espacio2.getWidth() / 2) - (p2.getWidth() / 2);
            p2.setLocation(x, y);
        }
}
verificarTodasLasPiezas();  // Llamar a la función para verificar todas las posiciones
    }//GEN-LAST:event_p2MouseReleased

    private void p3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseReleased
           if (evt.getComponent().getBounds().intersects(Espacio3.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio3.getX()+ (Espacio3.getWidth() / 2) - (p3.getWidth() / 2);
            int y = Espacio3.getY()+ (Espacio3.getWidth() / 2) - (p3.getWidth() / 2);
            p3.setLocation(x, y);
        }
}
  verificarTodasLasPiezas();
    }//GEN-LAST:event_p3MouseReleased

    private void p4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseReleased
                if (evt.getComponent().getBounds().intersects(Espacio4.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio4.getX()+ (Espacio4.getWidth() / 2) - (p4.getWidth() / 2);
            int y = Espacio4.getY()+ (Espacio4.getWidth() / 2) - (p4.getWidth() / 2);
            p4.setLocation(x, y);
        }
}
verificarTodasLasPiezas();
    }//GEN-LAST:event_p4MouseReleased

    private void p5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseReleased
             if (evt.getComponent().getBounds().intersects(Espacio5.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio5.getX()+ (Espacio5.getWidth() / 2) - (p5.getWidth() / 2);
            int y = Espacio5.getY()+ (Espacio5.getWidth() / 2) - (p5.getWidth() / 2);
            p5.setLocation(x, y);
        }
             }
             
    verificarTodasLasPiezas();         
    }//GEN-LAST:event_p5MouseReleased
 
 public void reproducirSonido(String rutaArchivo) {
    if (!Confi.isSonidoActivado()) return; // Accede de manera estática a la variable

    try {
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(rutaArchivo));
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.start(); // Reproducir el sonido
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    
    

    private void verificarTodasLasPiezas() {
    // Resetear el contador de piezas colocadas correctamente
    piezasColocadasCorrectamente = 0;

    // Verificar si la pieza 1 está en su espacio correcto (Espacio1)
    if (p1.getBounds().intersects(Espacio1.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 2 está en su espacio correcto (Espacio2)
    if (p2.getBounds().intersects(Espacio2.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 3 está en su espacio correcto (Espacio3)
    if (p3.getBounds().intersects(Espacio3.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 4 está en su espacio correcto (Espacio4)
    if (p4.getBounds().intersects(Espacio4.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 5 está en su espacio correcto (Espacio5)
    if (p5.getBounds().intersects(Espacio5.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Solo mostrar el mensaje cuando todas las piezas están colocadas correctamente
    if (piezasColocadasCorrectamente == 5) {
         String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\felicidades.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
        JOptionPane.showMessageDialog(this, "¡Todas las piezas están en su posición correcta!");
       
    }
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
            java.util.logging.Logger.getLogger(NorteAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NorteAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NorteAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NorteAmerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NorteAmerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprobar;
    private javax.swing.JLabel Espacio1;
    private javax.swing.JLabel Espacio2;
    private javax.swing.JLabel Espacio3;
    private javax.swing.JLabel Espacio4;
    private javax.swing.JLabel Espacio5;
    private javax.swing.JLabel Mapa;
    private javax.swing.JButton SelecMapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    // End of variables declaration//GEN-END:variables
}
