package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "CURRICULUM")
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int curriculumId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAREER_ID")
    private Career career;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SE_STUDENT_STUDENT_ID")
    private Student student;

    // Constructor, getters, and setters

    public Curriculum() {
    }

    public Curriculum(int curriculumId, Career career, Student student) {
        this.curriculumId = curriculumId;
        this.career = career;
        this.student = student;
    }

    public int getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(int curriculumId) {
        this.curriculumId = curriculumId;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "{" +
            " curriculumId='" + getCurriculumId() + "'" +
            ", career='" + getCareer() + "'" +
            ", student='" + getStudent() + "'" +
            "}";
    }
}
