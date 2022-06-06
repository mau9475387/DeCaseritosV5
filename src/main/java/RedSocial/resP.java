/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package RedSocial;

import java.awt.Color;

/**
 *
 * @author Mau
 */
public class resP extends javax.swing.JPanel {
    Color naranjaSuave;
    Color naranja;
    Error arturo;
    
    public resP() {
        initComponents();
        naranja = new Color(247,87,26);
        naranjaSuave = new Color(250,183,44);
        crearBtn.setBackground(naranja);
        crearLbl.setForeground(Color.white);
        arturo = new Error();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreL = new javax.swing.JLabel();
        usuarioL = new javax.swing.JLabel();
        contraseñaL = new javax.swing.JLabel();
        mailL = new javax.swing.JLabel();
        pass2L = new javax.swing.JLabel();
        mail2L = new javax.swing.JLabel();
        datosP = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        nombreText = new javax.swing.JTextField();
        usuarioText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        mail2Text = new javax.swing.JTextField();
        celularText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        pass2Text = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        wifi = new java.awt.Checkbox();
        recreacion = new java.awt.Checkbox();
        zNiños = new java.awt.Checkbox();
        braile = new java.awt.Checkbox();
        discapacitados = new java.awt.Checkbox();
        sordoMudos = new java.awt.Checkbox();
        drive = new java.awt.Checkbox();
        autoServ = new java.awt.Checkbox();
        delivery = new java.awt.Checkbox();
        diasYHorasL = new javax.swing.JLabel();
        especialidadL = new javax.swing.JLabel();
        atencion = new javax.swing.JScrollPane();
        atencionText = new javax.swing.JTextArea();
        especialidadText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        dirText = new javax.swing.JTextField();
        celularL = new javax.swing.JLabel();
        fotoL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        foto = new javax.swing.JPanel();
        crearBtn = new javax.swing.JPanel();
        crearLbl = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreL.setText("Nombre");
        add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        usuarioL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuarioL.setText("Nombre de usuario:");
        add(usuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        contraseñaL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        contraseñaL.setText("Contraseña:");
        add(contraseñaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        mailL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mailL.setText("E-mail:");
        add(mailL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        pass2L.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pass2L.setText("Repita la contraseña:");
        add(pass2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        mail2L.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mail2L.setText("repita su E-mail:");
        add(mail2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        datosP.setOpaque(false);

        nombreText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreText.setForeground(new java.awt.Color(204, 204, 204));
        nombreText.setText("Ingrese el nombre de su restaurante");
        nombreText.setBorder(null);
        nombreText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTextMousePressed(evt);
            }
        });

        usuarioText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(204, 204, 204));
        usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
        usuarioText.setBorder(null);
        usuarioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioTextMousePressed(evt);
            }
        });

        mailText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mailText.setForeground(new java.awt.Color(204, 204, 204));
        mailText.setText("Ingrese su e-mail");
        mailText.setBorder(null);
        mailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mailTextMousePressed(evt);
            }
        });

        mail2Text.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mail2Text.setForeground(new java.awt.Color(204, 204, 204));
        mail2Text.setText("Repita su e-mail");
        mail2Text.setBorder(null);
        mail2Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mail2TextMousePressed(evt);
            }
        });

        celularText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        celularText.setForeground(new java.awt.Color(204, 204, 204));
        celularText.setText("Ingrese su número de celular");
        celularText.setBorder(null);
        celularText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                celularTextMousePressed(evt);
            }
        });

        passText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passText.setForeground(new java.awt.Color(204, 204, 204));
        passText.setText("********");
        passText.setBorder(null);
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTextMousePressed(evt);
            }
        });

        pass2Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass2Text.setForeground(new java.awt.Color(204, 204, 204));
        pass2Text.setText("********");
        pass2Text.setBorder(null);
        pass2Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pass2TextMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Características que pueda presentar su restaurante");

        wifi.setBackground(new java.awt.Color(255, 255, 255));
        wifi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        wifi.setLabel("Wi-fi");

        recreacion.setBackground(new java.awt.Color(255, 255, 255));
        recreacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        recreacion.setLabel("Zonas de recreación");

        zNiños.setBackground(new java.awt.Color(255, 255, 255));
        zNiños.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        zNiños.setLabel("Zona para niños");

        braile.setBackground(new java.awt.Color(255, 255, 255));
        braile.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        braile.setLabel("Menú en braile");

        discapacitados.setBackground(new java.awt.Color(255, 255, 255));
        discapacitados.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        discapacitados.setLabel("Acceso p/ discapacitados");

        sordoMudos.setBackground(new java.awt.Color(255, 255, 255));
        sordoMudos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        sordoMudos.setLabel("Mesero p/ sordomudos");

        drive.setBackground(new java.awt.Color(255, 255, 255));
        drive.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        drive.setLabel("Drive through");

        autoServ.setBackground(new java.awt.Color(255, 255, 255));
        autoServ.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        autoServ.setLabel("Auto-servicio");

        delivery.setBackground(new java.awt.Color(255, 255, 255));
        delivery.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        delivery.setLabel("Delivery");

        diasYHorasL.setText("Días y horario de atención:");

        especialidadL.setText("Especialidad de la casa:");

        atencion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        atencion.setForeground(new java.awt.Color(204, 204, 204));
        atencion.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        atencion.setToolTipText("especifique los dias y horarios en los que atiende (opcional). \nEsta información se mostrará tal cual la escriba");

        atencionText.setColumns(20);
        atencionText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        atencionText.setForeground(new java.awt.Color(204, 204, 204));
        atencionText.setRows(5);
        atencionText.setText("Ingrese los horarios y dias de atencion(opcional)");
        atencionText.setToolTipText("");
        atencionText.setBorder(null);
        atencionText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atencionTextMousePressed(evt);
            }
        });
        atencion.setViewportView(atencionText);

        especialidadText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        especialidadText.setForeground(new java.awt.Color(204, 204, 204));
        especialidadText.setText("Escriba el platillo por el que se caracteriza");
        especialidadText.setBorder(null);
        especialidadText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                especialidadTextMousePressed(evt);
            }
        });

        jLabel2.setText("Direccion:");

        dirText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dirText.setForeground(new java.awt.Color(204, 204, 204));
        dirText.setText("Ingrese la direccion de su establecimiento");
        dirText.setBorder(null);
        dirText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dirTextMousePressed(evt);
            }
        });

        javax.swing.GroupLayout datosPLayout = new javax.swing.GroupLayout(datosP);
        datosP.setLayout(datosPLayout);
        datosPLayout.setHorizontalGroup(
            datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPLayout.createSequentialGroup()
                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datosPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombreText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mail2Text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celularText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datosPLayout.createSequentialGroup()
                        .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pass2Text))
                .addGap(34, 34, 34))
            .addGroup(datosPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPLayout.createSequentialGroup()
                        .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diasYHorasL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datosPLayout.createSequentialGroup()
                                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(braile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sordoMudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(discapacitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(autoServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(datosPLayout.createSequentialGroup()
                                .addComponent(atencion)
                                .addGap(34, 34, 34))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPLayout.createSequentialGroup()
                        .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(datosPLayout.createSequentialGroup()
                                .addComponent(especialidadL)
                                .addGap(18, 18, 18)
                                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addComponent(especialidadText)))
                            .addGroup(datosPLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addComponent(dirText))))
                        .addGap(34, 34, 34))))
        );
        datosPLayout.setVerticalGroup(
            datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPLayout.createSequentialGroup()
                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mail2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(celularText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(datosPLayout.createSequentialGroup()
                            .addComponent(wifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(recreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(zNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(datosPLayout.createSequentialGroup()
                            .addComponent(discapacitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sordoMudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(braile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(datosPLayout.createSequentialGroup()
                        .addComponent(autoServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atencion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diasYHorasL))
                .addGap(21, 21, 21)
                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidadL)
                    .addComponent(especialidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(datosPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPLayout.createSequentialGroup()
                        .addComponent(dirText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(datosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        celularL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        celularL.setText("Numero de celular:");
        add(celularL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        fotoL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fotoL.setText("Foto de perfil:");
        add(fotoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("CREAR CUENTA DE TIPO RESTAURANTE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 376, 23));

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout fotoLayout = new javax.swing.GroupLayout(foto);
        foto.setLayout(fotoLayout);
        fotoLayout.setHorizontalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fotoLayout.setVerticalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        crearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearBtnMouseExited(evt);
            }
        });
        crearBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearLbl.setText("Crear cuenta");
        crearBtn.add(crearLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTextMousePressed
        defecto("nombreText");
    }//GEN-LAST:event_nombreTextMousePressed

    private void usuarioTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTextMousePressed
        defecto("usuarioText");
    }//GEN-LAST:event_usuarioTextMousePressed

    private void mailTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTextMousePressed
       defecto("mailText");
    }//GEN-LAST:event_mailTextMousePressed

    private void mail2TextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mail2TextMousePressed
       defecto("mail2Text");
    }//GEN-LAST:event_mail2TextMousePressed

    private void passTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMousePressed
        defecto("passText");
    }//GEN-LAST:event_passTextMousePressed

    private void pass2TextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2TextMousePressed
        defecto("pass2Text");
    }//GEN-LAST:event_pass2TextMousePressed

    private void celularTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_celularTextMousePressed
        defecto("celularText");
    }//GEN-LAST:event_celularTextMousePressed

    private void especialidadTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especialidadTextMousePressed
        defecto("especialidadText");
    }//GEN-LAST:event_especialidadTextMousePressed

    private void atencionTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atencionTextMousePressed
        defecto("atencionText");
    }//GEN-LAST:event_atencionTextMousePressed

    private void dirTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dirTextMousePressed
        defecto("dirText");
    }//GEN-LAST:event_dirTextMousePressed

    private void crearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMouseEntered
        crearBtn.setBackground(naranjaSuave);
        
    }//GEN-LAST:event_crearBtnMouseEntered

    private void crearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMouseExited
        crearBtn.setBackground(naranja);
        
    }//GEN-LAST:event_crearBtnMouseExited

    private void crearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMouseClicked
        if(wifi.getState()== true){
        arturo.cambiarTitulo("creación de cuenta exitosa");
        arturo.cambiarMensaje("se ha creado una cuenta y wifi esta marcado");
        arturo.setVisible(true);
        }else{
         arturo.cambiarTitulo("creación de cuenta exitosa");
           arturo.cambiarMensaje("se ha creado una cuenta ");
        arturo.setVisible(true);   
        }
        
    }//GEN-LAST:event_crearBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane atencion;
    private javax.swing.JTextArea atencionText;
    private java.awt.Checkbox autoServ;
    private java.awt.Checkbox braile;
    private javax.swing.JLabel celularL;
    private javax.swing.JTextField celularText;
    private javax.swing.JLabel contraseñaL;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JLabel crearLbl;
    private javax.swing.JPanel datosP;
    private java.awt.Checkbox delivery;
    private javax.swing.JLabel diasYHorasL;
    private javax.swing.JTextField dirText;
    private java.awt.Checkbox discapacitados;
    private java.awt.Checkbox drive;
    private javax.swing.JLabel especialidadL;
    private javax.swing.JTextField especialidadText;
    private javax.swing.JPanel foto;
    private javax.swing.JLabel fotoL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel mail2L;
    private javax.swing.JTextField mail2Text;
    private javax.swing.JLabel mailL;
    private javax.swing.JTextField mailText;
    private javax.swing.JLabel nombreL;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel pass2L;
    private javax.swing.JPasswordField pass2Text;
    private javax.swing.JPasswordField passText;
    private java.awt.Checkbox recreacion;
    private java.awt.Checkbox sordoMudos;
    private javax.swing.JLabel usuarioL;
    private javax.swing.JTextField usuarioText;
    private java.awt.Checkbox wifi;
    private java.awt.Checkbox zNiños;
    // End of variables declaration//GEN-END:variables

    public void defecto(String l){
        
        if(l.equals("nombreText")&& nombreText.getText().equals("Ingrese el nombre de su restaurante")){
            nombreText.setText("");
            nombreText.setForeground(Color.black);
        }else{
            if(nombreText.getText().isEmpty()){
            nombreText.setText("Ingrese el nombre de su restaurante");
            nombreText.setForeground(Color.gray);
            }
        }
        
        if(l.equals("usuarioText") && usuarioText.getText().equals("Ingrese el nombre con el que iniciará sesión")){
            usuarioText.setText("");
            usuarioText.setForeground(Color.black);
        }else{
            if(usuarioText.getText().isEmpty()){
            usuarioText.setText("Ingrese el nombre con el que iniciará sesión");
            usuarioText.setForeground(Color.gray);
            }
        }
        
        if(l.equals("mailText") && mailText.getText().equals("Ingrese su e-mail")){
            mailText.setText("");
            mailText.setForeground(Color.black);
        }else{
            if(mailText.getText().isEmpty()){
            mailText.setText("Ingrese su e-mail");
            mailText.setForeground(Color.gray);
            }
        }
        
        if(l.equals("mail2Text")&& mail2Text.getText().equals("Repita su e-mail")){
            mail2Text.setText("");
            mail2Text.setForeground(Color.black);
        }else{
           if(mail2Text.getText().isEmpty()){
            mail2Text.setText("Repita su e-mail");
            mail2Text.setForeground(Color.gray);
            }
        }
        
        if(l.equals("passText")&& passText.getText().equals("********")){
            passText.setText("");
            passText.setForeground(Color.black);
        }else{
           if(String.valueOf(passText.getPassword()).isEmpty()){
            passText.setText("********");
            passText.setForeground(Color.gray);
            }
        }
        
        if(l.equals("pass2Text")&& pass2Text.getText().equals("********")){
            pass2Text.setText("");
            pass2Text.setForeground(Color.black);
        }else{
           if(String.valueOf(pass2Text.getPassword()).isEmpty()){
            pass2Text.setText("********");
            pass2Text.setForeground(Color.gray);
            }
        }
        
        if(l.equals("celularText")&& celularText.getText().equals("Ingrese su número de celular")){
            celularText.setText("");
            celularText.setForeground(Color.black);
        }else{
           if(celularText.getText().isEmpty()){
            celularText.setText("Ingrese su número de celular");
            celularText.setForeground(Color.gray);
            }
        }
        
        if(l.equals("especialidadText")&& especialidadText.getText().equals("Escriba el platillo por el que se caracteriza")){
            especialidadText.setText("");
            especialidadText.setForeground(Color.black);
        }else{
           if(especialidadText.getText().isEmpty()){
            especialidadText.setText("Escriba el platillo por el que se caracteriza");
            especialidadText.setForeground(Color.gray);
            }
        }
        
        if(l.equals("atencionText")&& atencionText.getText().equals("Ingrese los horarios y dias de atencion(opcional)")){
            atencionText.setText("");
            atencionText.setForeground(Color.black);
        }else{
           if(atencionText.getText().isEmpty()){
            atencionText.setText("Ingrese los horarios y dias de atencion(opcional)");
            atencionText.setForeground(Color.gray);
            }
           
        }
        
        if(l.equals("dirText")&& dirText.getText().equals("Ingrese la direccion de su establecimiento")){
            dirText.setText("");
            dirText.setForeground(Color.black);
        }else{
           if(dirText.getText().isEmpty()){
            dirText.setText("Ingrese la direccion de su establecimiento");
            dirText.setForeground(Color.gray);
            }
        }
    }
}
