package com.gordon.myblog.controller;

import com.gordon.myblog.entity.Tag;
import com.gordon.myblog.service.TagService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Tag)表控制层
 *
 * @author makejava
 * @since 2020-05-10 15:43:33
 */
@RestController
@RequestMapping("tag")
public class TagController {
    /**
     * 服务对象
     */
    @Resource
    private TagService tagService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Tag selectOne(Object id) {
        return this.tagService.queryById(id);
    }

}