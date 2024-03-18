package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.Book;

import java.util.List;

public interface BookService extends IService<Book> {

    List<Book> listBooks();

    Boolean saveClient(Book bookDetails);

    Boolean deleteBook(Long id);

    List<Book> query(String keyword);
}
