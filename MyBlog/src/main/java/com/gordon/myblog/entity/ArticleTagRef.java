package com.gordon.myblog.entity;

import java.io.Serializable;

/**
 * (ArticleTagRef)实体类
 *
 * @author makejava
 * @since 2020-05-10 15:43:26
 */
public class ArticleTagRef implements Serializable {
    private static final long serialVersionUID = -55914325672701968L;
    
    private Integer articleId;
    
    private Integer tagId;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

}