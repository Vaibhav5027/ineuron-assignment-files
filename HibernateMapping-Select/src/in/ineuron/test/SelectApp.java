package in.ineuron.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.model.Student;
import in.ineuron.utility.HibernateUtility;

//to get the data from databse and display on the console i am using hql query

public class SelectApp {
	   @SuppressWarnings("unchecked")
	public static void main(String[] args) {
     Session session=null;
     try {
     if(session==null) {
    	 session=HibernateUtility.getSession();
     }
   
	  Query<Student> query = session.createQuery("FROM in.ineuron.model.Student");

     List<Student> student = query.getResultList();
     student.forEach(System.out::println);
	
	   } catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			HibernateUtility.closeSession(session);
			HibernateUtility.closeSessionFactory();
		}
}}
