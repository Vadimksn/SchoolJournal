package com.vadimksn.schoolJournal.data.entity;


import com.vadimksn.schoolJournal.data.entity.enums.RatingType;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating extends BaseModel {
    private int rating;
    private int student_id;
    private int subject_id;
    private RatingType ratingType;
    private Date date;

    @Builder
    public Rating(int id,
                  int rating,
                  int student_id,
                  int subject_id,
                  RatingType ratingType, Date date) {
        super(id);
        this.rating = rating;
        this.student_id = student_id;
        this.subject_id = subject_id;
        this.ratingType = ratingType;
        this.date = date;
    }
}
