package hibernatMainmethod.creatStudent;

import hibernatMainmethod.Students;
import hibernatMainmethod.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class createStudentRecord {
    public static void main(String[] args){

        SessionFactory session = Utility.getSessionFactory();
        Session session1=session.openSession();
        Transaction tn = session1.beginTransaction();
        Students stu = new Students();
        stu.setSno(2);
        stu.setSname("merewa");
        stu.setSmark(543.98);
        session1.persist(stu);
        tn.commit();
        session1.close();

    }
}
