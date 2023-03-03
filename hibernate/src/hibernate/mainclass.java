package hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class mainclass
 {
     public static void main(String[] args) 
{
    	 Configuration cfg = new Configuration();
        cfg.configure("Student.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Student student = new Student();
        student.setName("kannan");
                student.setRoll("101");
                student.setPhone("9547854");
                student.setDegree("B.E");
         
                Transaction tx = session.beginTransaction();
                session.save(student);
                System.out.println("Saved successfully");
                tx.commit();
                session.close();
                factory.close();
            			}
        		}
