/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.dao;

import java.util.List;
import main.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
    
/**
 *
 * @author murad_isgandar
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>,UserRepositoryCustom{
    
    @Query(value = "select u from User u where u.name = ?1 and u.surname = ?2 and u.age = ?3")
    public List<User> getAllStudents(String name, String surname, Integer age);
    
    public User findUserByUsername(String username);
}
