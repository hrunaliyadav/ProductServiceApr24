package com.example.FirstAPI.representing_inheritance.singleTable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity(name = "st_users")
@DiscriminatorColumn(name = "user_Type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "user")
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;
}
