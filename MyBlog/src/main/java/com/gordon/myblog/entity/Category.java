package com.gordon.myblog.entity;

import java.io.Serializable;

/**
 * (Category)实体类
 *
 * @author makejava
 * @since 2020-05-10 15:43:27
 */
public class Category implements Serializable {
    private static final long serialVersionUID = -59116288189082830L;
    
    private Object categoryId;
    
    private Integer categoryPid;
    
    private String categoryName;
    
    private String categoryDescription;
    
    private Object categoryOrder;
    
    private String categoryIcon;


    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Object getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Object categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

}