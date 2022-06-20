
package com.hitoindividual.hitoswing.utility;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {
     private static final SessionFactory sessionFactory;
 static
 {
  try
  {
   sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
  }
  catch(HibernateException th){
   System.err.println("Enitial SessionFactory creation failed"+th);
   throw new ExceptionInInitializerError(th);
  }
   }
   public static SessionFactory getSessionFactory(){
    return sessionFactory;
   }
}
