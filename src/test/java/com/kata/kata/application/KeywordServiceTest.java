package com.kata.kata.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kata.kata.application.dto.KeywordResponse;
import com.kata.kata.domain.Keyword;
import com.kata.kata.domain.repository.KeywordRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class KeywordServiceTest {
    
    @Autowired
    private KeywordService keywordService;

    @Autowired
    private KeywordRepository keywordRepository;

    @Test
    void save() {
        String keyword = "육군";
        KeywordResponse response = keywordService.save(keyword);

        assertThat(response.getKeyword()).isEqualTo(keyword);
    }
}
