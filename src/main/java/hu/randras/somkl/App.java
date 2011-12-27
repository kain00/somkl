package hu.randras.somkl;

import hu.randras.somkl.user.User;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Session session = null;
		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for use
			SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			// Create new instance of user and set values in it by reading them from form object
			System.out.println("Inserting Record");
			User user = new User();
			user.setFirstName("Deepak");
			user.setLastName("Kumar");
			user.setEmail("ídeepak_38@yahoo.com");
			user.setPassword("123456");
			session.save(user);
			
			User u = (User)session.get(User.class, (long)3);
			
			u.setEmail("kain00@msn.com");
			
			session.update(u);
			
			session.delete(u);
			
			System.out.println(u);
			User v = (User)session.get(User.class, (long)10);
			System.out.println(v);
			
			
			
			@SuppressWarnings( "unchecked" )
			List<User> list = session.createSQLQuery("select {users.*} from users where firstName = ?")
		            .addEntity("users", User.class)
		            .setString(0, "Andris").list();
			
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// Actual user insertion will happen at this step
			session.flush();
			session.close();

		}

	}
}
