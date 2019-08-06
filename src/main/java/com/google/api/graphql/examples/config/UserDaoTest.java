package com.google.api.graphql.examples.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author: 鲁子源
 * @Date: 2019/7/30
 * @Time: 17:00
 * @Description: No Description
 */
public class UserDaoTest {
    //Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    public static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "mybatis/configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

}
