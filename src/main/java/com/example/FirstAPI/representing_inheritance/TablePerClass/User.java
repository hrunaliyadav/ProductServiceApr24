package com.example.FirstAPI.representing_inheritance.TablePerClass;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tpc_user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private String password;
}
