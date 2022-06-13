/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RedSocial;


import Cuentas.Cuenta;
import EDL.ListaDE;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Mau
 */

public class Sitio extends javax.swing.JFrame {
    
    int xMouse,yMouse;
    Color naranja = new Color(247,87,26);
    Color naranjaS= new Color(250,183,44);
    Color gris = new Color(242,242,242);
    boolean desplegado = false;
    ListaDE<Cuenta> cuentas;
    int x=0;
    
    /**
     * Creates new form Sitio
     */
    public Sitio(ListaDE<Cuenta> acc,int num) {
        initComponents();
        x=num;
        setLocationRelativeTo(null);
        menuBar.setVisible(false);
        homeL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/homeLN.png"));
        menuL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/menuD.png"));
        cuentas = acc;
        //ImageIcon imagen = new ImageIcon("C:\\Users\\Mau\\Downloads\\gato.jpg");
        ImageIcon imagen = new ImageIcon("src/main/java/recursos/imagenes/RICK Y MORTY.png");
        //C:\Users\Mau\Downloads
        //ImageIcon imagen = new ImageIcon("D:\\Universidad\\2022 primer Semestre\\Taller de Progra\\DeCaseritos\\src\\main\\java\\Imagenes\\perfilPred.jpg");
        //C:\Users\Mau\Downloads
        //D:\Universidad\2022 primer Semestre\Taller de Progra\DeCaseritos\src\main\java\Imagenes\perfilPred.jpg
        //ImageIcon imagen = new ImageIcon("src/main/java/Imagenes/perfilPred.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(),Image.SCALE_DEFAULT));
        foto.setIcon(icono);
        this.repaint();
        setNUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        superior = new javax.swing.JPanel();
        logotipo = new javax.swing.JLabel();
        perfil = new javax.swing.JPanel();
        nUsuario = new javax.swing.JLabel();
        hombeBtn = new javax.swing.JPanel();
        homeL = new javax.swing.JLabel();
        menuBtn = new javax.swing.JPanel();
        menuL = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        logOutBtn = new javax.swing.JPanel();
        logOutL = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superior.setBackground(new Color(250,183,44));
        superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorMouseDragged(evt);
            }
        });
        superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorMousePressed(evt);
            }
        });
        superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        superior.add(logotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        perfil.setBackground(new Color(250,183,44));
        perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                perfilMouseExited(evt);
            }
        });
        perfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nUsuario.setText("USUARIO");
        perfil.add(nUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        superior.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1057, 0, 160, 50));

        hombeBtn.setOpaque(false);
        hombeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hombeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hombeBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hombeBtnLayout = new javax.swing.GroupLayout(hombeBtn);
        hombeBtn.setLayout(hombeBtnLayout);
        hombeBtnLayout.setHorizontalGroup(
            hombeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(hombeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hombeBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(homeL, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        hombeBtnLayout.setVerticalGroup(
            hombeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hombeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        superior.add(hombeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        menuBtn.setOpaque(false);
        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuBtnLayout = new javax.swing.GroupLayout(menuBtn);
        menuBtn.setLayout(menuBtnLayout);
        menuBtnLayout.setHorizontalGroup(
            menuBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBtnLayout.createSequentialGroup()
                .addComponent(menuL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuBtnLayout.setVerticalGroup(
            menuBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        superior.add(menuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 0, 60, 50));

        foto.setOpaque(true);
        superior.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 60, 50));

        base.add(superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        menuBar.setBackground(new Color(250,183,44));

        logOutBtn.setBackground(new Color(250,183,44));
        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutBtnMouseExited(evt);
            }
        });

        logOutL.setForeground(new java.awt.Color(255, 255, 255));
        logOutL.setText("Cerrar sesión");

        javax.swing.GroupLayout logOutBtnLayout = new javax.swing.GroupLayout(logOutBtn);
        logOutBtn.setLayout(logOutBtnLayout);
        logOutBtnLayout.setHorizontalGroup(
            logOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutBtnLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logOutL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        logOutBtnLayout.setVerticalGroup(
            logOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutL)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        exitBtn.setBackground(new Color(250,183,44));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

        exitL.setForeground(new java.awt.Color(255, 255, 255));
        exitL.setText("Salir");

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(exitL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitL)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logOutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarLayout.createSequentialGroup()
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        base.add(menuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, 140, 80));

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 650));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        base.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 830, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_superiorMousePressed

    private void superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_superiorMouseDragged

    private void perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseEntered
        perfil.setBackground(Color.white);
        nUsuario.setForeground(naranjaS);
    }//GEN-LAST:event_perfilMouseEntered

    private void perfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseExited
        perfil.setBackground(naranjaS);
        nUsuario.setForeground(Color.white);
    }//GEN-LAST:event_perfilMouseExited

    private void hombeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hombeBtnMouseEntered
        
        homeL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/homeLW.png"));
    }//GEN-LAST:event_hombeBtnMouseEntered

    private void hombeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hombeBtnMouseExited
        homeL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/homeLN.png"));
    }//GEN-LAST:event_hombeBtnMouseExited

    private void menuBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseEntered
        if(desplegado == false){
            menuL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/menuDY.png"));
        }else{
            
            menuL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/menuUY.png"));
        }
    }//GEN-LAST:event_menuBtnMouseEntered

    private void menuBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseExited
        if(desplegado == false){
            menuL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/menuD.png"));
        }else{
            
            menuL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/menuU.png"));
        }
    }//GEN-LAST:event_menuBtnMouseExited

    private void menuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseClicked
        if(desplegado == false){
            menuBar.setVisible(true);
            this.desplegado = true;
            menuL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/menuU.png"));
        }else{
            menuBar.setVisible(false);
            this.desplegado = false;
            menuL.setIcon(new ImageIcon("src/main/java/recursos/imagenes/menuD.png"));
        }
    }//GEN-LAST:event_menuBtnMouseClicked

    private void logOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseClicked
        menuBar.setVisible(false);
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutBtnMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_exitBtnMouseClicked

    private void logOutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseEntered
        logOutBtn.setBackground(Color.white);
        logOutL.setForeground(naranjaS);
    }//GEN-LAST:event_logOutBtnMouseEntered

    private void logOutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseExited
        logOutBtn.setBackground(naranjaS);
        logOutL.setForeground(Color.white);
    }//GEN-LAST:event_logOutBtnMouseExited

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        exitBtn.setBackground(Color.white);
        exitL.setForeground(naranjaS);
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        exitBtn.setBackground(naranjaS);
        exitL.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnMouseExited

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
            java.util.logging.Logger.getLogger(Sitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sitio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        ListaDE<Cuenta> cuentas = new ListaDE<Cuenta>(); 
        int num=0;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Sitio(cuentas, num).setVisible(true); 
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitL;
    private javax.swing.JLabel foto;
    private javax.swing.JPanel hombeBtn;
    private javax.swing.JLabel homeL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logOutBtn;
    private javax.swing.JLabel logOutL;
    private javax.swing.JLabel logotipo;
    private javax.swing.JPanel menuBar;
    private javax.swing.JPanel menuBtn;
    private javax.swing.JLabel menuL;
    private javax.swing.JLabel nUsuario;
    private javax.swing.JPanel perfil;
    private javax.swing.JPanel superior;
    // End of variables declaration//GEN-END:variables

public void setNUsuario(){
    nUsuario.setText(cuentas.obtenerPos(x).getUsuario());
}
    
}
