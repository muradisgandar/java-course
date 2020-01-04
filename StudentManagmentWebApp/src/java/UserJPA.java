/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entities.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author murad_isgandar
 */
//@Stateless
public class UserJPA implements UserJPAInter{

//    @PersistenceUnit(unitName = "StudentManagmentDBPU")
    private EntityManagerFactory entityManagerFactory
            = Persistence.createEntityManagerFactory("StudentManagmentWebAppPU");
    
//    @PersistenceContext(unitName = "StudentManagmentDBPU")
//    private EntityManager em;

    @Override
    public User findUserById(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        User user = em.find(User.class, id);
        Query query = em.createQuery("select u from User u where u.id = :id");//JPQL query :id-parametr oldugunu gosterir
        query.setParameter("id", id);
        List<User> list = query.getResultList();
        em.close();
        if (list.size() > 0) {
            return list.get(0);
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createQuery("select u from User u");
        List<User> list = query.getResultList();
        em.close();
        return list;
    }

    @Override
    public List<User> getAllStudents(String name, String surname, Integer age) {

        if ((name == null || name.isEmpty()) && (surname == null || surname.isEmpty()) && age == null) {
            return getAll();
        }

        return null;

    }

    @Override
    public int addStudent(User u) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        return u.getId();
    }

    @Override
    public boolean updateStudent(User u) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        User user = em.merge(u);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public int deleteStudent(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.remove(user);
        em.getTransaction().commit();
        em.close();
        return 0;
    }

}
