package bo.edu.ucb.Internship.backend.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "SEMESTER")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int semesterId;

    @Column(name = "YEAR", nullable = false)
    private String year;
    
    @Column(name = "PERIOD", nullable = false)
    private String period;
    
    // Constructor, getters, and setters
    
    public Semester() {
    }

    public Semester(int semesterId, String year, String period) {
        this.semesterId = semesterId;
        this.year = year;
        this.period = period;
    }

    
    public int getSemesterId() {
        return semesterId;
    }
    
    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public String getPeriod() {
        return period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "{" +
            " semesterId='" + getSemesterId() + "'" +
            ", year='" + getYear() + "'" +
            ", period='" + getPeriod() + "'" +
            "}";
    }
}
