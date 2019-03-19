package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "firstname", length = 30)
    private String firstname;

    @Column(name = "secondname", length = 30)
    private String secondname;

    @Column(name = "telephone", length = 15)
    private String telephone;

    @Column(name = "email", length = 30)
    private String email;

    @ManyToOne
    @JoinColumn
    private Company company;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<ContactDetail> contactDetails;

    public Contact(String firstname, String secondname, String telephone, String email) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.telephone = telephone;
        this.email = email;
    }
}
