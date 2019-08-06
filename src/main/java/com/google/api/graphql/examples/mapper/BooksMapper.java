package com.google.api.graphql.examples.mapper;

import com.google.api.graphql.examples.model.Books;
import com.google.api.graphql.examples.model.BooksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BooksMapper {
    int countByExample(BooksExample example);

    int deleteByExample(BooksExample example);

    int insert(Books record);

    int insertSelective(Books record);

    List<Books> selectByExample(BooksExample example);

    int updateByExampleSelective(@Param("record") Books record, @Param("example") BooksExample example);

    int updateByExample(@Param("record") Books record, @Param("example") BooksExample example);
}