package com.vadimksn.schoolJournal.data.entity;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject extends BaseModel {
    private String name;

    @Builder
    public Subject(int id, String name) {
        super(id);
        this.name = name;
    }
}
