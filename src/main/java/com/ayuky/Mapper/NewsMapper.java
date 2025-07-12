package com.ayuky.Mapper;

import com.ayuky.Pojo.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsMapper {
    int addNews(News news);
    int updateNews(News news);
    int delNews(Integer id);
    List<News> getlistNews();
    News getNewsById(Integer id);
}
