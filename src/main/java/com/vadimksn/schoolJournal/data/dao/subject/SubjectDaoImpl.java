package com.vadimksn.schoolJournal.data.dao.subject;

import com.vadimksn.schoolJournal.data.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository("subjectDao")
public class SubjectDaoImpl implements SubjectDao<Subject> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Subject createSubject(Subject subject) {
        jdbcTemplate.update("insert into subjects (name) value (?);", subject.getName());
        return subject;
    }

    @Override
    public Subject updateSubject(Subject subject) {
        jdbcTemplate.update("update subjects set name=? where id=?;", subject.getName(), subject.getId());
        return subject;
    }

    @Override
    public boolean deleteSubjectById(int id) {
        jdbcTemplate.update("delete from subjects where id=?;", id);
        return true;
    }

    @Override
    public List<Subject> getListAllSubjects() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM school_journal.subjects;");
        return rowMapper(list);
    }

    private List<Subject> rowMapper(List<Map<String, Object>> list) {
        List<Subject> subjectList = new ArrayList<>();
        for (Map map : list) {
            Subject subject = Subject.builder()
                                     .id((Integer) map.get("id"))
                                     .name((String) map.get("name")).build();
            subjectList.add(subject);
        }
        return subjectList;
    }
}
