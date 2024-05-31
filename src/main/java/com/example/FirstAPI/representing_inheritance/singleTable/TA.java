package com.example.FirstAPI.representing_inheritance.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "TA")
public class TA extends User {
    private double avgRating;
    private String college;
}
