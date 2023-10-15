package com.kata.kata.application;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kata.kata.application.dto.KeywordResponse;
import com.kata.kata.domain.repository.KeywordRepository;
import com.kata.kata.domain.Keyword;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class KeywordService {
    
    private final KeywordRepository keywordRepository;

    public KeywordResponse save(String keyword) {
        Keyword saved_keyword = keywordRepository.save(new Keyword(keyword));
        KeywordResponse keywordResponse = KeywordResponse.of(saved_keyword);
        return keywordResponse;
    }

    public KeywordResponse find(final Long id) {
        Keyword keyword = keywordRepository.get(id);
        return KeywordResponse.of(keyword);
    }
}
