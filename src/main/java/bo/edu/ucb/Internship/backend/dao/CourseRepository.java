package bo.edu.ucb.Internship.backend.dao;
import bo.edu.ucb.Internship.backend.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    
}
