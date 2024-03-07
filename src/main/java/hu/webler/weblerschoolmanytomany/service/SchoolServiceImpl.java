package hu.webler.weblerschoolmanytomany.service;


import hu.webler.weblerschoolmanytomany.entity.School;
import hu.webler.weblerschoolmanytomany.persistence.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Override
    public School addSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolById(Long id) {
        return schoolRepository.findById(id).orElseThrow(() -> new RuntimeException("School not found"));
    }

    @Override
    public School updateSchool(Long id, School schoolDetails) {
        School school = getSchoolById(id);
        school.setName(schoolDetails.getName());
        school.setAddress(schoolDetails.getAddress());
        return schoolRepository.save(school);
    }

    @Override
    public void deleteSchool(Long id) {
        School school = getSchoolById(id);
        schoolRepository.delete(school);
    }
}

