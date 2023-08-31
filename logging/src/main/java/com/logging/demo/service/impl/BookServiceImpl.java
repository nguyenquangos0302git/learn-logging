package com.logging.demo.service.impl;

import com.logging.demo.dto.BookDTO;
import com.logging.demo.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements IBookService {

    @Override
    public List<BookDTO> findBooks() {
        log.info("[findBooks] -> Execute.");
        return new ArrayList<>();
    }
}
