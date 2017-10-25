package com.vadimksn.schoolJournal.data.entity.enums;


public enum RatingType {
    USUAL("USUAL","The rating which is given for the usual task."),
    TEST("TEST","The rating which is given for the test task."),
    PERIOD("PERIOD","The rating which is given for the period."),
    FIRST_SEMESTER("FIRST_SEMESTER","The final rating for the first semester."),
    SECOND_SEMESTER("SECOND_SEMESTER","The final rating for the second semester."),
    FINAL("FINAL","The final rating for subject.");

    private String type;
    private String info;

    RatingType(String type, String info) {
        this.type = type;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
    public String getType() {
        return type;
    }
}
