package com.vadimksn.schoolJournal.data.dao.student;

import com.vadimksn.schoolJournal.data.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao<Student> {

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public boolean deleteStudentById(int id) {
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
