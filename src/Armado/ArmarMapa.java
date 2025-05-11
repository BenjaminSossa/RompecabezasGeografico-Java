package Armado;

import inicio.Confi;
import inicio.SeleccionarMapa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AlumnosET20
 */
public class ArmarMapa extends javax.swing.JFrame {

   int poaX, poaY;

     int piezasColocadasCorrectamente = 0;
     
     private boolean sonidoActivo = true; // Variable de control para el sonido
      Confi confi = new Confi();

   
    public ArmarMapa() {
        initComponents();
         setLocationRelativeTo(null);
        setResizable(Boolean.FALSE);
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btanterior = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        p12 = new javax.swing.JLabel();
        p13 = new javax.swing.JLabel();
        p14 = new javax.swing.JLabel();
        p15 = new javax.swing.JLabel();
        p16 = new javax.swing.JLabel();
        p17 = new javax.swing.JLabel();
        p18 = new javax.swing.JLabel();
        p19 = new javax.swing.JLabel();
        p20 = new javax.swing.JLabel();
        p21 = new javax.swing.JLabel();
        p22 = new javax.swing.JLabel();
        p23 = new javax.swing.JLabel();
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
        Espacio14 = new javax.swing.JLabel();
        Espacio15 = new javax.swing.JLabel();
        Espacio16 = new javax.swing.JLabel();
        Espacio17 = new javax.swing.JLabel();
        Espacio18 = new javax.swing.JLabel();
        Espacio19 = new javax.swing.JLabel();
        Espacio20 = new javax.swing.JLabel();
        Espacio21 = new javax.swing.JLabel();
        Espacio22 = new javax.swing.JLabel();
        Espacio23 = new javax.swing.JLabel();
        ArgentinaSil = new javax.swing.JLabel();
        Comprobar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(241, 239, 234));
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        btanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanteriorActionPerformed(evt);
            }
        });
        jPanel4.add(btanterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 930, 150, 50));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/buenos_aires-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ampliacion de provincias/catamarca.png"))); // NOI18N
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
        jPanel4.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, -1));

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/chaco-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, -1));

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/chubut-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, -1, -1));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/cordoba-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/corrientes-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, -1, -1));

        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/entre_rios-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, -1, -1));

        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/formosa-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 210, -1, -1));

        p9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/jujuy-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        p10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/la_pampa-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        p11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/la_rioja-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, -1, -1));

        p12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/mendoza-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 310, -1, -1));

        p13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/misiones-removebg-preview.png"))); // NOI18N
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
        jPanel4.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, -1, -1));

        p14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/neuquen-removebg-preview.png"))); // NOI18N
        p14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p14MouseDragged(evt);
            }
        });
        p14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p14MouseReleased(evt);
            }
        });
        jPanel4.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, -1, -1));

        p15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/rio_negro-removebg-preview.png"))); // NOI18N
        p15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p15MouseDragged(evt);
            }
        });
        p15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p15MouseReleased(evt);
            }
        });
        jPanel4.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, -1, -1));

        p16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/salta-removebg-preview.png"))); // NOI18N
        p16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p16MouseDragged(evt);
            }
        });
        p16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p16MouseReleased(evt);
            }
        });
        jPanel4.add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 470, -1, -1));

        p17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/san_juan-removebg-preview.png"))); // NOI18N
        p17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p17MouseDragged(evt);
            }
        });
        p17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p17MouseReleased(evt);
            }
        });
        jPanel4.add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, -1, -1));

        p18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/san_luis-removebg-preview.png"))); // NOI18N
        p18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p18MouseDragged(evt);
            }
        });
        p18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p18MouseReleased(evt);
            }
        });
        jPanel4.add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, -1, -1));

        p19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/santa_cruz-removebg-preview.png"))); // NOI18N
        p19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p19MouseDragged(evt);
            }
        });
        p19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p19MouseReleased(evt);
            }
        });
        jPanel4.add(p19, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, -1, -1));

        p20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/santa_fe-removebg-preview.png"))); // NOI18N
        p20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p20MouseDragged(evt);
            }
        });
        p20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p20MouseReleased(evt);
            }
        });
        jPanel4.add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 560, -1, -1));

        p21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/santiago_del_estero-removebg-preview.png"))); // NOI18N
        p21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p21MouseDragged(evt);
            }
        });
        p21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p21MouseReleased(evt);
            }
        });
        jPanel4.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 800, -1, -1));

        p22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/tierra_del_fuego-removebg-preview.png"))); // NOI18N
        p22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p22MouseDragged(evt);
            }
        });
        p22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p22MouseReleased(evt);
            }
        });
        jPanel4.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 790, 230, 140));

        p23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Argentina ya cortada/tucuman-removebg-preview.png"))); // NOI18N
        p23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p23MouseDragged(evt);
            }
        });
        p23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                p23MouseReleased(evt);
            }
        });
        jPanel4.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 820, -1, 30));

        Espacio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 453, 20, 20));

        Espacio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 250, 20, 20));

        Espacio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 239, -1, 20));

        Espacio4.setForeground(new java.awt.Color(255, 0, 51));
        Espacio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 610, 20, -1));

        Espacio5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 332, 20, 20));

        Espacio6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 294, 20, 20));

        Espacio7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 340, 20, 20));

        Espacio8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 202, 20, 20));

        Espacio9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 174, 20, -1));

        Espacio10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 455, 20, -1));

        Espacio11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 305, 20, 20));

        Espacio12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 391, -1, 30));

        Espacio13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 244, 20, 20));

        Espacio14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio14, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 463, 20, 20));

        Espacio15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio15, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 530, 20, 20));

        Espacio16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 206, 20, 20));

        Espacio17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio17, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 312, 20, 20));

        Espacio18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 368, 20, 20));

        Espacio19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 20, 20));

        Espacio20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio20, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 308, -1, 20));

        Espacio21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio21, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 252, 20, 20));

        Espacio22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio22, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 793, 20, 20));

        Espacio23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        jPanel4.add(Espacio23, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 250, 20, 20));

        ArgentinaSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ampliacion de provincias/argentina.png"))); // NOI18N
        ArgentinaSil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 151, 73), 10));
        jPanel4.add(ArgentinaSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 570, 780));

        Comprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comprobar.png"))); // NOI18N
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });
        jPanel4.add(Comprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 930, 150, 50));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 62)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 107, 31));
        jLabel2.setText("Argentina");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 330, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Barra.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 490, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo (4) (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1570, 1010));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanteriorActionPerformed
      SeleccionarMapa secm = new SeleccionarMapa ();
        secm.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_btanteriorActionPerformed

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

    private void p14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p14MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p14.getX() + deltaX;
          int newLabelY = p14.getY() + deltaY;
          p14.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p14MouseDragged

    private void p15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p15MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p15.getX() + deltaX;
          int newLabelY = p15.getY() + deltaY;
          p15.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p15MouseDragged

    private void p16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p16MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p16.getX() + deltaX;
          int newLabelY = p16.getY() + deltaY;
          p16.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p16MouseDragged

    private void p17MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p17MouseDragged
      int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p17.getX() + deltaX;
          int newLabelY = p17.getY() + deltaY;
          p17.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p17MouseDragged

    private void p18MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p18MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p18.getX() + deltaX;
          int newLabelY = p18.getY() + deltaY;
          p18.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p18MouseDragged

    private void p19MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p19MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p19.getX() + deltaX;
          int newLabelY = p19.getY() + deltaY;
          p19.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p19MouseDragged

    private void p20MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p20MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p20.getX() + deltaX;
          int newLabelY = p20.getY() + deltaY;
          p20.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p20MouseDragged

    private void p21MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p21MouseDragged
        int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p21.getX() + deltaX;
          int newLabelY = p21.getY() + deltaY;
          p21.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p21MouseDragged

    private void p22MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p22MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX =  p22.getX() + deltaX;
          int newLabelY =  p22.getY() + deltaY;
           p22.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p22MouseDragged

    private void p23MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p23MouseDragged
       int deltaX = evt.getX() - poaX;
          int deltaY = evt.getY() - poaY;
          
          int newLabelX = p23.getX() + deltaX;
          int newLabelY = p23.getY() + deltaY;
          p23.setLocation(newLabelX, newLabelY);
    }//GEN-LAST:event_p23MouseDragged

    private void p1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Buenos Aires.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p1MousePressed

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
      poaX = evt.getX();
          poaY=evt.getY();
          
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Catamarca.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p2MousePressed

    private void p3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Chaco.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p3MousePressed

    private void p4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MousePressed
      poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Chubut.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p4MousePressed

    private void p5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MousePressed
      poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Cordoba.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p5MousePressed

    private void p6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MousePressed
      poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Corientes.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p6MousePressed

    private void p7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MousePressed
      poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Entre Rios.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p7MousePressed

    private void p8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Formoza.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p8MousePressed

    private void p9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Jujuy.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p9MousePressed

    private void p10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\La Pampa.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p10MousePressed

    private void p11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p11MousePressed
     poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\La Rioja.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p11MousePressed

    private void p12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p12MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Mendoza.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p12MousePressed

    private void p13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MousePressed
      poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Misiones.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p13MousePressed

    private void p14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p14MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Neuquen.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p14MousePressed

    private void p15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p15MousePressed
        poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Rio Negro.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p15MousePressed

    private void p16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p16MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Salta.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p16MousePressed

    private void p17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p17MousePressed
        poaX = evt.getX();
          poaY=evt.getY(); String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\San-Juan.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p17MousePressed

    private void p18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p18MousePressed
        poaX = evt.getX();
          poaY=evt.getY(); String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\San-Luis.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p18MousePressed

    private void p19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p19MousePressed
       poaX = evt.getX();
          poaY=evt.getY(); String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Santa-Cruz.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p19MousePressed

    private void p20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p20MousePressed
       poaX = evt.getX();
          poaY=evt.getY();
            poaY=evt.getY(); String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Santa-Fe.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p20MousePressed

    private void p21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p21MousePressed
      poaX = evt.getX();
          poaY=evt.getY(); String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Santiago-Del-Estero.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p21MousePressed

    private void p22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p22MousePressed
       poaX = evt.getX();
          poaY=evt.getY(); String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Tierra-Del-Fuego.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p22MousePressed

    private void p23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p23MousePressed
      poaX = evt.getX();
          poaY=evt.getY(); String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\wov\\Tucuman.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
    }//GEN-LAST:event_p23MousePressed

    
    //--------------------------------------Colición----------------------------------------------------------//
    
    private void provinciaseMouseReleased(java.awt.event.MouseEvent evt, JLabel provincias) {
    // Array de los espacios donde se pueden ubicar las piezas
    JLabel[] espacios = {Espacio1, Espacio2, Espacio3, Espacio4, Espacio5, Espacio6, Espacio7, Espacio8, Espacio9, Espacio10, 
                         Espacio11, Espacio12, Espacio13, Espacio14, Espacio15, Espacio16, Espacio17, Espacio18, Espacio19, 
                         Espacio20, Espacio21, Espacio22, Espacio23};

    // Ruta de la nueva imagen que se asignará cuando la pieza encaje
    String rutaNuevaImagen = "C:\\Users\\AlumnosET20\\Documents\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\geo_country\\argentina\\buenos_aires.png";
    
    // Verificar si la pieza intersecta con algún espacio
    for (JLabel espacio : espacios) {
        if (evt.getComponent().getBounds().intersects(espacio.getBounds())) {
            // Ajustar la posición de la pieza al centro del espacio
            
            int x = espacio.getX() + (espacio.getWidth() / 2) - (provincias.getWidth() / 2);
            int y = espacio.getY() + (espacio.getHeight() / 2) - (provincias.getHeight() / 2);
            provincias.setLocation(x, y);

           ImageIcon nuevaImagen = new ImageIcon("C:\\Users\\ET20 - Alumno\\Documents\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\Ampliacion de provincias\\buenos_aires.png");
            provincias.setIcon(nuevaImagen);
            
            break; // Salir del bucle una vez que se encastra en un espacio
        }
    }
}

    
    
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
            int x = Espacio2.getX()+ (Espacio2.getWidth() / 2) - (p2.getWidth() / 2);
            int y = Espacio2.getY()+ (Espacio2.getWidth() / 2) - (p2.getWidth() / 2);
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

    private void p6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseReleased
        if (evt.getComponent().getBounds().intersects(Espacio6.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio6.getX()+ (Espacio6.getWidth() / 2) - (p6.getWidth() / 2);
            int y = Espacio6.getY()+ (Espacio6.getWidth() / 2) - (p6.getWidth() / 2);
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
            int x = Espacio7.getX()+ (Espacio7.getWidth() / 2) - (p7.getWidth() / 2);
            int y = Espacio7.getY()+ (Espacio7.getWidth() / 2) - (p7.getWidth() / 2);
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
            int x = Espacio9.getX()+ (Espacio9.getWidth() / 2) - (p9.getWidth() / 2);
            int y = Espacio9.getY()+ (Espacio9.getWidth() / 2) - (p9.getWidth() / 2);
            p9.setLocation(x, y);
        }
    }
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p9MouseReleased

    private void p10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MouseReleased
          if (evt.getComponent().getBounds().intersects(Espacio10.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if (icono1.getDescription().equals(rutaIcono)) {
        int x = Espacio10.getX() + (Espacio10.getWidth() / 2) - (p10.getWidth() / 2);
        int y = Espacio10.getY() + (Espacio10.getHeight() / 2) - (p10.getHeight() / 2);
        p10.setLocation(x, y);
    }
    verificarTodasLasPiezas();}
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
            int x = Espacio12.getX()+ (Espacio12.getWidth() / 2) - (p12.getWidth() / 2);
            int y = Espacio12.getY()+ (Espacio12.getWidth() / 2) - (p12.getWidth() / 2);
            p12.setLocation(x, y);
        }
    }
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p12MouseReleased
//////////////////////
    private void p13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p13MouseReleased
         if (evt.getComponent().getBounds().intersects(Espacio13.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio13.getX()+ (Espacio13.getWidth() / 2) - (p13.getWidth() / 2);
            int y = Espacio13.getY()+ (Espacio13.getWidth() / 2) - (p13.getWidth() / 2);
            p13.setLocation(x, y);
        }
    }
         verificarTodasLasPiezas();
    }//GEN-LAST:event_p13MouseReleased

    private void p14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p14MouseReleased
          if (evt.getComponent().getBounds().intersects(Espacio14.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio14.getX()+ (Espacio14.getWidth() / 2) - (p14.getWidth() / 2);
            int y = Espacio14.getY()+ (Espacio14.getWidth() / 2) - (p14.getWidth() / 2);
            p14.setLocation(x, y);
        }
    }
          verificarTodasLasPiezas();
    }//GEN-LAST:event_p14MouseReleased

    private void p15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p15MouseReleased
         if (evt.getComponent().getBounds().intersects(Espacio15.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio15.getX()+ (Espacio15.getWidth() / 2) - (p15.getWidth() / 2);
            int y = Espacio15.getY()+ (Espacio15.getWidth() / 2) - (p15.getWidth() / 2);
            p15.setLocation(x, y);
        }
    }
         verificarTodasLasPiezas();
    }//GEN-LAST:event_p15MouseReleased

    private void p16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p16MouseReleased
      if (evt.getComponent().getBounds().intersects(Espacio16.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio16.getX()+ (Espacio16.getWidth() / 2) - (p16.getWidth() / 2);
            int y = Espacio16.getY()+ (Espacio16.getWidth() / 2) - (p16.getWidth() / 2);
            p16.setLocation(x, y);
        }
    }
      verificarTodasLasPiezas();
    }//GEN-LAST:event_p16MouseReleased

    private void p17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p17MouseReleased
        if (evt.getComponent().getBounds().intersects(Espacio17.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio17.getX()+ (Espacio17.getWidth() / 2) - (p17.getWidth() / 2);
            int y = Espacio17.getY()+ (Espacio17.getWidth() / 2) - (p17.getWidth() / 2);
            p17.setLocation(x, y);
        }
    }
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p17MouseReleased

    private void p18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p18MouseReleased
     if (evt.getComponent().getBounds().intersects(Espacio18.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio18.getX()+ (Espacio18.getWidth() / 2) - (p18.getWidth() / 2);
            int y = Espacio18.getY()+ (Espacio18.getWidth() / 2) - (p18.getWidth() / 2);
            p18.setLocation(x, y);
        }
    }
     verificarTodasLasPiezas();
    }//GEN-LAST:event_p18MouseReleased

    private void p19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p19MouseReleased
      if (evt.getComponent().getBounds().intersects(Espacio19.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio19.getX()+ (Espacio19.getWidth() / 2) - (p19.getWidth() / 2);
            int y = Espacio19.getY()+ (Espacio19.getWidth() / 2) - (p19.getWidth() / 2);
            p19.setLocation(x, y);
        }
    }
      verificarTodasLasPiezas();
    }//GEN-LAST:event_p19MouseReleased

    private void p20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p20MouseReleased
         if (evt.getComponent().getBounds().intersects(Espacio20.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio20.getX()+ (Espacio20.getWidth() / 2) - (p20.getWidth() / 2);
            int y = Espacio20.getY()+ (Espacio20.getWidth() / 2) - (p20.getWidth() / 2);
            p20.setLocation(x, y);
        }
    }
         verificarTodasLasPiezas();
    }//GEN-LAST:event_p20MouseReleased

    private void p21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p21MouseReleased
        if (evt.getComponent().getBounds().intersects(Espacio21.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio21.getX()+ (Espacio21.getWidth() / 2) - (p21.getWidth() / 2);
            int y = Espacio21.getY()+ (Espacio21.getWidth() / 2) - (p21.getWidth() / 2);
            p21.setLocation(x, y);
        }
    }
        verificarTodasLasPiezas();
    }//GEN-LAST:event_p21MouseReleased

    private void p22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p22MouseReleased
    if (evt.getComponent().getBounds().intersects(Espacio22.getBounds())) {
    String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
    ImageIcon icono1 = new ImageIcon(rutaIcono);
    if (icono1.getDescription().equals(rutaIcono)) {
        int x = Espacio22.getX() + (Espacio22.getWidth() / 2) - (p22.getWidth() / 2);
        int y = Espacio22.getY() + (Espacio22.getHeight() / 2) - (p22.getHeight() / 2);
        p22.setLocation(x, y);
    }}
    verificarTodasLasPiezas();

    }//GEN-LAST:event_p22MouseReleased

    private void p23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p23MouseReleased
         if (evt.getComponent().getBounds().intersects(Espacio23.getBounds())) {
        String rutaIcono = "C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\nombre.png";
        ImageIcon icono1 = new ImageIcon(rutaIcono);
        if(icono1.getDescription().equals(rutaIcono)){
            int x = Espacio23.getX()+ (Espacio23.getWidth() / 2) - (p23.getWidth() / 2);
            int y = Espacio23.getY()+ (Espacio23.getWidth() / 2) - (p23.getWidth() / 2);
            p23.setLocation(x, y);
        }
    }
         
         
           String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\AudiosArg\\Tierra-Del-Fuego.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
         
         verificarTodasLasPiezas();
    }//GEN-LAST:event_p23MouseReleased
