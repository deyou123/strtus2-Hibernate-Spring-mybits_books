import com.zdy.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.MetadataSources;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        final StandardServiceRegistry registry = new
                StandardServiceRegistryBuilder().configure().build();
        try{
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
        }catch (Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @Test
    public void testSaveUser(){
        User user = new User("hibernateUser1","123456","用户1");
        session.save(user);

    }

    @Test
    public void testGetUser(){
        User user = session.get(User.class, 2);
        System.out.println("****************************************");
        System.out.println("Use get Method:" + user.toString());
    }
    //load 查询需要记录必须存在
    @Test
    public void testLoadUser(){
        User user = session.load(User.class, 3);
        System.out.println(user.toString());
        System.out.println("Use load Method:" + user.toString());
    }
    @Test
    public void testDeleteUser(){
        User user = session.get(User.class, 3);
        session.delete(user);
    }

    @Test
    public void UpdateUseer(){
        User user = session.get(User.class, 1);
        user.setLoginName("张三");
        session.update(user);
    }
    @After
    public void destory(){
        transaction.commit();
        session.close();
        sessionFactory.close();
    }


}
