package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "DOCUMENT")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOCUMENT_ID")
    private Long documentId;

    @Column(name = "NAME", nullable = false)
    private String name;

    // Constructores, getters y setters

    public Document() {
    }

    public Document(String name) {
        this.name = name;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
      return "{" +
          " documentId='" + getDocumentId() + "'" +
          ", name='" + getName() + "'" +
          "}";
    }

}
