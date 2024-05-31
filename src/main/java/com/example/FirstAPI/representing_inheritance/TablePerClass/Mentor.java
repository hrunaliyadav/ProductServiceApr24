package com.example.FirstAPI.representing_inheritance.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_Mentor")
public class Mentor extends User {
    private String company;
    private double avgRating;
}
