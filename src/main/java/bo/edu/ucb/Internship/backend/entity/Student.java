package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "SE_STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "STUDENT_NAME", nullable = false)
    private String studentName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "SECOND_NAME", nullable = false)
    private String secondName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAREER_ID", nullable = false)
    private Career careerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_ID", nullable = false)
    private Document documentId;

    @Column(name = "DOCUMENT_NUMBER", nullable = false)
    private String documentNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAMPUS_ID", nullable = false)
    private Campus campusId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEMESTER_ID", nullable = false)    
    private Semester semesterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENTAILMENT_ID", nullable = false)
    private Entailment entailementId;

    @Column(name = "AUD_USER", nullable = false)
    private String audUser;

    @Column(name = "AUD_HOST", nullable = false)
    private String audHost;

    @Column(name = "AUD_DATE", nullable = false)
    private String audDate;

    // Constructores, getters y setters

    public Student() {
    }

    public Student(String studentName, String lastName, String secondName, Career careerId, Document documentId, String documentNumber, Campus campusId, Semester semesterId, Entailment entailementId, String audUser, String audHost, String audDate) {
        this.studentName = studentName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.careerId = careerId;
        this.documentId = documentId;
        this.documentNumber = documentNumber;
        this.campusId = campusId;
        this.semesterId = semesterId;
        this.entailementId = entailementId;
        this.audUser = audUser;
        this.audHost = audHost;
        this.audDate = audDate;
    }

    public Long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Career getCareerId() {
        return this.careerId;
    }

    public void setCareerId(Career careerId) {
        this.careerId = careerId;
    }

    public Document getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(Document documentId) {
        this.documentId = documentId;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Campus getCampusId() {
        return this.campusId;
    }

    public void setCampusId(Campus campusId) {
        this.campusId = campusId;
    }

    public Semester getSemesterId() {
        return this.semesterId;
    }

    public void setSemesterId(Semester semesterId) {
        this.semesterId = semesterId;
    }

    public Entailment getEntailementId() {
        return this.entailementId;
    }

    public void setEntailementId(Entailment entailementId) {
        this.entailementId = entailementId;
    }

    public String getAudUser() {
        return this.audUser;
    }

    public void setAudUser(String audUser) {
        this.audUser = audUser;
    }

    public String getAudHost() {
        return this.audHost;
    }

    public void setAudHost(String audHost) {
        this.audHost = audHost;
    }

    public String getAudDate() {
        return this.audDate;
    }

    public void setAudDate(String audDate) {
        this.audDate = audDate;
    }

    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", studentName='" + getStudentName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", secondName='" + getSecondName() + "'" +
            ", careerId='" + getCareerId() + "'" +
            ", documentId='" + getDocumentId() + "'" +
            ", documentNumber='" + getDocumentNumber() + "'" +
            ", campusId='" + getCampusId() + "'" +
            ", semesterId='" + getSemesterId() + "'" +
            ", entailementId='" + getEntailementId() + "'" +
            ", audUser='" + getAudUser() + "'" +
            ", audHost='" + getAudHost() + "'" +
            ", audDate='" + getAudDate() + "'" +
            "}";
    }
}
