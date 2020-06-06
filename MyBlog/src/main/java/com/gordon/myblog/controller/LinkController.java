package com.gordon.myblog.controller;

import com.gordon.myblog.entity.Link;
import com.gordon.myblog.service.LinkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Link)表控制层
 *
 * @author makejava
 * @since 2020-05-10 15:43:31
 */
@RestController
@RequestMapping("link")
public class LinkController {
    /**
     * 服务对象
     */
    @Resource
    private LinkService linkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Link selectOne(Object id) {
        return this.linkService.queryById(id);
    }

}