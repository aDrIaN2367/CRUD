
package com.hitoindividual.hitoswing.controllers;

import com.hitoindividual.hitoswing.models.Product;
import com.hitoindividual.hitoswing.utility.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class createProduct {
     public static void main(String[] args) 
 {
  //Create student entity object
  Product product = new Product();
  product.setNombre("Adrian Tauste");
  product.setFecha(new Date());
  product.setUnidades(2);
  product.setPrecio(23f);
  product. setDisponible(true);
  
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  
  session.save(product);
  System.out.println("Inserted Successfully");
  session.getTransaction().commit();
  session.close();
  sessionFactory.close();
 }
    
}
