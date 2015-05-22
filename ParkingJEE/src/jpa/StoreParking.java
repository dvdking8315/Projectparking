package jpa;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

public class StoreParking {
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    Parking e1=new Parking();  
	    e1.setId(116);  
	    e1.setNom("TEST Ué");  
	    e1.setAdresse("jaiswal");  
	    
	    Parking e3=new Parking();  
	    e3.setId(113);  
	    e3.setNom("ER Ué");  
	    e3.setAdresse("jaiswal");
	    session.persist(e1);//persisting the object  
	    session.persist(e3);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      
	}  

}