/////////////////////////////                  VERIFICAR SI ESTA CORRECTO LA POSCION
    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed
      verificarTodasLasPiezas();

    // Verificar si las piezas colocadas correctamente son menos de 23
    if (piezasColocadasCorrectamente < 23) {
        JOptionPane.showMessageDialog(this, "Aún no se han colocado todas las piezas correctamente.");
    }

    }//GEN-LAST:event_ComprobarActionPerformed

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

    // Verificar si la pieza 14 está en su espacio correcto (Espacio14)
    if (p14.getBounds().intersects(Espacio14.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 15 está en su espacio correcto (Espacio15)
    if (p15.getBounds().intersects(Espacio15.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 16 está en su espacio correcto (Espacio16)
    if (p16.getBounds().intersects(Espacio16.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 17 está en su espacio correcto (Espacio17)
    if (p17.getBounds().intersects(Espacio17.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 18 está en su espacio correcto (Espacio18)
    if (p18.getBounds().intersects(Espacio18.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 19 está en su espacio correcto (Espacio19)
    if (p19.getBounds().intersects(Espacio19.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 20 está en su espacio correcto (Espacio20)
    if (p20.getBounds().intersects(Espacio20.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 21 está en su espacio correcto (Espacio21)
    if (p21.getBounds().intersects(Espacio21.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 22 está en su espacio correcto (Espacio22)
    if (p22.getBounds().intersects(Espacio22.getBounds())) {
        piezasColocadasCorrectamente++;
    }

    // Verificar si la pieza 23 está en su espacio correcto (Espacio23)
    if (p23.getBounds().intersects(Espacio23.getBounds())) {
        piezasColocadasCorrectamente++;
    }

   
    
    
    
    
    
    // Solo mostrar el mensaje cuando todas las piezas están colocadas correctamente
    if (piezasColocadasCorrectamente == 23) {
        
        JOptionPane.showMessageDialog(this, "¡Todas las piezas están en su posición correcta!");
        
         //FELICITACIONES SONIDO
        String rutaSonido ="C:\\Users\\jhoel\\OneDrive\\Documentos\\NetBeansProjects\\RompecabezasGeografico\\src\\img\\felicidades.wav";
    reproducirSonido(rutaSonido); // Reproducir el sonido
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
            java.util.logging.Logger.getLogger(ArmarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArmarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArmarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArmarMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArmarMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArgentinaSil;
    private javax.swing.JButton Comprobar;
    private javax.swing.JLabel Espacio1;
    private javax.swing.JLabel Espacio10;
    private javax.swing.JLabel Espacio11;
    private javax.swing.JLabel Espacio12;
    private javax.swing.JLabel Espacio13;
    private javax.swing.JLabel Espacio14;
    private javax.swing.JLabel Espacio15;
    private javax.swing.JLabel Espacio16;
    private javax.swing.JLabel Espacio17;
    private javax.swing.JLabel Espacio18;
    private javax.swing.JLabel Espacio19;
    private javax.swing.JLabel Espacio2;
    private javax.swing.JLabel Espacio20;
    private javax.swing.JLabel Espacio21;
    private javax.swing.JLabel Espacio22;
    private javax.swing.JLabel Espacio23;
    private javax.swing.JLabel Espacio3;
    private javax.swing.JLabel Espacio4;
    private javax.swing.JLabel Espacio5;
    private javax.swing.JLabel Espacio6;
    private javax.swing.JLabel Espacio7;
    private javax.swing.JLabel Espacio8;
    private javax.swing.JLabel Espacio9;
    private javax.swing.JButton btanterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p12;
    private javax.swing.JLabel p13;
    private javax.swing.JLabel p14;
    private javax.swing.JLabel p15;
    private javax.swing.JLabel p16;
    private javax.swing.JLabel p17;
    private javax.swing.JLabel p18;
    private javax.swing.JLabel p19;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p20;
    private javax.swing.JLabel p21;
    private javax.swing.JLabel p22;
    private javax.swing.JLabel p23;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
