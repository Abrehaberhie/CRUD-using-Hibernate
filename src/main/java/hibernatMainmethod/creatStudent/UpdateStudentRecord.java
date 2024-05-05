package hibernatMainmethod.creatStudent;

import hibernatMainmethod.Students;
import hibernatMainmethod.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateStudentRecord {
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tn =session.beginTransaction();
        Students stu =session.get(Students.class,1);
        stu.setSmark(10000.98);
        stu.setSname("amakelu berhie");
        session.merge(stu);
        tn.commit();
        session.close();
    }
}
