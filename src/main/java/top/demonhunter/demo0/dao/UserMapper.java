package top.demonhunter.demo0.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.demonhunter.demo0.model.User;
@Mapper
public interface UserMapper extends BaseMapper<User> {

}