package hu.webler.weblerschoolmanytomany;

import hu.webler.weblerschoolmanytomany.service.CourseServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import hu.webler.weblerschoolmanytomany.entity.Course;
import hu.webler.weblerschoolmanytomany.entity.Student;
import hu.webler.weblerschoolmanytomany.persistence.CourseRepository;
import hu.webler.weblerschoolmanytomany.persistence.StudentRepository;

import java.util.HashSet;

@ExtendWith(MockitoExtension.class)
public class WeblerSchoolManyToManyApplicationTests{

    @Mock
    private CourseRepository courseRepository;

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private CourseServiceImpl courseService;

    @Test
    void addStudentToCourse_ShouldAddStudentToCourse() {
        // Arrange
        Long courseId = 1L;
        Long studentId = 1L;
        Course course = new Course();
        course.setId(courseId);
        course.setStudents(new HashSet<>());
        Student student = new Student();
        student.setId(studentId);

        when(courseRepository.findById(courseId)).thenReturn(java.util.Optional.of(course));
        when(studentRepository.findById(studentId)).thenReturn(java.util.Optional.of(student));
        when(courseRepository.save(any(Course.class))).thenReturn(course);

        Course updatedCourse = courseService.addStudentToCourse(courseId, studentId);

        assertTrue(updatedCourse.getStudents().contains(student));
    }
}
