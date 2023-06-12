package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "FUNCTION")
public class Function {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FUNCTION_ID")
    private Long functionId;

    @Column(name = "DETAIL", nullable = false)
    private String detail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERNSHIP_ID", nullable = false)
    private Internship internshipId;


    // Constructores, getters y setters

    public Function() {
    }

    public Function(String detail, Internship internshipId) {
        this.detail = detail;
        this.internshipId = internshipId;
    }


    public Long getFunctionId() {
        return this.functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
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
        return "Function{" +
                "functionId=" + functionId +
                ", detail='" + detail + '\'' +
                ", internshipId=" + internshipId +
                '}';
    }

}
