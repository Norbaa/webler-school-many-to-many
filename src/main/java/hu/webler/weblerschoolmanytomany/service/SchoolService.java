package hu.webler.weblerschoolmanytomany.service;
import hu.webler.weblerschoolmanytomany.entity.School;
import java.util.List;

public interface SchoolService {
    School addSchool(School school);
    List<School> getAllSchools();
    School getSchoolById(Long id);
    School updateSchool(Long id, School schoolDetails);
    void deleteSchool(Long id);
}
