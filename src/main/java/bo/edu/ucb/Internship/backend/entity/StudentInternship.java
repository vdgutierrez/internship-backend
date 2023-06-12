package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SE_STUDENT_INTERNSHIP")
public class StudentInternship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_INTERNSHIP_ID", nullable = false)
    private Long studentInternshipId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERNSHIP_ID", nullable = false)
    private Internship internshipId;

    @Column(name = "DATE", nullable = false)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SE_STUDENT_STUDENT_ID", nullable = false)
    private Student seStudentStudentId;

    // Constructores, getters y setters

    public StudentInternship() {
    }

    public StudentInternship(Internship internshipId, Date date, Student seStudentStudentId) {
        this.internshipId = internshipId;
        this.date = date;
        this.seStudentStudentId = seStudentStudentId;
    }


    public Long getStudentInternshipId() {
        return this.studentInternshipId;
    }

    public void setStudentInternshipId(Long studentInternshipId) {
        this.studentInternshipId = studentInternshipId;
    }

    public Internship getInternshipId() {
        return this.internshipId;
    }

    public void setInternshipId(Internship internshipId) {
        this.internshipId = internshipId;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getSeStudentStudentId() {
        return this.seStudentStudentId;
    }

    public void setSeStudentStudentId(Student seStudentStudentId) {
        this.seStudentStudentId = seStudentStudentId;
    }

    @Override
    public String toString() {
        return "StudentInternship{" +
                "studentInternshipId=" + studentInternshipId +
                ", internshipId=" + internshipId +
                ", date=" + date +
                ", seStudentStudentId=" + seStudentStudentId +
                '}';
    }
}
