package com.example.FirstAPI.representing_inheritance.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_learner")
public class Learner extends User {
    private String college;
    private String company;
}
