package com.gordon.myblog.controller;

import com.gordon.myblog.entity.Page;
import com.gordon.myblog.service.PageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Page)表控制层
 *
 * @author makejava
 * @since 2020-05-10 15:43:33
 */
@RestController
@RequestMapping("page")
public class PageController {
    /**
     * 服务对象
     */
    @Resource
    private PageService pageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Page selectOne(Object id) {
        return this.pageService.queryById(id);
    }

}