package com.example.FirstAPI.representing_inheritance.joinedTable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "jt_mentor")
@PrimaryKeyJoinColumn(name = "user_id")

public class Mentor extends User {
    private String company;
    private double avgRating;
}
