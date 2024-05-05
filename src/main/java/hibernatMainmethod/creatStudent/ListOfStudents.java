package hibernatMainmethod.creatStudent;

import hibernatMainmethod.Students;
import hibernatMainmethod.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import java.util.List;

public class ListOfStudents {
    public static void main(String[] args){
        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session=sessionFactory.openSession();
        SelectionQuery<Students> query=session.createSelectionQuery("from Students", Students.class);
        List<Students> studentsList = query.list();
       /* for(Students stu:studentsList)
        {
           System.out.println(stu);
        }
        */
        studentsList.forEach(xx->System.out.println(xx));
    }
}
