package bo.edu.ucb.Internship.backend.bl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import bo.edu.ucb.Internship.backend.dao.SeminarRepository;
import bo.edu.ucb.Internship.backend.entity.Seminar;


@Service
public class SeminarBl implements SeminarRepository{

    @Autowired
    SeminarRepository seminarRepository;

    public SeminarBl(SeminarRepository seminarRepository) {
        this.seminarRepository = seminarRepository;
    }

    @Override
    public void flush() {
         
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends Seminar> S saveAndFlush(S entity) {
         
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends Seminar> List<S> saveAllAndFlush(Iterable<S> entities) {
         
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<Seminar> entities) {
         
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
    public Seminar getOne(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Seminar getById(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Seminar getReferenceById(Integer id) {
         
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends Seminar> List<S> findAll(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Seminar> List<S> findAll(Example<S> example, Sort sort) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Seminar> List<S> saveAll(Iterable<S> entities) {
         
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public List<Seminar> findAll() {
         
        return seminarRepository.findAll();
    }

    @Override
    public List<Seminar> findAllById(Iterable<Integer> ids) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Seminar> S save(S entity) {
         
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Seminar> findById(Integer id) {
         
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
    public void delete(Seminar entity) {
         
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Seminar> entities) {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
         
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<Seminar> findAll(Sort sort) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<Seminar> findAll(Pageable pageable) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Seminar> Optional<S> findOne(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends Seminar> Page<S> findAll(Example<S> example, Pageable pageable) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Seminar> long count(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends Seminar> boolean exists(Example<S> example) {
         
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends Seminar, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
         
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }
    
}
