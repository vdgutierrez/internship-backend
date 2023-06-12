package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.RepresentativeBl;
import bo.edu.ucb.Internship.backend.entity.Representative;

@RestController
@RequestMapping("/api/v1/representative")
public class RepresentativeApi {

    @Autowired
    private RepresentativeBl representativeBl;

    @GetMapping
    private ResponseEntity<List<Representative>> findAllRepresentatives() {
        return ResponseEntity.ok(representativeBl.findAll());
    }
   
}
