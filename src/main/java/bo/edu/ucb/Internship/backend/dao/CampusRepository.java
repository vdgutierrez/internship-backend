package bo.edu.ucb.Internship.backend.dao;
import bo.edu.ucb.Internship.backend.entity.Campus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampusRepository extends JpaRepository<Campus, Long>{
    
}
