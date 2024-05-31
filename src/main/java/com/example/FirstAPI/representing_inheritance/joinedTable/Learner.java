package com.example.FirstAPI.representing_inheritance.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_learner")
@PrimaryKeyJoinColumn(name = "user_id")
public class Learner extends User {
    private String college;
    private String company;
}
