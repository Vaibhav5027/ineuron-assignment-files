package in.ineuron.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import in.ineuron.model.Student;
import in.ineuron.utility.HibernateUtility;

//to insert the data into databse and display on the console we are using native query

public class UpdateApp {

	@SuppressWarnings({"unchecked","rawtypes"})	
	
	
	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		try {

			session = HibernateUtility.getSession();
			transaction = session.getTransaction();
            transaction.begin();
		 Query query = session.createQuery("update in.ineuron.model.Student set saddress='Gujrat' where sid=:id");
			query = query.setParameter("id", 11);
            int affectedRow = query.executeUpdate();
			if(affectedRow>=1) {
				transaction.commit();
				System.out.println("Data Updated succesfully");
				System.out.println( "Available data");
				Query<Student> hqlQuery = session.createQuery("FROM in.ineuron.model.Student");

				List<Student> student = hqlQuery.getResultList();
				student.forEach(System.out::println);
			}
			else {
				System.out.println("student with this id not available");
			}
	}catch(HibernateException hbexception) {
		hbexception.printStackTrace();
	}finally
	{
		HibernateUtility.closeSession(session);
		HibernateUtility.closeSessionFactory();
	}
}}
