package com.renchao.mapper;

import com.renchao.domain.User;

import java.util.List;

public interface UserMapper {

  List<User> selectUser();

  User selectByPrimaryKey(Long id);

}
