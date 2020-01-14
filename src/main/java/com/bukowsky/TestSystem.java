package com.bukowsky;

import javax.persistence.*;
import java.util.List;

public class TestSystem {

    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("HibernateProject");

    public static void main(String args[]){
        ENTITY_MANAGER_FACTORY.close();
    }

    public static void addCustomer(int id, String fname, String lname){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;

        try {
            et = em.getTransaction();
            et.begin();
            Customer cust = new Customer();
            cust.setId(id);
            cust.setFname(fname);
            cust.setlName(lname);
            em.persist(cust);
            et.commit();
        }
        catch(Exception ex) {
            if(et != null) {
                et.rollback();

            }
            ex.printStackTrace();
        }
        finally {
            {

                em.close();
            }
        }
    }

    public static void getCustomer(int id) {

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT c FROM Customer c WHERE c.id = :custID";

        TypedQuery<Customer> tq = em.createQuery(query, Customer.class);
        tq.setParameter("custID", id);
        Customer cust = null;
        try {

            cust = tq.getSingleResult();
            System.out.println(cust.getFname() + " " + cust.getlName());


        }
        catch(NoResultException ex) {
            ex.printStackTrace();
        }
        finally {
            em.close();
        }
    }

    public static void getCustomers() {

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String strQuery = "SELECT c FROM Customer c WHERE c.id IS NOT NULL";
        TypedQuery<Customer> tq = em.createQuery(strQuery, Customer.class);
        List<Customer> custs;
        try {
            custs = tq.getResultList();
            custs.forEach(cust-> System.out.println(cust.getFname() + " " +cust.getlName()));
        }
        catch(NoResultException ex) {
            ex.printStackTrace();
        }
        finally {
            em.close();
        }

    }

    public static void changeFName(int id, String fname){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        Customer cust = null;
        try {
            et = em.getTransaction();
            et.begin();
            cust = em.find(Customer.class, id);
            cust.setFname(fname);
            em.persist(cust);
            et.commit();

        }
        catch(Exception ex) {
            if(et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            {
                em.close();
            }
        }
    }

    public static void deleteCustomer(int id, String fname, String lname){

        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        Customer cust = null;
        try {
            et = em.getTransaction();
            et.begin();
            cust = em.find(Customer.class, id);
            em.remove(cust);
            em.persist(cust);
            et.commit();

        }
        catch(Exception ex) {
            if(et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            {
                em.close();
            }
        }
    }
}
