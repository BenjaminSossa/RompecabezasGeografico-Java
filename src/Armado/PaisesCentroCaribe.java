package Armado;
import inicio.Confi;
import inicio.PartesDeAmerica;
import inicio.SeleccionarMapa;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class PaisesCentroCaribe extends javax.swing.JFrame {
      int poaX, poaY;
     int piezasColocadasCorrectamente = 0;
     
     private boolean sonidoActivo = true; // Variable de control para el sonido
      Confi confi = new Confi();
     
    public PaisesCentroCaribe() {
        initComponents();
         setLocationRelativeTo(null);
        setResizable(Boolean.FALSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btanterior = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        p3 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        p12 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p13 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        Espacio1 = new javax.swing.JLabel();
        Espacio2 = new javax.swing.JLabel();
        Espacio3 = new javax.swing.JLabel();
        Espacio4 = new javax.swing.JLabel();
        Espacio5 = new javax.swing.JLabel();
        Espacio6 = new javax.swing.JLabel();
        Espacio7 = new javax.swing.JLabel();
        Espacio8 = new javax.swing.JLabel();
        Espacio9 = new javax.swing.JLabel();
        Espacio10 = new javax.swing.JLabel();
        Espacio11 = new javax.swing.JLabel();
        Espacio12 = new javax.swing.JLabel();
        Espacio13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MapaCentroAmerica = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        btanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btanterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 800, 150, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comprobar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 800, 150, 50));

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/BAHAMAS-removebg-preview.png"))); // NOI18N
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
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 650, 220, 200));

        p9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/Captura_de_pantalla_2024-10-23_223435-removebg-preview.png"))); // NOI18N
        p9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p9MouseDragged(evt);
            }
        });
        p9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p9MouseReleased(evt);
            }
        });
        jPanel1.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 370, -1, 120));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/Captura_de_pantalla_2024-10-23_223511-removebg-preview.png"))); // NOI18N
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
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 80, 80));

        p11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/GUATEMALA-removebg-preview.png"))); // NOI18N
        p11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p11MouseDragged(evt);
            }
        });
        p11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p11MouseReleased(evt);
            }
        });
        jPanel1.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 620, 130, 130));

        p12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/JAMAICA-removebg-preview.png"))); // NOI18N
        p12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p12MouseDragged(evt);
            }
        });
        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p12MouseReleased(evt);
            }
        });
        jPanel1.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 860, 80, 40));

        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/R_DOMINICANA-removebg-preview.png"))); // NOI18N
        p7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p7MouseDragged(evt);
            }
        });
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p7MouseReleased(evt);
            }
        });
        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, 120, 80));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/costa_rica.png"))); // NOI18N
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
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 140, 130, 120));

        p10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/cuba-removebg-preview.png"))); // NOI18N
        p10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p10MouseDragged(evt);
            }
        });
        p10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p10MouseReleased(evt);
            }
        });
        jPanel1.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 340, 130));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/haiti-removebg-preview.png"))); // NOI18N
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
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 270, 120, 80));

        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/nicaragua-removebg-preview.png"))); // NOI18N
        p8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p8MouseDragged(evt);
            }
        });
        p8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p8MouseReleased(evt);
            }
        });
        jPanel1.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 200, -1, 150));

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/p_rico-removebg-preview.png"))); // NOI18N
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
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 160, 100, 20));

        p13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/salvador-removebg-preview.png"))); // NOI18N
        p13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p13MouseDragged(evt);
            }
        });
        p13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p13MouseReleased(evt);
            }
        });
        jPanel1.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 790, 90, 50));

        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/panama-removebg-preview (1).png"))); // NOI18N
        p6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p6MouseDragged(evt);
            }
        });
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p6MouseReleased(evt);
            }
        });
        jPanel1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, 200, 100));

        Espacio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 429, -1, -1));

        Espacio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 382, -1, -1));

        Espacio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 247, -1, -1));

        Espacio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 398, -1, -1));

        Espacio5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 663, -1, -1));

        Espacio6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 701, -1, -1));

        Espacio7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 387, -1, -1));

        Espacio8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 543, -1, -1));

        Espacio9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 496, -1, -1));

        Espacio10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 314, -1, -1));

        Espacio11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 474, -1, 20));

        Espacio12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 406, -1, -1));

        Espacio13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel1.add(Espacio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 536, -1, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 107, 31));
        jLabel1.setText("Centro America");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 440, 50));

        MapaCentroAmerica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/centro/sin fondo/sin fondo 2/SIN FONDO 3/Centro amrica y el caribe1.png"))); // NOI18N
        jPanel1.add(MapaCentroAmerica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 120, 1160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo__2_-removebg-preview (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -20, 770, 150));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo (3) (1).jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanteriorActionPerformed
        PartesDeAmerica secm = new PartesDeAmerica ();
        secm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btanteriorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
