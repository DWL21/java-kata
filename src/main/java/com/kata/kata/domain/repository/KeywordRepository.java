package com.kata.kata.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kata.kata.domain.Keyword;

public interface KeywordRepository extends JpaRepository<Keyword, Long>{

    default Keyword get(Long id) {
        return findById(id).orElseThrow(IllegalArgumentException::new);
    }
}
