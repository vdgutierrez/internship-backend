package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EXPERIENCE")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int experienceId;

    @Column(name = "DETAIL", nullable = false)
    private String detail;

    @Column(name = "START_DATE", nullable = false)
    private Date startDate;

    @Column(name = "END_DATE", nullable = false)
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRICULUM_ID")
    private Curriculum curriculum;

    // Constructor, getters, and setters

    public Experience() {
    }

    public Experience(int experienceId, String detail, Date startDate, Date endDate, Curriculum curriculum) {
        this.experienceId = experienceId;
        this.detail = detail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.curriculum = curriculum;
    }

    public int getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(int experienceId) {
        this.experienceId = experienceId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "experienceId=" + experienceId +
                ", detail='" + detail + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", curriculum=" + curriculum +
                '}';
    }
}

