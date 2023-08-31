package com.logging.demo.controller;

import com.logging.demo.dto.BookDTO;
import com.logging.demo.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class BookController {

    private final IBookService iBookService;

    public BookController(IBookService iBookService) {
        this.iBookService = iBookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<BookDTO>> findBooks() {
        log.info("[findBooks] -> Execute.");
        return ResponseEntity.status(HttpStatus.OK).body(iBookService.findBooks());
    }

}
