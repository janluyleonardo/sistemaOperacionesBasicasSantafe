/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author leoxi
 */
public class Conexion {

    Connection Conect = null;

    public Connection conectar() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conect = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/mdsr","MORJAN","Moreno.880501");
//                JOptionPane.showMessageDialog(null, "Conectado a la Base de Datos !!!");
                System.out.println("Conectado a la Base de Datos !!!");
        } catch (Exception e) {
            System.out.println("" + e);
            JOptionPane.showMessageDialog(null, e, "ERROR EN CONEXIÓN A DBasdadsad", JOptionPane.ERROR_MESSAGE);
        }
        return Conect;
    }
}
