package com.ocr.P6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    User() {
        this.name = "Remplacez moi";
        this.id =  new Long(0);
        System.out.println("j'ai créé un user");
    }

    User(String nouveauNom) {
        this.name = nouveauNom;
    }

    User(String nouveauNom, Long nouveauID) {
        this.name = nouveauNom;
        this.id = nouveauID;
    }


    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
