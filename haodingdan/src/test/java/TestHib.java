
import com.haodingdan.bean.TestHibernate;
import com.haodingdan.utils.hibernate.NativeHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;


/**
 * Created by tgj on 2014/11/14.
 */
public class TestHib {

    @Test
    public  void  test1(){
        Session session=NativeHibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        TestHibernate testHibernate=new TestHibernate();
        testHibernate.setId(0);
        testHibernate.setName("张三");
        session.save(testHibernate);
        transaction.commit();
        session.close();
    }
}
