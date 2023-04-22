package com.example.papermanagementsystem.Entity;

import lombok.Data;

@Data
public class StuPaper {
    int id;
    String paperUrl;
    String msGroupId;
    String dbGroupId;
    String msScore;
    String finalScore;
}
