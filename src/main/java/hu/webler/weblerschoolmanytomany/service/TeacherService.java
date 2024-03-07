package hu.webler.weblerschoolmanytomany.service;

import hu.webler.weblerschoolmanytomany.entity.Teacher;
import java.util.List;

public interface TeacherService {
    Teacher addTeacher(Teacher teacher);
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
    Teacher updateTeacher(Long id, Teacher teacherDetails);
    void deleteTeacher(Long id);
}
