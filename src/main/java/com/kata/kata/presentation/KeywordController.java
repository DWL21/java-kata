package com.kata.kata.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kata.kata.application.KeywordService;
import com.kata.kata.application.dto.KeywordResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/keywords")
public class KeywordController {

    private final KeywordService keywordService;
    
    @GetMapping("{id}")
    public ResponseEntity<KeywordResponse> show(@PathVariable Long id) {
        return ResponseEntity.ok(keywordService.find(id));
    }

    @PostMapping
    public ResponseEntity<KeywordResponse> save(@RequestParam String keyword) {
        return ResponseEntity.created(null).body(keywordService.save(keyword));
    }
}
