package com.google.api.graphql.examples.Service;

import com.google.api.graphql.examples.config.UserDaoTest;
import com.google.api.graphql.examples.mapper.BooksMapper;
import com.google.api.graphql.examples.mapper.UsersMapper;
import com.google.api.graphql.examples.model.Books;
import com.google.api.graphql.examples.model.BooksExample;
import com.google.api.graphql.examples.model.Users;
import com.google.api.graphql.examples.model.UsersExample;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author: 鲁子源
 * @Date: 2019/7/29
 * @Time: 16:43
 * @Description: No Description
 */

public class BookService {
    @Resource
    private  BooksMapper booksMapper;
    private UsersMapper usersMapper;

    public List<Books> finallBooks(){

        SqlSession sqlSession = UserDaoTest.getSessionFactory().openSession();
        BooksMapper userMapper = sqlSession.getMapper(BooksMapper.class);
        BooksExample booksExample = new BooksExample();
        List<Books> list = userMapper.selectByExample(booksExample);
//        UsersExample usersExample = new UsersExample();
//        usersExample.createCriteria().andIdEqualTo(1);
//        usersMapper.deleteByExample(usersExample);
//        System.out.println(list+"111");
        sqlSession.commit();
        sqlSession.close();
        return list;

    }
}
