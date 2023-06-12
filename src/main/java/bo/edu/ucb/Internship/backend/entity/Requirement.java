package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "REQUIREMENT")
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int requirementId;

    @Column(name = "DETAIL", nullable = false)
    private String detail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERNSHIP_ID", nullable = false)
    private Internship internship;

    // Constructor, getters, and setters

    public Requirement() {
    }

    public Requirement(int requirementId, String detail, Internship internship) {
        this.requirementId = requirementId;
        this.detail = detail;
        this.internship = internship;
    }

    public int getRequirementId() {
        return this.requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Internship getInternship() {
        return this.internship;
    }

    public void setInternship(Internship internship) {
        this.internship = internship;
    }

    @Override
    public String toString() {
        return "{" +
            " requirementId='" + getRequirementId() + "'" +
            ", detail='" + getDetail() + "'" +
            ", internship='" + getInternship() + "'" +
            "}";
    }

}
