//package by.ramok.kasbi.entities;
//
//import lombok.Data;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.Table;
//import javax.persistence.InheritanceType;
//
//@Entity
//@Table(name = "users")
//@Inheritance(strategy = InheritanceType.JOINED)
//@Data
//public class User {
//
//    @Id
//    private String username;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column(nullable = false)
//    private int userType;
//
//    @Column(nullable = false, unique = true)
//    private String email;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false)
//    private String lastName;
//
//    private String tel;
//
//    private Date bornDate;
//
//
//}
