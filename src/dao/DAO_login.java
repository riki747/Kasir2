/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import main.Menu_Utama;
import koneksi.koneksi;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.model_login;
import service.service_login;
import view.Form_login;


/**
 *
 * @author Lenovo
 */
public class DAO_login implements service_login {
    private Connection conn;
    
    public DAO_login(){
        conn = koneksi.getConnection();
    }
            
    @Override
    public void prosesLogin(model_login mod_login) {
       PreparedStatament st = null;
       ResultSet rs         = null;
       String Id            = null;
       String Nama          = null;
       
    }

    private static class PreparedStatament {

        public PreparedStatament() {
        }
    }
    
    }
