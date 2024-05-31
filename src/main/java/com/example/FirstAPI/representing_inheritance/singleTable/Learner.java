package com.example.FirstAPI.representing_inheritance.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "learner")
public class Learner extends User {
    private String college;
    private String company;
}
