package com.example.FirstAPI.representing_inheritance.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "Mentor")
public class Mentor extends User {
    private String company;
    private double avgRating;
}
