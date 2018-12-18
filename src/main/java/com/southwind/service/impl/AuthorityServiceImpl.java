package com.southwind.service.impl;

import com.southwind.entity.Authority;
import com.southwind.repository.AuthorityRepository;
import com.southwind.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    public List<Authority> findAll() {
        return authorityRepository.findAll();
    }

    public List<Authority> findAll(int page,int limit) {
        Pageable pageable = new PageRequest(page-1,limit);
        PageImpl<Authority> authorityPage = authorityRepository.findAll(pageable);
        return authorityPage.getContent();
    }

    public long count() {
        return authorityRepository.count();
    }

    public void save(Authority authority) {
        authorityRepository.save(authority);
    }

    public void delete(String id) {
        authorityRepository.deleteById(id);
    }

    public Authority find(String id) {
        return authorityRepository.getById(id);
    }
}
