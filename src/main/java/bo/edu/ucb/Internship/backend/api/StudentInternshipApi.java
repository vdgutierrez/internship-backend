package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import bo.edu.ucb.Internship.backend.bl.StudentInternshipBl;
import bo.edu.ucb.Internship.backend.entity.StudentInternship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student-internship")

public class StudentInternshipApi {

    @Autowired
    private StudentInternshipBl studentInternshipBl;

    @GetMapping
    private ResponseEntity<List<StudentInternship>> findAllStudentInternships() {
        return ResponseEntity.ok(studentInternshipBl.findAll());
    }
    
}
