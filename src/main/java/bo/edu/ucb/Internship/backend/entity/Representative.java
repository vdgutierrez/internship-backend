package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "SE_REPRESENTATIVE")

public class Representative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPRESENTATIVE_ID")
    private Long representativeId;

    @Column(name = "REPRESENTATIVE_NAME", nullable = false)
    private String representativeName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "SECOND_NAME", nullable = false)
    private String secondName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_ID", nullable = false)
    private Document documentId;

    @Column(name = "DOCUM_NUMBER", nullable = false)
    private String documentNumber;

    @Column(name = "TELEPHONE", nullable = false)
    private String telephone;

    @Column(name = "AREA", nullable = false)
    private String area;

    @Column(name = "POSITION", nullable = false)
    private String position;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID", nullable = false)
    private Company companyId;

    @Column(name = "AUD_USER", nullable = false)
    private String audUser;

    @Column(name = "AUD_HOST", nullable = false)
    private String audHost;

    @Column(name = "AUD_DATE", nullable = false)
    private String audDate;

    // Constructores, getters y setters

    public Representative() {
    }

    public Representative(String representativeName, String lastName, String secondName, Document documentId, String documentNumber, String telephone, String area, String position, Company companyId, String audUser, String audHost, String audDate) {
        this.representativeName = representativeName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.documentId = documentId;
        this.documentNumber = documentNumber;
        this.telephone = telephone;
        this.area = area;
        this.position = position;
        this.companyId = companyId;
        this.audUser = audUser;
        this.audHost = audHost;
        this.audDate = audDate;
    }


    public Long getRepresentativeId() {
        return this.representativeId;
    }

    public void setRepresentativeId(Long representativeId) {
        this.representativeId = representativeId;
    }

    public String getRepresentativeName() {
        return this.representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
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

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Company getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
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
    public String toString(){
        return "{" +
            " representativeId='" + getRepresentativeId() + "'" +
            ", representativeName='" + getRepresentativeName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", secondName='" + getSecondName() + "'" +
            ", documentId='" + getDocumentId() + "'" +
            ", documentNumber='" + getDocumentNumber() + "'" +
            ", telephone='" + getTelephone() + "'" +
            ", area='" + getArea() + "'" +
            ", position='" + getPosition() + "'" +
            ", companyId='" + getCompanyId() + "'" +
            ", audUser='" + getAudUser() + "'" +
            ", audHost='" + getAudHost() + "'" +
            ", audDate='" + getAudDate() + "'" +
            "}";
    }
}
