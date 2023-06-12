package bo.edu.ucb.Internship.backend.bl;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import bo.edu.ucb.Internship.backend.dao.CareerRepository;
import bo.edu.ucb.Internship.backend.entity.Career;

@Service
public class CareerBl implements CareerRepository{

    @Autowired
    private CareerRepository careerRepository;

    public CareerBl(CareerRepository careerRepository){
        this.careerRepository = careerRepository;
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        
        
    }

    @Override
    public void deleteAllInBatch() {
        
        
    }

    @Override
    public void deleteAllInBatch(Iterable<Career> entities) {
        
        
    }

    @Override
    public <S extends Career> List<S> findAll(Example<S> example) {
        
        return null;
    }

    @Override
    public <S extends Career> List<S> findAll(Example<S> example, Sort sort) {
        
        return null;
    }

    @Override
    public void flush() {
        
        
    }

    @Override
    public Career getById(Integer arg0) {
        
        return null;
    }

    @Override
    public Career getOne(Integer arg0) {
        
        return null;
    }

    @Override
    public Career getReferenceById(Integer id) {
        
        return null;
    }

    @Override
    public <S extends Career> List<S> saveAllAndFlush(Iterable<S> entities) {
        
        return null;
    }

    @Override
    public <S extends Career> S saveAndFlush(S entity) {
        
        return null;
    }

    @Override
    public List<Career> findAll() {
        
        return careerRepository.findAll();
    }

    @Override
    public List<Career> findAllById(Iterable<Integer> ids) {
        
        return null;
    }

    @Override
    public <S extends Career> List<S> saveAll(Iterable<S> entities) {
        
        return null;
    }

    @Override
    public long count() {
        
        return 0;
    }

    @Override
    public void delete(Career entity) {
        
        
    }

    @Override
    public void deleteAll() {
        
        
    }

    @Override
    public void deleteAll(Iterable<? extends Career> entities) {
        
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        
        
    }

    @Override
    public void deleteById(Integer id) {
        
        
    }

    @Override
    public boolean existsById(Integer id) {
        
        return false;
    }

    @Override
    public Optional<Career> findById(Integer id) {
        
        return Optional.empty();
    }

    @Override
    public <S extends Career> S save(S entity) {
        
        return null;
    }

    @Override
    public List<Career> findAll(Sort sort) {
        
        return null;
    }

    @Override
    public Page<Career> findAll(Pageable pageable) {
        
        return null;
    }

    @Override
    public <S extends Career> long count(Example<S> example) {
        
        return 0;
    }

    @Override
    public <S extends Career> boolean exists(Example<S> example) {
        
        return false;
    }

    @Override
    public <S extends Career> Page<S> findAll(Example<S> example, Pageable pageable) {
        
        return null;
    }

    @Override
    public <S extends Career, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        
        return null;
    }

    @Override
    public <S extends Career> Optional<S> findOne(Example<S> example) {
        
        return Optional.empty();
    }

    

}
