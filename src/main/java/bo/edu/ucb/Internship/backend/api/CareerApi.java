package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.CareerBl;
import bo.edu.ucb.Internship.backend.entity.Career;

@RestController
@RequestMapping("/api/v1/career")
public class CareerApi {

    @Autowired
    private CareerBl careerBl;

    @GetMapping
    private ResponseEntity<List<Career>> findAllCareers() {
        return ResponseEntity.ok(careerBl.findAll());
    }

}
