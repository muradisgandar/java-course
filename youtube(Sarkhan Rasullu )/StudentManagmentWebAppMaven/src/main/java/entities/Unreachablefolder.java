/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author murad_isgandar
 */
@Entity
@Table(name = "unreachablefolder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unreachablefolder.findAll", query = "SELECT u FROM Unreachablefolder u")
    , @NamedQuery(name = "Unreachablefolder.findById", query = "SELECT u FROM Unreachablefolder u WHERE u.unreachablefolderPK.id = :id")
    , @NamedQuery(name = "Unreachablefolder.findByName", query = "SELECT u FROM Unreachablefolder u WHERE u.unreachablefolderPK.name = :name")})
public class Unreachablefolder implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UnreachablefolderPK unreachablefolderPK;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User userId;

    public Unreachablefolder() {
    }

    public Unreachablefolder(UnreachablefolderPK unreachablefolderPK) {
        this.unreachablefolderPK = unreachablefolderPK;
    }

    public Unreachablefolder(int id, String name) {
        this.unreachablefolderPK = new UnreachablefolderPK(id, name);
    }

    public UnreachablefolderPK getUnreachablefolderPK() {
        return unreachablefolderPK;
    }

    public void setUnreachablefolderPK(UnreachablefolderPK unreachablefolderPK) {
        this.unreachablefolderPK = unreachablefolderPK;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unreachablefolderPK != null ? unreachablefolderPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unreachablefolder)) {
            return false;
        }
        Unreachablefolder other = (Unreachablefolder) object;
        if ((this.unreachablefolderPK == null && other.unreachablefolderPK != null) || (this.unreachablefolderPK != null && !this.unreachablefolderPK.equals(other.unreachablefolderPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Unreachablefolder[ unreachablefolderPK=" + unreachablefolderPK + " ]";
    }
    
}
