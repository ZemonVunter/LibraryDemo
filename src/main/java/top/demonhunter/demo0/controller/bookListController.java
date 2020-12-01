package top.demonhunter.demo0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.demonhunter.demo0.model.Book;
import top.demonhunter.demo0.service.BookListService;

import java.util.List;

@Controller
@RequestMapping("/book")
public class bookListController {

    @Autowired
    private BookListService bookListService;

    @RequestMapping("/query")
    @ResponseBody
    public List<Book> queryAll() {
        return bookListService.queryAll();
    }

//    @RequestMapping("/query1")
//    @ResponseBody
//    public List<Book> queryByAuthor(String author) {
//        return bookListService.queryByAuthor(author);
//    }

}
