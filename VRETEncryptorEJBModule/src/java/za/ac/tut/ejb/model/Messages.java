/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Student
 */
@Entity
@Table(name = "MESSAGES", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messages.findAll", query = "SELECT m FROM Messages m"),
    @NamedQuery(name = "Messages.findByMessageid", query = "SELECT m FROM Messages m WHERE m.messageid = :messageid"),
    @NamedQuery(name = "Messages.findByMessage", query = "SELECT m FROM Messages m WHERE m.message = :message"),
    @NamedQuery(name = "Messages.findByMessagelen", query = "SELECT m FROM Messages m WHERE m.messagelen = :messagelen"),
    @NamedQuery(name = "Messages.findByAgentid", query = "SELECT m FROM Messages m WHERE m.agentid = :agentid"),
    @NamedQuery(name = "Messages.findByDatecreated", query = "SELECT m FROM Messages m WHERE m.datecreated = :datecreated")})
public class Messages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer messageid;
    @Size(max = 300)
    @Column(length = 300)
    private String message;
    private Integer messagelen;
    private String agentid;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;

    public Messages() {
    }

    public Messages(String message, Integer messagelen, String agentid, Date datecreated) {
        this.message = message;
        this.messagelen = messagelen;
        this.agentid = agentid;
        this.datecreated = datecreated;
    }
    
    public Messages(Integer messageid) {
        this.messageid = messageid;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessagelen() {
        return messagelen;
    }

    public void setMessagelen(Integer messagelen) {
        this.messagelen = messagelen;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageid != null ? messageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messages)) {
            return false;
        }
        Messages other = (Messages) object;
        if ((this.messageid == null && other.messageid != null) || (this.messageid != null && !this.messageid.equals(other.messageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.ejb.model.Messages[ messageid=" + messageid + " ]";
    }
    
}
