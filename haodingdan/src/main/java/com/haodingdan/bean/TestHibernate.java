package com.haodingdan.bean;

import javax.persistence.*;

/**
 * Created by tgj on 2014/11/14.
 */
@Entity
@Table(name = "test")
public class TestHibernate {
    private Integer id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