verificarTodasLasPiezas();

    // Verificar si las piezas colocadas correctamente son menos de 23
    if (piezasColocadasCorrectamente < 23) {
        JOptionPane.showMessageDialog(this, "Aún no se han colocado todas las piezas correctamente.");
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void p6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p6.getX() + deltaX;
          int newLabelY = p6.getY() + deltaY;
          p6.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p6MouseDragged

    private void p7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p7.getX() + deltaX;
          int newLabelY = p7.getY() + deltaY;
          p7.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p7MouseDragged

    private void p8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p8.getX() + deltaX;
          int newLabelY = p8.getY() + deltaY;
          p8.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p8MouseDragged

    private void p9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p9.getX() + deltaX;
          int newLabelY = p9.getY() + deltaY;
          p9.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p9MouseDragged

    private void p10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p10.getX() + deltaX;
          int newLabelY = p10.getY() + deltaY;
          p10.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p10MouseDragged

    private void p11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p11.getX() + deltaX;
          int newLabelY = p11.getY() + deltaY;
          p11.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p11MouseDragged

    private void p12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p12.getX() + deltaX;
          int newLabelY = p12.getY() + deltaY;
          p12.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p12MouseDragged

    private void p13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p13.getX() + deltaX;
          int newLabelY = p13.getY() + deltaY;
          p13.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p13MouseDragged

    private void p1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MousePressed
         poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\belize.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p1MousePressed

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\haiti.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p2MousePressed

    private void p3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\bahamas.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p3MousePressed

    private void p4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\Puerto Rico.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p4MousePressed

    private void p5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\costa_rica.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p5MousePressed

    private void p6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\panama.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p6MousePressed

    private void p7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\dominican_republic.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p7MousePressed

    private void p8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\nicaragua.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p8MousePressed

    private void p9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\honduras.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p9MousePressed

    private void p10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\cuba.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p10MousePressed

    private void p11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\guatemala.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p11MousePressed

    private void p12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\jamaica.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p12MousePressed

    private void p13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geography\\centro america\\Transformaciones\\salvador.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p13MousePressed

    
    
    
    
    
    
    
    
    
    
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
verificarTodasLasPiezas();
    }//GEN-LAST:event_p1MouseReleased

    private void p2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseReleased
        if (evt.getComponent().getBounds().intersects(Espacio2.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if(icono1.getDescription().equals(rutaIcono)){
        int x = Espacio2.getX() + (Espacio2.getWidth() / 2) - (p2.getWidth() / 2);
        int y = Espacio2.getY() + (Espacio2.getHeight() / 2) - (p2.getHeight() / 2);
        p2.setLocation(x, y);
    }
}
         verificarTodasLasPiezas();
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
        int x = Espacio4.getX() + (Espacio4.getWidth() / 2) - (p4.getWidth() / 2);
        int y = Espacio4.getY() + (Espacio4.getHeight() / 2) - (p4.getHeight() / 2);
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

    private void p6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseReleased
        if (evt.getComponent().getBounds().intersects(Espacio6.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio6.getX()+ (Espacio6.getWidth() / 2) - (p6.getWidth() / 2);
           int y = Espacio6.getY() + (Espacio6.getHeight() / 2) - (p6.getHeight() / 2);

            p6.setLocation(x, y);
        }
    }
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p6MouseReleased

    private void p7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseReleased
       if (evt.getComponent().getBounds().intersects(Espacio7.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if(icono1.getDescription().equals(rutaIcono)){
        int x = Espacio7.getX() + (Espacio7.getWidth() / 2) - (p7.getWidth() / 2);
        int y = Espacio7.getY() + (Espacio7.getHeight() / 2) - (p7.getHeight() / 2);
        p7.setLocation(x, y);
    }
}
         verificarTodasLasPiezas();
    }//GEN-LAST:event_p7MouseReleased

    private void p8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MouseReleased
        if (evt.getComponent().getBounds().intersects(Espacio8.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio8.getX()+ (Espacio8.getWidth() / 2) - (p8.getWidth() / 2);
            int y = Espacio8.getY()+ (Espacio8.getWidth() / 2) - (p8.getWidth() / 2);
            p8.setLocation(x, y);
        }
    }
         verificarTodasLasPiezas();
    }//GEN-LAST:event_p8MouseReleased

    private void p9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MouseReleased
       if (evt.getComponent().getBounds().intersects(Espacio9.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if(icono1.getDescription().equals(rutaIcono)){
        int x = Espacio9.getX() + (Espacio9.getWidth() / 2) - (p9.getWidth() / 2);
        int y = Espacio9.getY() + (Espacio9.getHeight() / 2) - (p9.getHeight() / 2);
        p9.setLocation(x, y);
    }
}
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p9MouseReleased

    private void p10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MouseReleased
       if (evt.getComponent().getBounds().intersects(Espacio10.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if(icono1.getDescription().equals(rutaIcono)){
        int x = Espacio10.getX() + (Espacio10.getWidth() / 2) - (p10.getWidth() / 2);
        int y = Espacio10.getY() + (Espacio10.getHeight() / 2) - (p10.getHeight() / 2);
        p10.setLocation(x, y);
    }
}
          verificarTodasLasPiezas();
    }//GEN-LAST:event_p10MouseReleased

    private void p11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11MouseReleased
        if (evt.getComponent().getBounds().intersects(Espacio11.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio11.getX()+ (Espacio11.getWidth() / 2) - (p11.getWidth() / 2);
            int y = Espacio11.getY()+ (Espacio11.getWidth() / 2) - (p11.getWidth() / 2);
            p11.setLocation(x, y);
        }
    }
verificarTodasLasPiezas();
    }//GEN-LAST:event_p11MouseReleased

    private void p12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MouseReleased
       if (evt.getComponent().getBounds().intersects(Espacio12.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if(icono1.getDescription().equals(rutaIcono)){
        int x = Espacio12.getX() + (Espacio12.getWidth() / 2) - (p12.getWidth() / 2);
        int y = Espacio12.getY() + (Espacio12.getHeight() / 2) - (p12.getHeight() / 2);
        p12.setLocation(x, y);
    }
}
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p12MouseReleased

    private void p13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MouseReleased
         if (evt.getComponent().getBounds().intersects(Espacio13.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if(icono1.getDescription().equals(rutaIcono)){
        int x = Espacio13.getX() + (Espacio13.getWidth() / 2) - (p13.getWidth() / 2);
        int y = Espacio13.getY() + (Espacio13.getHeight() / 2) - (p13.getHeight() / 2);
        p13.setLocation(x, y);
    }
}
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p13MouseReleased

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

    // Continuar con las demás piezas hasta la pieza 23
    // Verificar si la pieza 6 está en su espacio correcto (Espacio6)
    if (p6.getBounds().intersects(Espacio6.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 7 está en su espacio correcto (Espacio7)
    if (p7.getBounds().intersects(Espacio7.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 8 está en su espacio correcto (Espacio8)
    if (p8.getBounds().intersects(Espacio8.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 9 está en su espacio correcto (Espacio9)
    if (p9.getBounds().intersects(Espacio9.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 10 está en su espacio correcto (Espacio10)
    if (p10.getBounds().intersects(Espacio10.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 11 está en su espacio correcto (Espacio11)
    if (p11.getBounds().intersects(Espacio11.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 12 está en su espacio correcto (Espacio12)
    if (p12.getBounds().intersects(Espacio12.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 13 está en su espacio correcto (Espacio13)
    if (p13.getBounds().intersects(Espacio13.getBounds())) {
        piezasColocadasCorrectamente++;
    }
    // Solo mostrar el mensaje cuando todas las piezas están colocadas correctamente
   
    if (piezasColocadasCorrectamente == 13) {
         String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\felicidades.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
        JOptionPane.showMessageDialog(this, "¡Todas las piezas están en su posición correcta!");
    }
}
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
            java.util.logging.Logger.getLogger(PaisesCentroCaribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaisesCentroCaribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaisesCentroCaribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaisesCentroCaribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaisesCentroCaribe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espacio1;
    private javax.swing.JLabel Espacio10;
    private javax.swing.JLabel Espacio11;
    private javax.swing.JLabel Espacio12;
    private javax.swing.JLabel Espacio13;
    private javax.swing.JLabel Espacio2;
    private javax.swing.JLabel Espacio3;
    private javax.swing.JLabel Espacio4;
    private javax.swing.JLabel Espacio5;
    private javax.swing.JLabel Espacio6;
    private javax.swing.JLabel Espacio7;
    private javax.swing.JLabel Espacio8;
    private javax.swing.JLabel Espacio9;
    private javax.swing.JLabel MapaCentroAmerica;
    private javax.swing.JButton btanterior;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p12;
    private javax.swing.JLabel p13;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
