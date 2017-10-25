package com.vadimksn.schoolJournal.data.dao.student;


import java.util.List;

public interface StudentDao<BaseModel> {

    BaseModel createStudent(BaseModel baseModel);

    BaseModel updateStudent(BaseModel baseModel);

    boolean deleteStudentById(int id);

    List<BaseModel> getAllStudents();
}
