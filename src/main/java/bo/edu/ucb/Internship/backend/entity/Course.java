package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(name = "DETAIL", nullable = false)
    private String detail;

    @Column(name = "DATE", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "CURRICULUM_ID")
    private Curriculum curriculum;

    // Constructor, getters, and setters

    public Course() {
    }

    public Course(int courseId, String detail, Date date, Curriculum curriculum) {
        this.courseId = courseId;
        this.detail = detail;
        this.date = date;
        this.curriculum = curriculum;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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
        return "Course{" +
                "courseId=" + courseId +
                ", detail='" + detail + '\'' +
                ", date=" + date +
                ", curriculum=" + curriculum +
                '}';
    }
}

