package bo.edu.ucb.Internship.backend.bl;
import bo.edu.ucb.Internship.backend.entity.Campus;
import bo.edu.ucb.Internship.backend.dao.CampusRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CampusBl{

    private CampusRepository campusRepository;


    public CampusBl(CampusRepository campusRepository) {
        this.campusRepository = campusRepository;
    }

    public Campus save(Campus newcampus) {
        return campusRepository.save(newcampus);
    }

    public List<Campus> findAll() {
        return campusRepository.findAll();
    }
    
}
