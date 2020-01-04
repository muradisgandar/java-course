/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.dao;

import main.entities.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import main.dao.UserRepositoryCustom;

/**
 *
 * @author murad_isgandar
 */
@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @PersistenceContext
    EntityManager em;

    @Override
    public User findUserById(int id) {
//        User user = em.find(User.class, id);
        Query query = em.createQuery("select u from User u where u.id = :id");//JPQL query :id-parametr oldugunu gosterir
        query.setParameter("id", id);
        List<User> list = query.getResultList();
        if (list.size() > 0) {
            return list.get(0);
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        Query query = em.createQuery("select u from User u");
        List<User> list = query.getResultList();
        return list;
    }

    @Override
    public List<User> getAllStudents(String name, String surname, Integer age) {
        
        if ((name == null || name.isEmpty()) && (surname == null || surname.isEmpty()) && age == null) {
            return getAll();
        }
        Query query = em.createQuery("select u from User u where u.name= :name and u.surname= :surname and u.age= :age");
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        query.setParameter("age",age);

        List<User> list = query.getResultList();
        return list;

    }

    @Override
    public int addStudent(User u) {
        System.out.println("added");
        em.persist(u);
        return u.getId();
    }

    @Override
    public boolean updateStudent(User u) {
        User user = em.merge(u);
        return true;
    }

    @Override
    public int deleteStudent(int id) {
        User user = em.find(User.class, id);
        em.remove(user);
        return 0;
    }

}
