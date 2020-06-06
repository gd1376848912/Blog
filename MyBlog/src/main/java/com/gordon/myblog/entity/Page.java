package com.gordon.myblog.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Page)实体类
 *
 * @author makejava
 * @since 2020-05-10 13:39:53
 */
public class Page implements Serializable {
    private static final long serialVersionUID = -80658416887947213L;
    
    private Object pageId;
    
    private String pageKey;
    
    private String pageTitle;
    
    private Object pageContent;
    
    private Date pageCreateTime;
    
    private Date pageUpdateTime;
    
    private Object pageViewCount;
    
    private Object pageCommentCount;
    
    private Object pageStatus;


    public Object getPageId() {
        return pageId;
    }

    public void setPageId(Object pageId) {
        this.pageId = pageId;
    }

    public String getPageKey() {
        return pageKey;
    }

    public void setPageKey(String pageKey) {
        this.pageKey = pageKey;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public Object getPageContent() {
        return pageContent;
    }

    public void setPageContent(Object pageContent) {
        this.pageContent = pageContent;
    }

    public Date getPageCreateTime() {
        return pageCreateTime;
    }

    public void setPageCreateTime(Date pageCreateTime) {
        this.pageCreateTime = pageCreateTime;
    }

    public Date getPageUpdateTime() {
        return pageUpdateTime;
    }

    public void setPageUpdateTime(Date pageUpdateTime) {
        this.pageUpdateTime = pageUpdateTime;
    }

    public Object getPageViewCount() {
        return pageViewCount;
    }

    public void setPageViewCount(Object pageViewCount) {
        this.pageViewCount = pageViewCount;
    }

    public Object getPageCommentCount() {
        return pageCommentCount;
    }

    public void setPageCommentCount(Object pageCommentCount) {
        this.pageCommentCount = pageCommentCount;
    }

    public Object getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(Object pageStatus) {
        this.pageStatus = pageStatus;
    }

}