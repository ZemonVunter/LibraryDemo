package top.demonhunter.demo0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.demonhunter.demo0.dao.bookListMapper;
import top.demonhunter.demo0.model.Book;

import java.util.List;

@Service
public class BookListService {
    @Autowired
    private bookListMapper bookListMapper;

    public List<Book> queryAll() {
        return bookListMapper.queryAll();
    }

}
