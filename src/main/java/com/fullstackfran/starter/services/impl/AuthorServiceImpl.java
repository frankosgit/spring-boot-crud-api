package com.fullstackfran.starter.services.impl;

import com.fullstackfran.starter.entities.AuthorEntity;
import com.fullstackfran.starter.respositories.AuthorRepository;
import com.fullstackfran.starter.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity){
        return authorRepository.save(authorEntity);
    }

}
