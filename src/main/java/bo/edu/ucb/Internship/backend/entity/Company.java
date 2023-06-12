package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "SE_COMPANY")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMPANY_ID")
    private Long companyId;

    @Column(name = "COMPANY_NAME", nullable = false)
    private String companyName;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "TELEPHONE", nullable = false)
    private String telephone;

    @Column(name = "DEPARTMENT", nullable = false)
    private String department;

    // Constructores, getters y setters

    public Company() {
    }

    public Company(String companyName, String type, String address, String telephone, String department) {
        this.companyName = companyName;
        this.type = type;
        this.address = address;
        this.telephone = telephone;
        this.department = department;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "{" +
            " companyId='" + getCompanyId() + "'" +
            ", companyName='" + getCompanyName() + "'" +
            ", type='" + getType() + "'" +
            ", address='" + getAddress() + "'" +
            ", telephone='" + getTelephone() + "'" +
            ", department='" + getDepartment() + "'" +
            "}";
    }
}

