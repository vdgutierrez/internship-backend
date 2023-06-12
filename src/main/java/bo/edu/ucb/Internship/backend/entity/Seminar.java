package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SEMINAR")
public class Seminar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seminarId;

    @Column(name = "DETAIL", nullable = false)
    private String detail;

    @Column(name = "DATE", nullable = false)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRICULUM_ID", nullable = false)
    private Curriculum curriculum;

    // Constructor, getters, and setters

    public Seminar() {
    }

    public Seminar(int seminarId, String detail, Date date, Curriculum curriculum) {
        this.seminarId = seminarId;
        this.detail = detail;
        this.date = date;
        this.curriculum = curriculum;
    }

    public int getSeminarId() {
        return seminarId;
    }

    public void setSeminarId(int seminarId) {
        this.seminarId = seminarId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "{" +
            " seminarId='" + getSeminarId() + "'" +
            ", detail='" + getDetail() + "'" +
            ", date='" + getDate() + "'" +
            ", curriculum='" + getCurriculum() + "'" +
            "}";
    }
}
