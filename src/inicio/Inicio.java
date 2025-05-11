package inicio;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;




public class Inicio extends javax.swing.JFrame {
            private Clip clip; // Variable para manejar la música de fondo

        private boolean musicaFondoActivada = true; // Variable de control para la música de fondo

    
      private boolean sonidoActivo = true; // Variable de control para el sonido
      Confi confi = new Confi();
    
    
    public Inicio() {
        initComponents();
        
        //los sigeuntes do comndos hacen que la ventana no se puedan: cambiar el tamno(el 2°) y que location hace que la ventana aparesca en el medio 
        setLocationRelativeTo(null);
        setResizable(Boolean.FALSE);
        
   if (musicaFondoActivada) {
          //  String rutaSonido = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\musica de fondo\\musicadefondo.wav";
         //   reproducirMusicaFondo(rutaSonido); // Reproducir la música de fondo
        }   
   
   
        
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btselecionarmapa = new javax.swing.JButton();
        btcomojugar = new javax.swing.JButton();
        btconf = new javax.swing.JButton();
        btcreditos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 239, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("ItalicC", 1, 53)); // NOI18N
        jLabel1.setText("Rompecabeza ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 520, 90));

        btselecionarmapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selec.png"))); // NOI18N
        btselecionarmapa.setText("Selecionar mapa");
        btselecionarmapa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btselecionarmapa.setContentAreaFilled(false);
        btselecionarmapa.setFocusPainted(false);
        btselecionarmapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btselecionarmapaActionPerformed(evt);
            }
        });
        jPanel1.add(btselecionarmapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 260, 271));

        btcomojugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comojugar.png"))); // NOI18N
        btcomojugar.setText("Como Juagr");
        btcomojugar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btcomojugar.setContentAreaFilled(false);
        btcomojugar.setFocusPainted(false);
        btcomojugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcomojugarActionPerformed(evt);
            }
        });
        jPanel1.add(btcomojugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 260, 271));

        btconf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion.png"))); // NOI18N
        btconf.setText("Configuracion");
        btconf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btconf.setContentAreaFilled(false);
        btconf.setFocusPainted(false);
        btconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfActionPerformed(evt);
            }
        });
        jPanel1.add(btconf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 260, 271));

        btcreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/creditos.png"))); // NOI18N
        btcreditos.setText("Creditos");
        btcreditos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btcreditos.setFocusPainted(false);
        btcreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcreditosActionPerformed(evt);
            }
        });
        jPanel1.add(btcreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 260, 271));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1089, 34, -1, -1));

        jLabel4.setFont(new java.awt.Font("ItalicT", 0, 55)); // NOI18N
        jLabel4.setText("Geografico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Barra.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Barra.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 860, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btselecionarmapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btselecionarmapaActionPerformed
        // TODO add your handling code here:
        SeleccionarMapa secm = new SeleccionarMapa();
        secm.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btselecionarmapaActionPerformed

    private void btcomojugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcomojugarActionPerformed
ComoJugarPag1 secm = new ComoJugarPag1();
        secm.setVisible(true);
        this.dispose();    }//GEN-LAST:event_btcomojugarActionPerformed

    private void btconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfActionPerformed
        Confi secm = new Confi();
        secm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btconfActionPerformed

    private void btcreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcreditosActionPerformed
        Creditos secm = new Creditos();
        secm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btcreditosActionPerformed

    
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
    
     
     ////Para la musica de
     
     
     
     
     
      
     
     
     
    public void reproducirMusicaFondo(String rutaArchivo) {
        if (!musicaFondoActivada) return; // Solo reproducir si la música de fondo está activada

        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(rutaArchivo));
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Hacer que la música se repita continuamente
            clip.start(); // Comienza la música
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para detener la música de fondo
    public void detenerMusicaFondo() {
        if (clip != null && clip.isRunning()) {
            clip.stop(); // Detener la música
        }
    }

    // Método para cambiar el estado de la música de fondo
    public void setMusicaFondoActivada(boolean musicaFondoActivada) {
        this.musicaFondoActivada = musicaFondoActivada;
        if (musicaFondoActivada) {
            reproducirMusicaFondo("C:\\path\\to\\your\\music.wav"); // Vuelve a reproducir si se activa
        } else {
            detenerMusicaFondo(); // Detener si se desactiva
        }
    }

    // Getter para saber si la música de fondo está activada
    public boolean isMusicaFondoActivada() {
        return musicaFondoActivada;
    }

    // Getter para saber si el sonido de las piezas está activado
    public boolean isSonidoActivo() {
        return sonidoActivo;
    }

    // Setter para cambiar el estado del sonido de las piezas
    public void setSonidoActivo(boolean sonidoActivo) {
        this.sonidoActivo = sonidoActivo;
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcomojugar;
    private javax.swing.JButton btconf;
    private javax.swing.JButton btcreditos;
    private javax.swing.JButton btselecionarmapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
