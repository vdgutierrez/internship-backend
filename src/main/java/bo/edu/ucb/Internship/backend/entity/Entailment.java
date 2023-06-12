package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "ENTAILMENT")
public class Entailment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entailmentId;
    
    @Column(name = "DETAIL", nullable = false)
    private String detail;
    
    // Constructor, getters, and setters
    
    public Entailment() {
    } 

    public Entailment(int entailmentId, String detail) {
        this.entailmentId = entailmentId;
        this.detail = detail;
    }


    public int getEntailmentId() {
        return this.entailmentId;
    }

    public void setEntailmentId(int entailmentId) {
        this.entailmentId = entailmentId;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "{" +
            " entailmentId='" + getEntailmentId() + "'" +
            ", detail='" + getDetail() + "'" +
            "}";
    }
}
