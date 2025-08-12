/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.awt.Component;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author leoxi
 */
public class Authenticator {
    private Connection con;

    public Authenticator(Connection con) {
        this.con = con;
    }

    public boolean authenticate(String usuario, String passwd, Component rootPane) {
        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el usuario, el campo es obligatorio", "Señor usuario", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if ("0000".equals(passwd)) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la contraseña, el campo es obligatorio", "Señor usuario", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            String sqlSelectUser = "SELECT * FROM tablasmultiplicar.users WHERE user_name=? AND password=?";
            try (PreparedStatement ps = con.prepareStatement(sqlSelectUser)) {
                ps.setString(1, usuario);
                ps.setString(2, passwd);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    String idUserDB = rs.getString("id_user");
                    String userDB = rs.getString("user_name");
                    String passDB = rs.getString("password");
                    if (userDB.equals(usuario) && passDB.equals(passwd)) {
                        System.out.println("Sesion iniciada");
                        return true;
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Las credenciales suministradas no concuerdan con registros del sistema", "Señor usuario", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
                JOptionPane.showMessageDialog(rootPane, "Se presenta un error", "Señor usuario", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }
}
