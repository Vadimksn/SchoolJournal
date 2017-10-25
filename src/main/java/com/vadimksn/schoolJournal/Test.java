package com.vadimksn.schoolJournal;


import com.vadimksn.schoolJournal.configuration.ApplicationConfig;
import com.vadimksn.schoolJournal.data.entity.Subject;
import com.vadimksn.schoolJournal.services.SubjectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SubjectService subjectService = (SubjectService) context.getBean("subjectService");
        subjectService.createSubject(new Subject("Ukrainian language"));
//        subjectService.deleteSubjectById(4);
        System.out.println(subjectService.getListAllSubjects());
    }
}
