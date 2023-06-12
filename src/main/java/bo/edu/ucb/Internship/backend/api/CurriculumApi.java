package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.CurriculumBl;
import bo.edu.ucb.Internship.backend.entity.Curriculum;

@RestController
@RequestMapping("/api/v1/curriculum")
public class CurriculumApi {

    @Autowired
    private CurriculumBl curriculumBl;

    @GetMapping
    private ResponseEntity<List<Curriculum>> findAllCurriculums() {
        return ResponseEntity.ok(curriculumBl.findAll());
    }
    
}
