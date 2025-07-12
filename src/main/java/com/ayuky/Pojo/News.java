package com.ayuky.Pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class News {
    private Long id; // 主键
    private String title; // 标题
    private String summary; // 摘要（列表页展示）
    private String content; // 富文本内容（LongText）
    private String coverImage; // 封面图路径（如"/upload/news/1.jpg"）
    private LocalDateTime publishTime; // 发布时间
}

