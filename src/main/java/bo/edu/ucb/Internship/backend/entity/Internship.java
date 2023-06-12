package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SE_INTERNSHIP")
public class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INTERNSHIP_ID")
    private Long internshipId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REPRESENTATIVE_ID", nullable = false)
    private Representative representativeId;

    @Column(name = "START_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "END_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date endDate;

    // Constructores, getters y setters

    public Internship() {
    }

    public Internship(Representative representativeId, Date startDate, Date endDate) {
        this.representativeId = representativeId;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public Long getInternshipId() {
        return this.internshipId;
    }

    public void setInternshipId(Long internshipId) {
        this.internshipId = internshipId;
    }

    public Representative getRepresentativeId() {
        return this.representativeId;
    }

    public void setRepresentativeId(Representative representativeId) {
        this.representativeId = representativeId;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Internship{" +
                "internshipId=" + internshipId +
                ", representativeId=" + representativeId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
    
}
