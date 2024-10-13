package com.renchao.mapper;

import com.renchao.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author ren_chao
 * @since 2024-10-13
 */
public interface UserMapper2 {
  @Select("select * from user where id = #{id}")
  User getUserById(int id);

}
