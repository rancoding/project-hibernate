package hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateGenericLibrary {
    
    private static Session session = null;
    
    /**
     * Initializes and opens the database session using hibernate
     */
    private static void openSession() {
        if(session == null) {
            session = HibernateUtil.getSessionFactory().openSession();
        }
    }
    
    /**
     * Retrieves all data from a database table into a list
     * @param hql
     * @return SQL consequent list
     */
    public static List executeHQLQuery(String hql)
    {
        try
        {
            openSession();
            session.beginTransaction();
            
            Query query = session.createQuery(hql);
            List list = query.list();
            session.getTransaction().commit();
            
            return list;
        }
        catch (HibernateException he)
        {
            he.printStackTrace();
        }
        
        return new ArrayList<>();
    } 
    
    /**
     * Saves an object on the database
     * @param o data to be saved in the database
     */
    public static void saveObject(Object o)
    {
        openSession();
        
        Transaction transaction = null;
        
        try
        {
            transaction = session.beginTransaction();
            session.save(o);
            transaction.commit();
        }
        catch(Exception ex)
        {
            if(transaction != null) { transaction.rollback(); }
        }
    }
    
    /**
     * Updates an object data on the database
     * @param o data do be updated on the database
     */
    public static void updateObject(Object o)
    {
        openSession();
        
        Transaction transaction = null;
        
        try
        {
            transaction = session.beginTransaction();
            session.update(o);
            transaction.commit();
        }
        catch(Exception ex)
        {
            if(transaction != null) { transaction.rollback(); }
        }
    }
    
    /**
     * Closes the session connection
     */
    public static void closeSession() {
        if(session == null) {
            session.close();
        }
    }
}
