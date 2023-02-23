package shop.mtcoding.customer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {
    public int insert(@Param("username") String username, @Param("password") String password);

    public int updateById(@Param("id") int id, @Param("password") String password);

    public int dalereById(int id);

    public List<User> findAll();

    public User findById(int id);
}
