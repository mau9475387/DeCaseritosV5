/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package RedSocial;

import Archivos.Ficheros;
import Cuentas.Comensal;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Mau
 */
public class comP extends javax.swing.JPanel {

    Color naranjaSuave;
    Color naranja;
    CrearCuentas frame;

    public comP(CrearCuentas x) {
        initComponents();
        naranja = new Color(247, 87, 26);
        naranjaSuave = new Color(250, 183, 44);
        crearbtn.setBackground(naranja);
        crearlabel.setForeground(Color.white);
        cancelarbtn.setBackground(naranja);
        cancelarlabel.setForeground(Color.white);
        frame = x;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        nombreL = new javax.swing.JLabel();
        usuarioL = new javax.swing.JLabel();
        contraseñaL = new javax.swing.JLabel();
        pass2L = new javax.swing.JLabel();
        mail2L = new javax.swing.JLabel();
        celularL = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        mailL = new javax.swing.JLabel();
        datosP = new javax.swing.JPanel();
        nombreText = new javax.swing.JTextField();
        usuarioText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        mail2Text = new javax.swing.JTextField();
        celularText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        pass2Text = new javax.swing.JPasswordField();
        fotoL = new javax.swing.JLabel();
        fotoperfillbl = new javax.swing.JLabel();
        pathphotolbl = new javax.swing.JLabel();
        Buscarfotobtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        crearbtn = new javax.swing.JPanel();
        crearlabel = new javax.swing.JLabel();
        cancelarbtn = new javax.swing.JPanel();
        cancelarlabel = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, -1, -1));

        nombreL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreL.setText("Nombre completo:");
        add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 30));

        usuarioL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuarioL.setText("Nombre de usuario:");
        add(usuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 30));

        contraseñaL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        contraseñaL.setText("Contraseña:");
        add(contraseñaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        pass2L.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pass2L.setText("Repita la contraseña:");
        add(pass2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        mail2L.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mail2L.setText("repita su E-mail:");
        add(mail2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        celularL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        celularL.setText("Numero de celular:");
        add(celularL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        titulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        titulo.setText("CREAR CUENTA DE TIPO COMENSAL");
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        mailL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mailL.setText("E-mail:");
        add(mailL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        datosP.setOpaque(false);
        datosP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreText.setForeground(new java.awt.Color(204, 204, 204));
        nombreText.setText("Ingrese su nombre completo");
        nombreText.setBorder(null);
        nombreText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTextMousePressed(evt);
            }
        });
        datosP.add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 530, 30));

        usuarioText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(204, 204, 204));
        usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
        usuarioText.setBorder(null);
        usuarioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioTextMousePressed(evt);
            }
        });
        datosP.add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 530, 30));

        mailText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mailText.setForeground(new java.awt.Color(204, 204, 204));
        mailText.setText("Ingrese su e-mail");
        mailText.setBorder(null);
        mailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mailTextMousePressed(evt);
            }
        });
        datosP.add(mailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 530, 30));

        mail2Text.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mail2Text.setForeground(new java.awt.Color(204, 204, 204));
        mail2Text.setText("Repita su e-mail");
        mail2Text.setBorder(null);
        mail2Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mail2TextMousePressed(evt);
            }
        });
        datosP.add(mail2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 530, 30));

        celularText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        celularText.setForeground(new java.awt.Color(204, 204, 204));
        celularText.setText("Ingrese su número de celular");
        celularText.setBorder(null);
        celularText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                celularTextMousePressed(evt);
            }
        });
        celularText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularTextActionPerformed(evt);
            }
        });
        datosP.add(celularText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 530, 30));

        passText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passText.setForeground(new java.awt.Color(204, 204, 204));
        passText.setText("********");
        passText.setBorder(null);
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTextMousePressed(evt);
            }
        });
        datosP.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 530, 30));

        pass2Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass2Text.setForeground(new java.awt.Color(204, 204, 204));
        pass2Text.setText("********");
        pass2Text.setBorder(null);
        pass2Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pass2TextMousePressed(evt);
            }
        });
        datosP.add(pass2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 530, 30));

        fotoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fotoL.setText("Foto de perfil:");
        datosP.add(fotoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        fotoperfillbl.setBackground(new java.awt.Color(255, 153, 51));
        fotoperfillbl.setForeground(new java.awt.Color(255, 153, 51));
        fotoperfillbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datosP.add(fotoperfillbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 100));
        datosP.add(pathphotolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 0, 10));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Foto");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BuscarfotobtnLayout = new javax.swing.GroupLayout(Buscarfotobtn);
        Buscarfotobtn.setLayout(BuscarfotobtnLayout);
        BuscarfotobtnLayout.setHorizontalGroup(
            BuscarfotobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        BuscarfotobtnLayout.setVerticalGroup(
            BuscarfotobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        datosP.add(Buscarfotobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 110, 30));

        add(datosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 540, 486));

        crearbtn.setPreferredSize(new java.awt.Dimension(120, 40));
        crearbtn.setRequestFocusEnabled(false);
        crearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearbtnMouseExited(evt);
            }
        });

        crearlabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        crearlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearlabel.setText("Crear");

        javax.swing.GroupLayout crearbtnLayout = new javax.swing.GroupLayout(crearbtn);
        crearbtn.setLayout(crearbtnLayout);
        crearbtnLayout.setHorizontalGroup(
            crearbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        crearbtnLayout.setVerticalGroup(
            crearbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(crearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        cancelarbtn.setPreferredSize(new java.awt.Dimension(120, 40));
        cancelarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarbtnMouseExited(evt);
            }
        });

        cancelarlabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cancelarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarlabel.setText("Cancelar");

        javax.swing.GroupLayout cancelarbtnLayout = new javax.swing.GroupLayout(cancelarbtn);
        cancelarbtn.setLayout(cancelarbtnLayout);
        cancelarbtnLayout.setHorizontalGroup(
            cancelarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        cancelarbtnLayout.setVerticalGroup(
            cancelarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(cancelarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void celularTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularTextActionPerformed

    private void nombreTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTextMousePressed
        if (nombreText.getText().equals("Ingrese su nombre completo")) {
            nombreText.setText("");
            nombreText.setForeground(Color.black);
        }

        if (usuarioText.getText().isEmpty()) {
            usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
            usuarioText.setForeground(Color.gray);
        }
        if (mailText.getText().isEmpty()) {
            mailText.setText("Ingrese su e-mail");
            mailText.setForeground(Color.gray);
        }
        if (mail2Text.getText().isEmpty()) {
            mail2Text.setText("Repita su e-mail");
            mail2Text.setForeground(Color.gray);
        }

        if (String.valueOf(passText.getPassword()).isEmpty()) {
            passText.setText("********");
            passText.setForeground(Color.gray);
        }
        if (String.valueOf(pass2Text.getPassword()).isEmpty()) {
            pass2Text.setText("********");
            pass2Text.setForeground(Color.gray);
        }
        if (celularText.getText().isEmpty()) {
            celularText.setText("Ingrese su número de celular");
            celularText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombreTextMousePressed

    private void usuarioTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTextMousePressed
        if (usuarioText.getText().equals("Ingrese el nombre con el que iniciará sesión")) {
            usuarioText.setText("");
            usuarioText.setForeground(Color.black);
        }

        if (nombreText.getText().isEmpty()) {
            nombreText.setText("Ingrese su nombre completo");
            nombreText.setForeground(Color.gray);
        }
        if (mailText.getText().isEmpty()) {
            mailText.setText("Ingrese su e-mail");
            mailText.setForeground(Color.gray);
        }
        if (mail2Text.getText().isEmpty()) {
            mail2Text.setText("Repita su e-mail");
            mail2Text.setForeground(Color.gray);
        }

        if (String.valueOf(passText.getPassword()).isEmpty()) {
            passText.setText("********");
            passText.setForeground(Color.gray);
        }
        if (String.valueOf(pass2Text.getPassword()).isEmpty()) {
            pass2Text.setText("********");
            pass2Text.setForeground(Color.gray);
        }
        if (celularText.getText().isEmpty()) {
            celularText.setText("Ingrese su número de celular");
            celularText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioTextMousePressed

    private void mailTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTextMousePressed
        if (mailText.getText().equals("Ingrese su e-mail")) {
            mailText.setText("");
            mailText.setForeground(Color.black);
        }

        if (nombreText.getText().isEmpty()) {
            nombreText.setText("Ingrese su nombre completo");
            nombreText.setForeground(Color.gray);
        }
        if (usuarioText.getText().isEmpty()) {
            usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
            usuarioText.setForeground(Color.gray);
        }
        if (mail2Text.getText().isEmpty()) {
            mail2Text.setText("Repita su e-mail");
            mail2Text.setForeground(Color.gray);
        }

        if (String.valueOf(passText.getPassword()).isEmpty()) {
            passText.setText("********");
            passText.setForeground(Color.gray);
        }
        if (String.valueOf(pass2Text.getPassword()).isEmpty()) {
            pass2Text.setText("********");
            pass2Text.setForeground(Color.gray);
        }
        if (celularText.getText().isEmpty()) {
            celularText.setText("Ingrese su número de celular");
            celularText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_mailTextMousePressed

    private void mail2TextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mail2TextMousePressed
        if (mail2Text.getText().equals("Repita su e-mail")) {
            mail2Text.setText("");
            mail2Text.setForeground(Color.black);
        }

        if (nombreText.getText().isEmpty()) {
            nombreText.setText("Ingrese su nombre completo");
            nombreText.setForeground(Color.gray);
        }
        if (usuarioText.getText().isEmpty()) {
            usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
            usuarioText.setForeground(Color.gray);
        }
        if (mailText.getText().isEmpty()) {
            mailText.setText("Ingrese su e-mail");
            mailText.setForeground(Color.gray);
        }

        if (String.valueOf(passText.getPassword()).isEmpty()) {
            passText.setText("********");
            passText.setForeground(Color.gray);
        }
        if (String.valueOf(pass2Text.getPassword()).isEmpty()) {
            pass2Text.setText("********");
            pass2Text.setForeground(Color.gray);
        }
        if (celularText.getText().isEmpty()) {
            celularText.setText("Ingrese su número de celular");
            celularText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_mail2TextMousePressed

    private void celularTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_celularTextMousePressed
        if (celularText.getText().equals("Ingrese su número de celular")) {
            celularText.setText("");
            celularText.setForeground(Color.black);
        }

        if (nombreText.getText().isEmpty()) {
            nombreText.setText("Ingrese su nombre completo");
            nombreText.setForeground(Color.gray);
        }
        if (usuarioText.getText().isEmpty()) {
            usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
            usuarioText.setForeground(Color.gray);
        }
        if (mailText.getText().isEmpty()) {
            mailText.setText("Ingrese su e-mail");
            mailText.setForeground(Color.gray);
        }

        if (String.valueOf(passText.getPassword()).isEmpty()) {
            passText.setText("********");
            passText.setForeground(Color.gray);
        }
        if (String.valueOf(pass2Text.getPassword()).isEmpty()) {
            pass2Text.setText("********");
            pass2Text.setForeground(Color.gray);
        }
        if (mail2Text.getText().isEmpty()) {
            mail2Text.setText("Repita su e-mail");
            mail2Text.setForeground(Color.gray);
        }
    }//GEN-LAST:event_celularTextMousePressed

    private void passTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMousePressed
        if (String.valueOf(passText.getPassword()).equals("********")) {
            passText.setText("");
            passText.setForeground(Color.black);
        }

        if (nombreText.getText().isEmpty()) {
            nombreText.setText("Ingrese su nombre completo");
            nombreText.setForeground(Color.gray);
        }
        if (mailText.getText().isEmpty()) {
            mailText.setText("Ingrese su e-mail");
            mailText.setForeground(Color.gray);
        }
        if (mail2Text.getText().isEmpty()) {
            mail2Text.setText("Repita su e-mail");
            mail2Text.setForeground(Color.gray);
        }

        if (String.valueOf(pass2Text.getPassword()).isEmpty()) {
            pass2Text.setText("********");
            pass2Text.setForeground(Color.gray);
        }
        if (usuarioText.getText().isEmpty()) {
            usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
            usuarioText.setForeground(Color.gray);
        }
        if (celularText.getText().isEmpty()) {
            celularText.setText("Ingrese su número de celular");
            celularText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTextMousePressed

    private void pass2TextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2TextMousePressed
        if (String.valueOf(pass2Text.getPassword()).equals("********")) {
            pass2Text.setText("");
            pass2Text.setForeground(Color.black);
        }

        if (nombreText.getText().isEmpty()) {
            nombreText.setText("Ingrese su nombre completo");
            nombreText.setForeground(Color.gray);
        }
        if (mailText.getText().isEmpty()) {
            mailText.setText("Ingrese su e-mail");
            mailText.setForeground(Color.gray);
        }
        if (mail2Text.getText().isEmpty()) {
            mail2Text.setText("Repita su e-mail");
            mail2Text.setForeground(Color.gray);
        }

        if (String.valueOf(passText.getPassword()).isEmpty()) {
            passText.setText("********");
            passText.setForeground(Color.gray);
        }
        if (usuarioText.getText().isEmpty()) {
            usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
            usuarioText.setForeground(Color.gray);
        }
        if (celularText.getText().isEmpty()) {
            celularText.setText("Ingrese su número de celular");
            celularText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_pass2TextMousePressed

    private void cancelarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtnMouseClicked
        Login nuevo = new Login();
        nuevo.setVisible(true);
        frame.cerrar();

    }//GEN-LAST:event_cancelarbtnMouseClicked

    private void crearbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearbtnMouseEntered
        crearbtn.setBackground(naranjaSuave);
    }//GEN-LAST:event_crearbtnMouseEntered

    private void crearbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearbtnMouseExited
        crearbtn.setBackground(naranja);
    }//GEN-LAST:event_crearbtnMouseExited

    private void cancelarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtnMouseEntered
        cancelarbtn.setBackground(naranjaSuave);
    }//GEN-LAST:event_cancelarbtnMouseEntered

    private void cancelarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtnMouseExited
        cancelarbtn.setBackground(naranja);
    }//GEN-LAST:event_cancelarbtnMouseExited

    private void crearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearbtnMouseClicked
      //  crearComensal();
        
       // nombreText.setText("");
       // usuarioText.setText("");
       // mailText.setText("");
     //   mail2Text.setText("");
      //  passText.setText("");
        //pass2Text.setText("");
      //  celularText.setText("");

      Ficheros Comensales = new Ficheros();
        Comensales.crearComensal(new Comensal(nombreText.getText(), usuarioText.getText(),  passText.getText(), mailText.getText(), celularText.getText()));
      
           File imagenSeleccionadado = new File(pathphotolbl.getText());
        CrearImagenEnRoot(imagenSeleccionadado, Comensales);
        try{
            InsertarUsuario(Comensales);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_crearbtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 JFileChooser selector=new JFileChooser();
        selector.showOpenDialog(this);

        File archivo = selector.getSelectedFile();

        if (archivo != null) {
            String Origen = archivo.getPath();
            ImageIcon ingresar = new ImageIcon(Origen);
            Icon iconoIngresar = new ImageIcon(ingresar.getImage().getScaledInstance(fotoperfillbl.getWidth(), fotoperfillbl.getHeight(), Image.SCALE_FAST));
            fotoperfillbl.setIcon(iconoIngresar);
            pathphotolbl.setText(Origen);
            pathphotolbl.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una imagen");
        }    
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        Buscarfotobtn.setBackground(naranjaSuave);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        Buscarfotobtn.setBackground(naranja);

    }//GEN-LAST:event_jLabel1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buscarfotobtn;
    private javax.swing.JPanel cancelarbtn;
    private javax.swing.JLabel cancelarlabel;
    private javax.swing.JLabel celularL;
    private javax.swing.JTextField celularText;
    private javax.swing.JLabel contraseñaL;
    private javax.swing.JPanel crearbtn;
    private javax.swing.JLabel crearlabel;
    private javax.swing.JPanel datosP;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel fotoL;
    private javax.swing.JLabel fotoperfillbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mail2L;
    private javax.swing.JTextField mail2Text;
    private javax.swing.JLabel mailL;
    private javax.swing.JTextField mailText;
    private javax.swing.JLabel nombreL;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel pass2L;
    private javax.swing.JPasswordField pass2Text;
    private javax.swing.JPasswordField passText;
    private javax.swing.JLabel pathphotolbl;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuarioL;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables

    public static void main (String[] args){
        
    }
    private void crearComensal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void CrearImagenEnRoot(File imagenSeleccionadado, Ficheros Comensales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void InsertarUsuario(Ficheros Comensales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
