/**
 * This file was generated by the JPA Modeler
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author lapin
 */
@Entity
@XmlRootElement
public class Devis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String date;

    @ManyToOne(targetEntity = Client.class)
    private Client client;

    @ManyToOne(targetEntity = Recap.class)
    private Recap recap;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Recap getRecap() {
        return this.recap;
    }

    public void setRecap(Recap recap) {
        this.recap = recap;
    }

}
