package com.vadimksn.schoolJournal.data.dao.subject;


import java.util.List;

public interface SubjectDao<BaseModel> {

    BaseModel createSubject(BaseModel baseModel);

    BaseModel updateSubject(BaseModel baseModel);

    boolean deleteSubjectById(int id);

    List<BaseModel> getListAllSubjects();
}
