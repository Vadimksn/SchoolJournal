package com.vadimksn.schoolJournal.data.entity;

import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseModel {
    private String name;
    private String surname;
    private String className;
    private List<Rating> ratings;

    @Builder
    public Student(int id, String name, String surname, String className, List<Rating> ratings) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.className = className;
        this.ratings = ratings;
    }
}
