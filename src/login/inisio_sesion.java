package login;


import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class inisio_sesion extends javax.swing.JFrame {

    String contraseña, sqlSelectUser="", userDB, passDB, idUserDB, usuario ="", passwd ="";
    PreparedStatement ps;
    ResultSet rs;
    
    public inisio_sesion() {
        initComponents();
        setLocationRelativeTo(this);
        txt_Usuario.requestFocus();
        setIconImage(new ImageIcon(getClass().getResource("../IMG/leon.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInicio = new javax.swing.JPanel();
        btnSalir_Inisio = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txt_Usuario = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblImagenInisio = new javax.swing.JLabel();
        lblLeon1 = new javax.swing.JLabel();
        lblLeon2 = new javax.swing.JLabel();
        lblLeon3 = new javax.swing.JLabel();
        lblLeon4 = new javax.swing.JLabel();
        lblLeon5 = new javax.swing.JLabel();
        lblLeon6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablas de Multiplicar");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 0, 1));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(681, 504));
        setMinimumSize(new java.awt.Dimension(681, 504));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInicio.setBackground(new java.awt.Color(204, 0, 1));
        jpInicio.setPreferredSize(new java.awt.Dimension(680, 510));
        jpInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir_Inisio.setBackground(new java.awt.Color(255, 51, 0));
        btnSalir_Inisio.setForeground(new java.awt.Color(255, 51, 0));
        btnSalir_Inisio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32.png"))); // NOI18N
        btnSalir_Inisio.setToolTipText("EXIT / SALIR");
        btnSalir_Inisio.setAlignmentY(0.0F);
        btnSalir_Inisio.setBorder(null);
        btnSalir_Inisio.setBorderPainted(false);
        btnSalir_Inisio.setContentAreaFilled(false);
        btnSalir_Inisio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir_Inisio.setFocusPainted(false);
        btnSalir_Inisio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir_Inisio.setMaximumSize(new java.awt.Dimension(16, 16));
        btnSalir_Inisio.setMinimumSize(new java.awt.Dimension(16, 16));
        btnSalir_Inisio.setName("btn_Salir"); // NOI18N
        btnSalir_Inisio.setPreferredSize(new java.awt.Dimension(16, 16));
        btnSalir_Inisio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32B.png"))); // NOI18N
        btnSalir_Inisio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32.png"))); // NOI18N
        btnSalir_Inisio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSalir_Inisio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir_InisioMouseClicked(evt);
            }
        });
        btnSalir_Inisio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir_InisioActionPerformed(evt);
            }
        });
        jpInicio.add(btnSalir_Inisio, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 0, 32, 32));

        btnIngresar.setBackground(new java.awt.Color(204, 0, 1));
        btnIngresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setToolTipText("BOTON DE INGRESO");
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
        });
        jpInicio.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 110, 30));

        txt_Usuario.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(204, 0, 1));
        txt_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_UsuarioMouseReleased(evt);
            }
        });
        txt_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_UsuarioKeyPressed(evt);
            }
        });
        jpInicio.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 140, 30));

        pwd.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        pwd.setForeground(new java.awt.Color(204, 0, 1));
        pwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwd.setText("0000");
        pwd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwdMouseClicked(evt);
            }
        });
        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdKeyPressed(evt);
            }
        });
        jpInicio.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 140, 30));

        lblContraseña.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContraseña.setText("Contraseña:");
        lblContraseña.setAlignmentY(0.0F);
        lblContraseña.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblContraseña.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpInicio.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 150, 40));

        lblUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("Usuario:");
        lblUsuario.setAlignmentY(0.0F);
        lblUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpInicio.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, 40));

        lblImagenInisio.setBackground(new java.awt.Color(255, 51, 0));
        lblImagenInisio.setForeground(new java.awt.Color(255, 51, 0));
        lblImagenInisio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenInisio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/escudo.png"))); // NOI18N
        jpInicio.add(lblImagenInisio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, 210));

        lblLeon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLeon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        lblLeon1.setEnabled(false);
        lblLeon1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpInicio.add(lblLeon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 260, 270));

        lblLeon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLeon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        lblLeon2.setEnabled(false);
        lblLeon2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpInicio.add(lblLeon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 260, 270));

        lblLeon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLeon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        lblLeon3.setEnabled(false);
        lblLeon3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpInicio.add(lblLeon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 270));

        lblLeon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLeon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        lblLeon4.setEnabled(false);
        lblLeon4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpInicio.add(lblLeon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 270));

        lblLeon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLeon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        lblLeon5.setEnabled(false);
        lblLeon5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpInicio.add(lblLeon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 260, 270));

        lblLeon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLeon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        lblLeon6.setEnabled(false);
        lblLeon6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpInicio.add(lblLeon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 260, 270));

        getContentPane().add(jpInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 681, 504));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSalir_InisioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir_InisioMouseClicked

        if (JOptionPane.showConfirmDialog(jpInicio, "Esta Seguro de salir") == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnSalir_InisioMouseClicked

    private void btnSalir_InisioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir_InisioActionPerformed

    }//GEN-LAST:event_btnSalir_InisioActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        usuario = txt_Usuario.getText();
        passwd = pwd.getText();
        if (usuario.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el usuario, el campo es obligatorio", "Señor usuario", JOptionPane.ERROR_MESSAGE);
            txt_Usuario.requestFocus();
        } else if (passwd.equals("0000")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la contrsaeña, el campo es obligatorio", "Señor usuario", JOptionPane.ERROR_MESSAGE);
            pwd.requestFocus();
        } else{
            sqlSelectUser = "SELECT * FROM tablasmultiplicar.users WHERE user_name=? AND password=?";
            try {
                ps = con.prepareStatement(sqlSelectUser);
                ps.setString(1, usuario);
                ps.setString(2, passwd);

                rs = ps.executeQuery();
                
                if (rs.next()) {
                    idUserDB = rs.getString("id_user");
                    userDB = rs.getString("user_name");
                    passDB = rs.getString("password");
                    
                    if (userDB.equals(usuario) && passDB.equals(passwd)) {
                    System.out.println("Sesion iniciada");
                    menu menu = new menu();
                    menu.setVisible(true);
                    this.dispose();
//                    }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Las credenciales suministradas no concuerdan \n ó el usuario no existe en el sistema", "Señor usuario", JOptionPane.ERROR_MESSAGE);
    //                    this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Las credenciales suministradas no concuerdan con registros del sistema\nLa consulta de usuario no trae datos", "Señor usuario", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (Exception e) {
                System.out.println("error: "+e);
                JOptionPane.showMessageDialog(rootPane, "Se preswenta un error{e}", "Señor usuario", JOptionPane.ERROR_MESSAGE);            
            }
        }
//        
//        
//        
//        if (usuario.equals("sarahi") && passwd.equals("230610")) {

//        } else {
//            JOptionPane.showMessageDialog(jpInicio, "Usuario y contraseña no coinciden", "ERROR EN INICIO DE SESION", JOptionPane.ERROR_MESSAGE);
//            pwd.setText("");
//            txt_Usuario.setText("");
//            txt_Usuario.requestFocus();
//        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void txt_UsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_UsuarioMouseReleased
        if(pwd.requestFocus(true)){
            pwd.setText("");
        }
        
    }//GEN-LAST:event_txt_UsuarioMouseReleased

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed

    }//GEN-LAST:event_pwdActionPerformed

    private void pwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdKeyPressed
        
        usuario = txt_Usuario.getText();
        contraseña = pwd.getText();

        menu menu = new menu();

        char car = (char) evt.getKeyCode();

        if (car == evt.VK_ENTER) {
            //System.out.println("se presiono la tecla Enter");
            
            if (usuario.equals("sarahi") && contraseña.equals("230610")) {
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(jpInicio, "Usuario y/o contraseña no coinciden", "ERROR EN INICIO DE SESION", JOptionPane.ERROR_MESSAGE);
                pwd.setText("");
                txt_Usuario.setText("");
                txt_Usuario.requestFocus();
            }
        }
    }//GEN-LAST:event_pwdKeyPressed

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed

    }//GEN-LAST:event_btnIngresarKeyPressed

    private void txt_UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UsuarioKeyPressed

        char car = (char) evt.getKeyCode();

        if (car == evt.VK_ENTER) {
            System.out.println("se presiono la tecla Enter");
            usuario = txt_Usuario.getText();
            if (usuario.equals("")){
                JOptionPane.showMessageDialog(jpInicio, "El campo usuario no puede estar vacio!!!", "ERROR EN INICIO DE SESION", JOptionPane.ERROR_MESSAGE);
            }else{
                pwd.requestFocus();
                pwd.setText("");
            }
        }
    }//GEN-LAST:event_txt_UsuarioKeyPressed

    private void pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwdMouseClicked
        pwd.setText("");
    }//GEN-LAST:event_pwdMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir_Inisio;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblImagenInisio;
    private javax.swing.JLabel lblLeon1;
    private javax.swing.JLabel lblLeon2;
    private javax.swing.JLabel lblLeon3;
    private javax.swing.JLabel lblLeon4;
    private javax.swing.JLabel lblLeon5;
    private javax.swing.JLabel lblLeon6;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
Conexion ct = new Conexion();
Connection con = ct.conectar();
}