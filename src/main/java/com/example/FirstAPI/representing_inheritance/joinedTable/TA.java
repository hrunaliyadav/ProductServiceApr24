package com.example.FirstAPI.representing_inheritance.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_TA")
@PrimaryKeyJoinColumn(name = "user_id")

public class TA extends User {
    private double avgRating;
    private String college;
}
