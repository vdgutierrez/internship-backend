package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.CourseBl;
import bo.edu.ucb.Internship.backend.entity.Course;

@RestController
@RequestMapping("/api/v1/course")
public class CourseApi {

    @Autowired
    private CourseBl courseBl;

    @GetMapping
    private ResponseEntity<List<Course>> findAllCourses() {
        return ResponseEntity.ok(courseBl.findAll());
    }
    
}
