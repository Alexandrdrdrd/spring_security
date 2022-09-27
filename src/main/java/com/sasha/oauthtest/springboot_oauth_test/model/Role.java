//package com.sasha.oauthtest.springboot_oauth_test.model;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "roles")
//public class Role {
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "name")
//    private String name;
//
//    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
//    private List<User> users;
//
//    public Role() {
//    }
//
//    public Role(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String  toString() {
//        return "Role{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", users=" + users +
//                '}';
//    }
//}
