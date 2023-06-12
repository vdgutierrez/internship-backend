package bo.edu.ucb.Internship.backend.dao;
import bo.edu.ucb.Internship.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer>{
    
}
