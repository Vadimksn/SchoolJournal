package com.vadimksn.schoolJournal.services;


import java.util.List;

public interface SubjectService<BaseModel> {

    BaseModel createSubject(BaseModel baseModel);

    BaseModel updateSubject(BaseModel baseModel);

    boolean deleteSubjectById(int id);

    List<BaseModel> getListAllSubjects();
}
