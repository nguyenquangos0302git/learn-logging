package com.logging.demo.service;

import com.logging.demo.dto.BookDTO;

import java.util.List;

public interface IBookService {

    List<BookDTO> findBooks();

}
