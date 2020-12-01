package top.demonhunter.demo0.dao;

import org.apache.ibatis.annotations.Mapper;
import top.demonhunter.demo0.model.Book;

@Mapper
public interface BookMapper {
    Book getById();
}
