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

    @Override
     public int getColumnCount() {
    // Implementasikan sesuai kebutuhan
    return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return list.get(rowIndex).getId_user();
            case 1: return list.get(rowIndex).getUsername();
            case 2: return list.get(rowIndex).getPassword();
            case 3: return list.get(rowIndex).getRole();
            case 4: return list.get(rowIndex).getCreated_at1();
           
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0: return "Id User";
            case 1: return "Username";
            case 2: return "Password";
            case 3: return "Role";
            case 4: return "dibuat";
           
            
            default: return null;    
            
        }     
      }  
    }