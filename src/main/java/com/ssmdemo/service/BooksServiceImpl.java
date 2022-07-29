package com.ssmdemo.service;

import com.ssmdemo.bean.Book;
import com.ssmdemo.dao.BooksMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksMapper booksMapper;
    public List<Book> getAll(){
        return booksMapper.getAll();
    }
    public Book getById(@Param("bookid") String id){
        return booksMapper.getById(id);
    }
    public List<Book> getByColumn(Map map){
        return booksMapper.getByColumn(map);
    }
    public int insert(Book book){
        return booksMapper.insert(book);
    }
    public int delete(String id){
        return booksMapper.delete(id);
    }
    public int update(Book book){
        return booksMapper.update(book);
    }
}
