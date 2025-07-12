package com.ayuky.Service;

import com.ayuky.Mapper.NewsMapper;
import com.ayuky.Pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;
    public List<News> getListNews() {
        return newsMapper.getlistNews();
    }
    public News getNewsById(Long id) {
        return newsMapper.getNewsById(id);
    }
    public boolean delNews(Long id) {
        return newsMapper.delNews(id) > 0;
    }
    public boolean addNews(News news) {
        return newsMapper.addNews(news) > 0;
    }
    public boolean updateNews(News news) {
        return newsMapper.updateNews(news) > 0;
    }
}
