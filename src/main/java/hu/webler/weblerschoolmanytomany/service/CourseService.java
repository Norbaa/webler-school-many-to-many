package hu.webler.weblerschoolmanytomany.service;
import hu.webler.weblerschoolmanytomany.entity.Course;
import java.util.List;

public interface CourseService {
    Course addCourse(Course course);

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course updateCourse(Long id, Course course);

    void deleteCourse(Long id);

}



