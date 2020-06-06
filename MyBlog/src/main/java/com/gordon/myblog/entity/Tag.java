package com.gordon.myblog.entity;

import java.io.Serializable;

/**
 * (Tag)实体类
 *
 * @author makejava
 * @since 2020-05-10 13:39:53
 */
public class Tag implements Serializable {
    private static final long serialVersionUID = 540578562228114199L;
    
    private Object tagId;
    
    private String tagName;
    
    private String tagDescription;


    public Object getTagId() {
        return tagId;
    }

    public void setTagId(Object tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

}