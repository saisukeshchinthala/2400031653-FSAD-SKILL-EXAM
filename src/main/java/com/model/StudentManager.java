package com.model;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StudentManager 
{
  public String insertData(Student s1)
  {
   SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
   Session se=sf.openSession();
   se.getTransaction().begin();
   se.persist(s1);
   se.getTransaction().commit();
   sf.close();
   se.close();
   return "Data was inserted Successfully";
  }
  public List<Student>getData()
  {
    List<Student>list=new ArrayList<Student>();
     SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session se=sf.openSession();
     se.getTransaction().begin();
     TypedQuery<Student>qry=se.createQuery("select s from Student s",Student.class);
     list=qry.getResultList();
     sf.close();
     se.close();
     return list;
  }
}