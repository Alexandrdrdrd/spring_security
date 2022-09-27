//package com.sasha.oauthtest.springboot_oauth_test.model;
//
//
//import org.hibernate.annotations.Cascade;
//import org.springframework.security.core.parameters.P;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "username")
//    private String username;
//
//    @Column(name = "password")
//    private String password;
//
////    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
////    @JoinTable(name = "roles_users",
////            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
////            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
////    private List<Role> roles;
//
//    public User(String username, String password) {
//        this.username =  username;
//        this.password = password;
//    }
////
////    public void addRoleToUser(Role role){
////        if(roles == null){
////            roles = new ArrayList<Role>();
////        }
////        this.roles.add(role);
////    }
//    public User() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
////    public List<Role> getRoles() {
////        return roles;
////    }
////
////    public void setRoles(List<Role> roles) {
////        this.roles = roles;
////    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
////                ", roles=" + roles +
//                '}';
//    }
//}
//
