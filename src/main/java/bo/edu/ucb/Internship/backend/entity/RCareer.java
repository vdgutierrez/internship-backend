package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "R_CAREER")
public class RCareer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "R_CARRER_ID")
    private Long rCareerId;

    @Column(name = "DETAIL", nullable = false)
    private String detail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERNSHIP_ID", nullable = false)
    private Internship internshipId;


    public RCareer() {
    }

    public RCareer(String detail, Internship internshipId) {
        this.detail = detail;
        this.internshipId = internshipId;
    }


    public Long getRCareerId() {
        return this.rCareerId;
    }

    public void setRCareerId(Long rCareerId) {
        this.rCareerId = rCareerId;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Internship getInternshipId() {
        return this.internshipId;
    }

    public void setInternshipId(Internship internshipId) {
        this.internshipId = internshipId;
    }


    @Override
    public String toString() {
        return "RCareer{" +
                "rCareerId=" + rCareerId +
                ", detail='" + detail + '\'' +
                ", internshipId=" + internshipId +
                '}';
    }
}