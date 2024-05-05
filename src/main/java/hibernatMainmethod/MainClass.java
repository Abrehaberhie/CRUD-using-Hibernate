package hibernatMainmethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainClass {
    public static void main(String[] args){
        SessionFactory sessionFactory= Utility.getSessionFactory();
        Session session = sessionFactory.openSession();

        String version = (String) session.createNativeQuery("select version()").getSingleResult();
        System.out.println("print mysql version "+version);

    }
}
