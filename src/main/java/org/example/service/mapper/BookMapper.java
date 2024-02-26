package org.example.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Book;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
    List<Book> selectBooks();
}
