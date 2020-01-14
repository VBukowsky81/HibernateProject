import com.bukowsky.Customer;

import javax.persistence.*;
import java.util.List;

public class PersistanceTemplate {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("HibernateProject");

    public static void main(String args[]){

        ENTITY_MANAGER_FACTORY.close();
    }

    public static void addCustomer(int id, String fname, String lname){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
    }


    public static void getCustomer(int id) {

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT c FROM Customer c WHERE c.id = :custID";

        TypedQuery<Customer> tq = em.createQuery(query, Customer.class);
        tq.setParameter("custID", id);
        Customer cust = null;

    }

    public static void getCustomers() {

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String strQuery = "SELECT c FROM Customer c WHERE c.id IS NOT NULL";

        TypedQuery<Customer> tq = em.createQuery(strQuery, Customer.class);
        List<Customer> custs;


    public static void changeFName(int id, String fname){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        Customer cust = null;
    }

    public static void deleteCustomer(int id, String fname, String lname){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        Customer cust = null;
    }

}
