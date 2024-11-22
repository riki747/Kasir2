/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_user;

/**
 *
 * @author Lenovo
 */
public interface service_user {
    void tambahData(model_user moser);
   void perbaruiData (model_user moser);
   void hapusData (model_user moser);
   
   model_user getByid (String id);
   
   List<model_user> dapatData();
   List<model_user> dapatData2();
   
   List<model_user> cariData(String id);
   List<model_user> cariData2(String id);
   
   String  nomeer();
   String  nomeer1();
   
}
