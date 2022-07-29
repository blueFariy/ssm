package com.ssmdemo.dao;

import com.ssmdemo.bean.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BooksMapper {
    List<Book> getAll();
    Book getById(@Param("bookid") String id);
    List<Book> getByColumn(Map map);
    int insert(Book book);
    int delete(String id);
    int update(Book book);
}
