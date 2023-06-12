package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.CampusBl;
import bo.edu.ucb.Internship.backend.entity.Campus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/campus")
public class CampusApi {
    
    @Autowired
    private CampusBl campusBl;

    @GetMapping
    private ResponseEntity<List<Campus>> findAllCampus() {
        return ResponseEntity.ok(campusBl.findAll());
    }
}
