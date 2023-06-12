package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.InternshipBl;
import bo.edu.ucb.Internship.backend.entity.Internship;

@RestController
@RequestMapping("/api/v1/internship")
public class InternshipApi {

    @Autowired
    private InternshipBl internshipBl;

    @GetMapping
    private ResponseEntity<List<Internship>> findAllInternships() {
        return ResponseEntity.ok(internshipBl.findAll());
    }

    
}
