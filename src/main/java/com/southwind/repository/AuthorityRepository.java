package com.southwind.repository;

import com.southwind.entity.Authority;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorityRepository extends MongoRepository<Authority,String> {
    public PageImpl<Authority> findAll(Pageable pageable);
    public List<Authority> findAll();
    public Authority getById(String id);
    public void deleteById(String id);
}
