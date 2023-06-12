package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import bo.edu.ucb.Internship.backend.bl.EntailmentBl;
import bo.edu.ucb.Internship.backend.entity.Entailment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/entailment")
public class EntailmentApi {

    @Autowired
    private EntailmentBl entailmentBl;

    @GetMapping
    private ResponseEntity<List<Entailment>> findAllEntailment() {
        return ResponseEntity.ok(entailmentBl.findAll());
    }
}
