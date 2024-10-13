package com.renchao;

import com.renchao.domain.User;
import com.renchao.mapper.UserMapper;
import com.renchao.mapper.UserMapper2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ren_chao
 * @since 2024-10-10
 */
public class Demo01 {
  public static void main(String[] args) throws IOException {
    InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
//      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//      User user = mapper.selectByPrimaryKey(100L);

      UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
      int i = mapper.updateUserById("大妖怪");
      sqlSession.commit();
      System.out.println(i);
//      User user = mapper.getUserById(100);
//      System.out.println(user);
    }
  }
}
