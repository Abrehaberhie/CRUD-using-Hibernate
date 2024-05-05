package hibernatMainmethod.creatStudent;

import hibernatMainmethod.Students;
import hibernatMainmethod.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeletStudent {
    public static void main(String[] args){
        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction trn = session.beginTransaction();
        Students stu = new Students();
        stu.setSno(4);
        session.remove(stu);
        trn.commit();
        session.close();
    }
}
