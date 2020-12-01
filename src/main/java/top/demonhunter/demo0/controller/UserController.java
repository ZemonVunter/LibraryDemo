package top.demonhunter.demo0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.demonhunter.demo0.model.Book;
import top.demonhunter.demo0.service.BookListService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class UserController {
    @Autowired
    private BookListService bookListService;

    @RequestMapping("/zhengfan")
    @ResponseBody
    public Object login() {
        Map<String, String> map = new HashMap<>();
        map.put("man", "郑钒");
        map.put("woman", "王嘉琪");
        return map;
    }

    @RequestMapping("/zhengfan1")
    @ResponseBody
    public List<Book> getById() {
        List<Book> book = bookListService.queryAll();
        return book;
    }
}
