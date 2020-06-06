package com.gordon.myblog.entity;

import java.io.Serializable;

/**
 * (ArticleCategoryRef)实体类
 *
 * @author makejava
 * @since 2020-05-10 15:43:26
 */
public class ArticleCategoryRef implements Serializable {
    private static final long serialVersionUID = 195192000266350276L;
    
    private Integer articleId;
    
    private Integer categoryId;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

}