package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.SemesterBl;
import bo.edu.ucb.Internship.backend.entity.Semester;

@RestController
@RequestMapping("/api/v1/semester")
public class SemesterApi {

    @Autowired
    private SemesterBl semesterBl;

    @GetMapping
    private ResponseEntity<List<Semester>> findAllSemesters() {
        return ResponseEntity.ok(semesterBl.findAll());
    }
    
}
