package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ContactDetail")
public class ContactDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "gender", length = 11)
    private int gender;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn
    private Contact contact;

    public ContactDetail(int gender, Date dateOfBirth) {
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
}
