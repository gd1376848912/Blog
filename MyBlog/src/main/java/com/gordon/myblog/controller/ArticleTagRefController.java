package com.gordon.myblog.controller;

import com.gordon.myblog.entity.ArticleTagRef;
import com.gordon.myblog.service.ArticleTagRefService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ArticleTagRef)表控制层
 *
 * @author makejava
 * @since 2020-05-10 15:43:27
 */
@RestController
@RequestMapping("articleTagRef")
public class ArticleTagRefController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleTagRefService articleTagRefService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ArticleTagRef selectOne(Integer id) {
        return this.articleTagRefService.queryById(id);
    }

}