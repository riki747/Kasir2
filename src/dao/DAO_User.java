
package dao;

import koneksi.koneksi;
//import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.model_user;

public class DAO_User implements service.service_user{
    
    private Connection conn;
    
    public DAO_User(){
        conn = koneksi.getConnection();
    }

    
    @Override
   public void tambahData(model_user moser) {
    PreparedStatement st = null;
    String sql = "INSERT INTO user (id_user, username, password, role, fullname, email, no_telepon, alamat) VALUES (?,?,?,?,?,?,?,?)";
    try {
        st = conn.prepareStatement(sql);

        // Debug untuk memastikan nilai tidak null
        System.out.println("ID User: " + moser.getId_user());
        System.out.println("Username: " + moser.getUsername());
        System.out.println("Password: " + moser.getPassword());
        System.out.println("Role: " + moser.getRole());
        System.out.println("Fullname: " + moser.getFullname());
        System.out.println("Email: " + moser.getEmail());
        System.out.println("No Telepon: " + moser.getNo_telepon());
        System.out.println("Alamat: " + moser.getAlamat());

        st.setInt(1, moser.getId_user());
        st.setString(2, moser.getUsername());
        st.setString(3, moser.getPassword());
        st.setString(4, moser.getRole());
        st.setString(5, moser.getFullname());
        st.setString(6, moser.getEmail());
        st.setString(7, moser.getNo_telepon());
        st.setString(8, moser.getAlamat());

        st.executeUpdate();
        System.out.println("Data berhasil disimpan.");
    } catch (SQLException ex) {
        Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

    @Override
    public void perbaruiData(model_user moser) {
        PreparedStatement st = null;
        String sql = "UPDATE user SET username=?, password=?, role=?, fullname=?, email=?, no_telepon=?, alamat=? WHERE id_user='"+moser.getId_user()+"'";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString    (1, moser.getUsername());
            st.setString    (2, moser.getPassword());
            st.setString    (3, moser.getRole());
            st.setString    (4, moser.getFullname());
            st.setString    (5, moser.getEmail());
            st.setString    (6, moser.getNo_telepon());
            st.setString    (7, moser.getAlamat());
            
            st.executeUpdate();
//            fungsi.savelog("Data user berhasil diperbarui: " + mod_user.getFullname() + " dengan ID " + mod_user.getId_pengguna());
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_user moser) {
        PreparedStatement st =null;
        String sql = "DELETE FROM user WHERE id_user = ?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setInt(1, moser.getId_user());
            
            st.executeUpdate();
//            fungsi.savelog("User berhasil dihapus: " + mod_user.getFullname() + " dengan ID " + mod_user.getId_pengguna());
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public model_user getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_user> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT id_user, username, password, role, fullname, email, no_telepon, alamat FROM user";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_user moser = new model_user();
                
                moser.setId_user(rs.getInt ("id_user"));
                moser.setUsername(rs.getString("username"));
                moser.setPassword(rs.getString("password"));
                moser.setRole(rs.getString("role"));
                moser.setFullname(rs.getString("fullname"));
                moser.setEmail(rs.getString("email"));
                moser.setNo_telepon(rs.getString("no_telepon"));
                moser.setAlamat(rs.getString("alamat"));
                
                list.add(moser);
            }
//            fungsi.savelog("Data user berhasil diambil, total: " + list.size());
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

   
  

   
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);
        
        String sql = "SELECT RIGHT(id_user, 2) AS Nomor " +
                     "FROM user " +
                     "WHERE id_user LIKE '" + no + "%' " +
                     "ORDER BY id_user DESC " +
                     "LIMIT 1";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = no + String.format("%02d", nomor);
            }else {
                urutan = no + "001";
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return urutan;
    }

    @Override
    public List<model_user> cariData(String id) {
       PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql ="SELECT id_user, username, password, role, fullname, email, no_telepon, alamat FROM user WHERE id_user LIKE '%"+id+"%' OR username LIKE '%"+id+"%'";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
               model_user moser = new model_user();
                
                
                moser.setId_user(rs.getInt ("id_user"));
                moser.setUsername(rs.getString("username"));
                moser.setPassword(rs.getString("password"));
                moser.setRole(rs.getString("role"));
                moser.setFullname(rs.getString("fullname"));
                moser.setEmail(rs.getString("email"));
                moser.setNo_telepon(rs.getString("no_telepon"));
                moser.setAlamat(rs.getString("alamat"));
                
                list.add(moser);
            }
//            fungsi.savelog("Data user berhasil diambil, total: " + list.size());
          return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }} 
        
 