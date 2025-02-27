/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormKasir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import main.Form_login1;
import main.MenuItem;
import FormAdmin.konten;

/**
 *
 * @author Lenovo
 */
public class Menu_Kasir extends javax.swing.JFrame {

    /**
     * Creates new form TampilanKasir
     */
    public Menu_Kasir() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
       
        excecute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_sidebar2 = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jButton2.setText("Log-out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kasir2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Selamat Datang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(448, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pn_sidebar2.setBackground(new java.awt.Color(255, 255, 255));

        pn_menu.setBackground(new java.awt.Color(255, 255, 255));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout pn_sidebar2Layout = new javax.swing.GroupLayout(pn_sidebar2);
        pn_sidebar2.setLayout(pn_sidebar2Layout);
        pn_sidebar2Layout.setHorizontalGroup(
            pn_sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebar2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pn_sidebar2Layout.setVerticalGroup(
            pn_sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebar2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(pn_sidebar2, java.awt.BorderLayout.LINE_START);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_contentLayout.createSequentialGroup()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Form_login1 login = new Form_login1();
        login.setVisible(true);     
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_utama.add(new Transaksi());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Menu_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_sidebar2;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void excecute() {
      
       ImageIcon iconTransaksi = new ImageIcon(getClass().getResource("/gambar/payment.png"));
       ImageIcon iconRiwayatTransaksi = new ImageIcon(getClass().getResource("/gambar/historytransaksi.png"));
       ImageIcon iconProduk = new ImageIcon(getClass().getResource("/gambar/produk.png"));
       ImageIcon iconRiwayat = new ImageIcon(getClass().getResource("/gambar/transaksi.png"));
       ImageIcon iconProfil = new ImageIcon(getClass().getResource("/gambar/account.png"));
//     ImageIcon iconBarang = new ImageIcon(getClass().getResource("/gambar/home.png"));

//        submenu
//        MenuItem produk1 = new MenuItem(null, true,iconBarang, "produk1", null);  
//        MenuItem produk2 = new MenuItem(null, true,iconBarang, "produk2", null);  
       

//        MenuItem menuHome = new MenuItem(iconHome, false,null, "Home",null);

       
        MenuItem menuKasir = new MenuItem(iconTransaksi, false,null, "Kasir",new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               pn_utama.removeAll();
               pn_utama.add(new Transaksi());
               pn_utama.repaint();
               pn_utama.revalidate();  }
       });
        MenuItem menuRiwayatTransaksi = new MenuItem(iconRiwayatTransaksi, false,null, "Riwayat Transaksi",new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               pn_utama.removeAll();
               pn_utama.add(new RiwayatTransaksi());
               pn_utama.repaint();
               pn_utama.revalidate();  }
       });
        MenuItem menuProduk = new MenuItem(iconProduk, false,null, "Produk", new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               pn_utama.removeAll();
               pn_utama.add(new Produk());
               pn_utama.repaint();
               pn_utama.revalidate();  }
       });
        MenuItem menuReport= new MenuItem(iconRiwayat, false,null, "Laporan Keuangan",new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               pn_utama.removeAll();
               pn_utama.add(new Laporan());
               pn_utama.repaint();
               pn_utama.revalidate();  }
       });
        MenuItem menuProfil = new MenuItem(iconProfil, false,null, "Profil", new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               pn_utama.removeAll();
               pn_utama.add(new ProfileKasir());
               pn_utama.repaint();
               pn_utama.revalidate();  }
       });
        addMenu(menuKasir,menuRiwayatTransaksi,menuProduk,menuReport,menuProfil);
    }
    
   private void addMenu(MenuItem... menu) {
    for (MenuItem item : menu) {
        pn_menu.add(item);
        ArrayList<MenuItem> subMenu = item.getSubMenu();
        for (MenuItem m : subMenu) {
            addMenu(m);  // Rekursif menambahkan submenu
        }
    }
    pn_menu.revalidate();  // Memastikan layout diperbarui
    pn_menu.repaint();     // Menyegarkan tampilan
}
}
