package com.gordon.myblog.controller;

import com.gordon.myblog.entity.Options;
import com.gordon.myblog.service.OptionsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Options)表控制层
 *
 * @author makejava
 * @since 2020-05-10 15:43:32
 */
@RestController
@RequestMapping("options")
public class OptionsController {
    /**
     * 服务对象
     */
    @Resource
    private OptionsService optionsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Options selectOne(Integer id) {
        return this.optionsService.queryById(id);
    }

}