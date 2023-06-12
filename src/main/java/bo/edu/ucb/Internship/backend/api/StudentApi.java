package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bo.edu.ucb.Internship.backend.bl.StudentBl;
import bo.edu.ucb.Internship.backend.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/student")
public class StudentApi {

    @Autowired
    private StudentBl studentBl;

    @GetMapping
    private ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(studentBl.findAll());
    }
    
}
