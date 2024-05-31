package com.example.FirstAPI.representing_inheritance.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_TA")
public class TA extends User {
    private double avgRating;
    private String college;
}
