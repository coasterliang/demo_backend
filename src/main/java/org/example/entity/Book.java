package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("book")
public class Book extends Model<Book> {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String author;

    private String intro;

    private int pubYear;

    private String isbn;
}
