package com.kata.kata.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import com.kata.kata.domain.Keyword;

import lombok.AccessLevel;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class KeywordResponse {
    
    private Long id;
    private String keyword;

    private KeywordResponse(
        final Long id,
        final String keyword
    ) {
        this.id = id;
        this.keyword = keyword;
    }

    public static KeywordResponse of(final Keyword keyword) {
        return new KeywordResponse(
            keyword.getId(),
            keyword.getKeyword()
            );
    }
}
