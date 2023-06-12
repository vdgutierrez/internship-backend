package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import bo.edu.ucb.Internship.backend.bl.CompanyBl;
import bo.edu.ucb.Internship.backend.entity.Company;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyApi {

    @Autowired
    private CompanyBl companyBl;

    @GetMapping
    private ResponseEntity<List<Company>> findAllCompanies() {
        return ResponseEntity.ok(companyBl.findAll());
    }
    
}
