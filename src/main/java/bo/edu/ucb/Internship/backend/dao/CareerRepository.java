package bo.edu.ucb.Internship.backend.dao;
import bo.edu.ucb.Internship.backend.entity.Career;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerRepository extends JpaRepository<Career, Integer> {
    
}
