package fhibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class clientsave {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	    fhibernate.product p=new fhibernate.product();
		p.setProductid(101);
		p.setProdname("iphone");
		p.setPrice(25000);
		Transaction tx=session.beginTransaction();
        session.save(p);
        System.out.println("object saved successfully");
        tx.commit();
        session.close();
        factory.close();
	}

}
