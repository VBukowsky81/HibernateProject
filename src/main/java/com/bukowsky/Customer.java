package com.bukowsky;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GeneratedType.AUTO)
    @Column(name = "custID", unique = true ) //this is how u match primary key
    private int id;

    @Column(name = "firstName", nullable = false ) //other columns
    private String fname;

    @Column(name = "lastName", nullable = false )
    private String lName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


}
