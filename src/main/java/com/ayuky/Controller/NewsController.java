package com.ayuky.Controller;


import com.ayuky.Pojo.News;
import com.ayuky.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/News")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @GetMapping("/getlistNews")
    public List<News> getlistNews(){
        return newsService.getlistNews();
    }
    @GetMapping("/getNews")
    public News getStuById(@RequestParam Integer id){
        return newsService.getNewsById(id);
    }
    @GetMapping("/delstu")
    public boolean delStu(@RequestParam Integer id){
        return newsService.delNews(id);
    }
    @PostMapping("/addstu")
    public boolean addStu(@RequestBody News news){
        return newsService.addNews(news);
    }
    @PostMapping("/updatestu")
    public boolean updateStu(@RequestBody News news){
        return newsService.updateNews(news);
    }

}
