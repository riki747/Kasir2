/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_produk;

/**
 *
 * @author Lenovo
 */
public class tablemod_produk extends AbstractTableModel {
   
    private List<model_produk>list = new ArrayList<>();
    
    public void tambahData(model_produk mopro){
        list.add(mopro);
        fireTableRowsInserted(list.size() -1,list.size() -1);
        JOptionPane.showMessageDialog(null, "data berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, model_produk mopro){
        list.add(row,mopro);
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
    
    public void setData(List<model_produk> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_produk mopro) {
        list.set(index, mopro);
        fireTableRowsUpdated(index, index);
        JOptionPane.showMessageDialog(null, "data berhasil dihapus");
    }
    
    public model_produk getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
    return list.size();
    }

    @Override
     public int getColumnCount() {
    // Implementasikan sesuai kebutuhan
    return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return list.get(rowIndex).getId_product();
            case 1: return list.get(rowIndex).getProduct_name();
            case 2: return list.get(rowIndex).getDescription();
            case 3: return list.get(rowIndex).getStock();
            case 4: return list.get(rowIndex).getExp();
            case 5: return list.get(rowIndex).getCreated_at();

            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0: return "Id Proruk";
            case 1: return "Nama Produk";
            case 2: return "Deskripsi";
            case 3: return "Stok";
            case 4: return "Exp";
            case 5: return "Dibuat";
            
            default: return null;    
            
        }     
      }  
    }
