/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @author LIGhEsTaL
 */
public interface OfficesDao {
    //recibe un objeto de tipo OfficeModel y crea una nueva oficina en la base de datos
   public String createOffice(OfficesModel newOffice);
   
   //Devuelve un listado de las oficinas
   //almacenadas en la tabla Offices
   public ArrayList<OfficesModel> readOffices();
   
   //Recube un objeto de tipo OfficeModel y
   //actuliza un oficina
   public String updateOffice(OfficesModel auxOffice);
   
   //Borra una oficina de la tabla offices
   //de acuerdo al id recibido
   public String deleteOffice(String officeCode);
}
