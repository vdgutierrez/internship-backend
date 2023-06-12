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
import bo.edu.ucb.Internship.backend.dao.InternshipRepository;
import bo.edu.ucb.Internship.backend.entity.Internship;


@Service
public class InternshipBl implements InternshipRepository {

    @Autowired
    InternshipRepository internshipRepository;

    public InternshipBl(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    @Override
    public void flush() {
         
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends Internship> S saveAndFlush(S entity) {
         
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends Internship> List<S> saveAllAndFlush(Iterable<S> entities) {
         
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<Internship> entities) {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllByIdInBatch'");
    }

    @Override
    public void deleteAllInBatch() {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public Internship getOne(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Internship getById(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Internship getReferenceById(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends Internship> List<S> findAll(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Internship> List<S> findAll(Example<S> example, Sort sort) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Internship> List<S> saveAll(Iterable<S> entities) {
         
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public List<Internship> findAll() {
         
        return internshipRepository.findAll();
    }

    @Override
    public List<Internship> findAllById(Iterable<Integer> ids) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Internship> S save(S entity) {
         
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Internship> findById(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean existsById(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public long count() {
         
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public void deleteById(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public void delete(Internship entity) {
         
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Internship> entities) {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<Internship> findAll(Sort sort) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<Internship> findAll(Pageable pageable) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Internship> Optional<S> findOne(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends Internship> Page<S> findAll(Example<S> example, Pageable pageable) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Internship> long count(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends Internship> boolean exists(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends Internship, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }

    
}
