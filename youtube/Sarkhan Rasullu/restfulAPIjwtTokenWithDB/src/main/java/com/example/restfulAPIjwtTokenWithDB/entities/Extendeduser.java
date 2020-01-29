/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulAPIjwtTokenWithDB.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author murad_isgandar
 */
@Entity
@Table(name = "extendeduser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extendeduser.findAll", query = "SELECT e FROM Extendeduser e")
    , @NamedQuery(name = "Extendeduser.findById", query = "SELECT e FROM Extendeduser e WHERE e.id = :id")
    , @NamedQuery(name = "Extendeduser.findByName", query = "SELECT e FROM Extendeduser e WHERE e.name = :name")
    , @NamedQuery(name = "Extendeduser.findBySurname", query = "SELECT e FROM Extendeduser e WHERE e.surname = :surname")
    , @NamedQuery(name = "Extendeduser.findByUsername", query = "SELECT e FROM Extendeduser e WHERE e.username = :username")
    , @NamedQuery(name = "Extendeduser.findByPassword", query = "SELECT e FROM Extendeduser e WHERE e.password = :password")
    , @NamedQuery(name = "Extendeduser.findByIsAdmin", query = "SELECT e FROM Extendeduser e WHERE e.isAdmin = :isAdmin")
    , @NamedQuery(name = "Extendeduser.findByAge", query = "SELECT e FROM Extendeduser e WHERE e.age = :age")})
public class Extendeduser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "isAdmin")
    private boolean isAdmin;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;

    public Extendeduser() {
    }

    public Extendeduser(Integer id) {
        this.id = id;
    }

    public Extendeduser(Integer id, String name, String surname, String username, String password, boolean isAdmin, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extendeduser)) {
            return false;
        }
        Extendeduser other = (Extendeduser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Extendeduser[ id=" + id + " ]";
    }
    
}
