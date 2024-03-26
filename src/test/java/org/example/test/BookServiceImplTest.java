package org.example.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import org.example.entity.Book;
import org.example.service.mapper.BookMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@MybatisPlusTest
public class BookServiceImplTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    void testQueryBooks() {
        Assertions.assertFalse(bookMapper.selectList(new QueryWrapper<Book>()).isEmpty());
    }

    @Test
    void testInsertBook() {
        Book testBook = new Book();
        testBook.setAuthor("test author");
        testBook.setName("test book");
        testBook.setIsbn("123456678");
        testBook.setPubYear(2000);
        bookMapper.insert(testBook);

        Assertions.assertNotNull(testBook.getId());
    }

    @Test
    void testDeleteBook() {
        Book delBook = new Book();
        delBook.setId(2L);
        bookMapper.deleteById(delBook);
        Assertions.assertNull(bookMapper.selectById(delBook.getId()));
    }
}
