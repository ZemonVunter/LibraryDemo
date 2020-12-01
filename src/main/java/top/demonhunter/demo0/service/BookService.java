package top.demonhunter.demo0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.demonhunter.demo0.dao.BookMapper;
import top.demonhunter.demo0.model.Book;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public Book getById() {
        return bookMapper.getById();
    }
}
