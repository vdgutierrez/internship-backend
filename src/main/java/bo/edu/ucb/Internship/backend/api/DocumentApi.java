package bo.edu.ucb.Internship.backend.api;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import bo.edu.ucb.Internship.backend.bl.DocumentBl;
import bo.edu.ucb.Internship.backend.entity.Document;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/document")
public class DocumentApi {

    @Autowired
    private DocumentBl documentBl;

    @GetMapping
    private ResponseEntity<List<Document>> findAllDocuments() {
        return ResponseEntity.ok(documentBl.findAll());
    }
    
}
