package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Book;
import org.example.service.BookService;
import org.example.service.mapper.BookMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
    private final BookMapper bookMapper;
    @Override
    public List<Book> listBooks() {
        List<Book> allBookList = bookMapper.selectList(
                new QueryWrapper<Book>()
        );

        return allBookList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean saveClient(Book bookDetails) {
        this.saveOrUpdate(bookDetails);
        return Boolean.TRUE;
    }

    @Override
    public Boolean deleteBook(Long id) {
        return removeById(id);
    }

    @Override
    public List<Book> query(String keyword) {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", keyword);
        return bookMapper.selectList(queryWrapper);
    }
}
