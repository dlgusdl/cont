package shop.mtcoding.customer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardRepository {
    public int insert(@Param("title") String title, @Param("userId") int userId);

    public int updateById(@Param("id") int id, @Param("title") String title);

    public int daleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

}
