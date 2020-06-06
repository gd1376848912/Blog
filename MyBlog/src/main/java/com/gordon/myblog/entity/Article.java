package com.gordon.myblog.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2020-05-10 13:39:53
 */
public class Article implements Serializable {
    private static final long serialVersionUID = 708711177716867764L;
    
    private Integer articleId;
    
    private Object articleUserId;
    
    private String articleTitle;
    
    private Object articleContent;
    
    private Integer articleViewCount;
    
    private Integer articleCommentCount;
    
    private Integer articleLikeCount;
    
    private Object articleIsComment;
    
    private Object articleStatus;
    
    private Object articleOrder;
    
    private Date articleUpdateTime;
    
    private Date articleCreateTime;
    
    private String articleSummary;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Object getArticleUserId() {
        return articleUserId;
    }

    public void setArticleUserId(Object articleUserId) {
        this.articleUserId = articleUserId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Object getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(Object articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public Object getArticleIsComment() {
        return articleIsComment;
    }

    public void setArticleIsComment(Object articleIsComment) {
        this.articleIsComment = articleIsComment;
    }

    public Object getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Object articleStatus) {
        this.articleStatus = articleStatus;
    }

    public Object getArticleOrder() {
        return articleOrder;
    }

    public void setArticleOrder(Object articleOrder) {
        this.articleOrder = articleOrder;
    }

    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public Date getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(Date articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

}