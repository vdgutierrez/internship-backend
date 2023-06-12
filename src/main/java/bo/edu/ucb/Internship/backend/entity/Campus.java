package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "CAMPUS")
public class Campus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long campusId;
    
    @Column(name = "CAMPUS_NAME", nullable = false)
    private String campusName;
    
    // Constructor, getters, and setters
    
    public Campus() {
    }

    public Campus(Long campusId, String campusName) {
        this.campusId = campusId;
        this.campusName = campusName;
    }

    public Long getCampusId() {
        return this.campusId;
    }

    public void setCampusId(Long campusId) {
        this.campusId = campusId;
    }

    public String getCampusName() {
        return this.campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }
    
    @Override
    public String toString() {
        return "{" +
            " campusId='" + getCampusId() + "'" +
            ", campusName='" + getCampusName() + "'" +
            "}";
    }
}
