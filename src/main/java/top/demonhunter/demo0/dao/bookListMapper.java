package top.demonhunter.demo0.dao;

import org.apache.ibatis.annotations.Mapper;
import top.demonhunter.demo0.model.Book;

import java.util.List;

@Mapper
public interface bookListMapper {
    List<Book> queryAll();
}
