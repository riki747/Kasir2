 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_user;

/**
 *
 * @author Lenovo
 */
import javax.swing.table.AbstractTableModel;
import model.model_user;

public class tablemod_user extends AbstractTableModel {
   
    private List<model_user>list = new ArrayList<>();
    
    public void tambahData(model_user moser){
        list.add(moser);
        fireTableRowsInserted(list.size() -1,list.size() -1);
        JOptionPane.showMessageDialog(null, "data berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, model_user moser){
        list.add(row,moser);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "data berhasil diperbarui");
    }
    
    
    public void hapusData (int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "data berhasil diperbarui");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<model_user> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_user moser) {
        list.set(index, moser);
        fireTableRowsUpdated(index, index);
        JOptionPane.showMessageDialog(null, "data berhasil dihapus");
    }
    
    public model_user getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
    return list.size();
    }
    
    private final String[] columnNames = {"ID User", "Nama", "Password", "Role", "Fullname", "Email", "No_telepon", "Alamat"};

    @Override
     public int getColumnCount() {
    // Implementasikan sesuai kebutuhan
    return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return list.get(rowIndex).getId_user();
            case 1: return list.get(rowIndex).getUsername();
            case 2: return list.get(rowIndex).getPassword();
            case 3: return list.get(rowIndex).getRole();
            case 4: return list.get(rowIndex).getFullname();
            case 5: return list.get(rowIndex).getEmail();
            case 6: return list.get(rowIndex).getNo_telepon();
            case 7: return list.get(rowIndex).getAlamat();
            
           
            default: return null;
        }
    }
    
   
    @Override
    public String getColumnName(int column){
        if (column == 0) {
            return "   " + columnNames[column];
        }else{
            return columnNames[column];
        }
    }
    }