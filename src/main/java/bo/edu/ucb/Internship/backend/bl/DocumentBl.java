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

import bo.edu.ucb.Internship.backend.dao.DocumentRepository;
import bo.edu.ucb.Internship.backend.entity.Document;

@Service
public class DocumentBl implements DocumentRepository{

    @Autowired
    DocumentRepository documentRepository;

    public DocumentRepository createDocument(DocumentRepository documentRepository) {
        return documentRepository;
    }

    @Override
    public void flush() {
          
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends Document> S saveAndFlush(S entity) {
          
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends Document> List<S> saveAllAndFlush(Iterable<S> entities) {
          
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<Document> entities) {
          
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
    public Document getOne(Integer id) {
          
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Document getById(Integer id) {
          
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Document getReferenceById(Integer id) {
          
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends Document> List<S> findAll(Example<S> example) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Document> List<S> findAll(Example<S> example, Sort sort) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Document> List<S> saveAll(Iterable<S> entities) {
          
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public List<Document> findAll() {
          
        return documentRepository.findAll();
    }

    @Override
    public List<Document> findAllById(Iterable<Integer> ids) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Document> S save(S entity) {
          
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Document> findById(Integer id) {
          
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
    public void delete(Document entity) {
          
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
          
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Document> entities) {
          
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
          
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<Document> findAll(Sort sort) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<Document> findAll(Pageable pageable) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Document> Optional<S> findOne(Example<S> example) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends Document> Page<S> findAll(Example<S> example, Pageable pageable) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Document> long count(Example<S> example) {
          
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends Document> boolean exists(Example<S> example) {
          
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends Document, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
          
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }

    

         
    
    
}
