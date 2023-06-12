package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "CAREER")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int careerId;
    
    @Column(name = "CAREER_NAME", nullable = false)
    private String careerName;
    
    // Constructor, getters, and setters
    
    public Career() {
    }

    public Career(int careerId, String careerName) {
        this.careerId = careerId;
        this.careerName = careerName;
    }

    public int getCareerId() {
        return this.careerId;
    }

    public void setCareerId(int careerId) {
        this.careerId = careerId;
    }

    public String getCareerName() {
        return this.careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    @Override
    public String toString() {
        return "{" +
            " careerId='" + getCareerId() + "'" +
            ", careerName='" + getCareerName() + "'" +
            "}";
    }
}
