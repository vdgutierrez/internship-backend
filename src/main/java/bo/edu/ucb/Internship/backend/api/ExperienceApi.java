package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import bo.edu.ucb.Internship.backend.bl.ExperienceBl;
import bo.edu.ucb.Internship.backend.entity.Experience;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/experience")
public class ExperienceApi {

    @Autowired
    private ExperienceBl experienceBl;

    @GetMapping
    private ResponseEntity<List<Experience>> findAllExperiences() {
        return ResponseEntity.ok(experienceBl.findAll());
    }
    
}
