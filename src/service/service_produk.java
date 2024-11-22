/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_produk;

/**
 *
 * @author Lenovo
 */
public interface service_produk {
   void tambahData(model_produk mopro);
   void perbaruiData (model_produk mopro);
   void hapusData (model_produk mopro);
   
   model_produk getByid (String id);
   
   List<model_produk> dapatData();
   List<model_produk> dapatData2();
   
   List<model_produk> cariData(String id);
   List<model_produk> cariData2(String id);
   
   String  nomeer();
   String  nomeer1();
   
}
