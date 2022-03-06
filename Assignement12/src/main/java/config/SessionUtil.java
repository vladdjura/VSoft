package config;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class SessionUtil {

    private static SessionFactory factory = null;

    static {
        factory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
    }

    public static Session getSession(){
        return factory.openSession();
    }

    public static void openSession(Session ses){
        factory.openSession();
    }

    public static void closeSession(Session ses){
        if(ses!=null){
            ses.close();
        }
    } 
}