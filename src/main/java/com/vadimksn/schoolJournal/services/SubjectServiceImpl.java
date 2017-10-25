package com.vadimksn.schoolJournal.services;

import com.vadimksn.schoolJournal.data.dao.subject.SubjectDao;
import com.vadimksn.schoolJournal.data.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("subjectService")
public class SubjectServiceImpl implements SubjectService<Subject> {

    @Autowired
    private SubjectDao<Subject> subjectSubjectDao;

    @Override
    public Subject createSubject(Subject subject) {
        return subjectSubjectDao.createSubject(subject);
    }

    @Override
    public Subject updateSubject(Subject subject) {
        return subjectSubjectDao.updateSubject(subject);
    }

    @Override
    public boolean deleteSubjectById(int id) {
        return subjectSubjectDao.deleteSubjectById(id);
    }

    @Override
    public List<Subject> getListAllSubjects() {
        return subjectSubjectDao.getListAllSubjects();
    }
}
