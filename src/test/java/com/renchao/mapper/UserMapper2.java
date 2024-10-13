package com.renchao.mapper;

import com.renchao.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author ren_chao
 * @since 2024-10-13
 */
public interface UserMapper2 {
  @Select("select * from user where id = #{id}")
  User getUserById(int id);

  @Update("update user set name = #{name} where id = 100")
  int updateUserById(String name);


}
