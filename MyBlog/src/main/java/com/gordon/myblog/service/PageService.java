package com.gordon.myblog.service;

import com.gordon.myblog.entity.Page;
import java.util.List;

/**
 * (Page)表服务接口
 *
 * @author makejava
 * @since 2020-05-10 15:43:33
 */
public interface PageService {

    /**
     * 通过ID查询单条数据
     *
     * @param pageId 主键
     * @return 实例对象
     */
    Page queryById(Object pageId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Page> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param page 实例对象
     * @return 实例对象
     */
    Page insert(Page page);

    /**
     * 修改数据
     *
     * @param page 实例对象
     * @return 实例对象
     */
    Page update(Page page);

    /**
     * 通过主键删除数据
     *
     * @param pageId 主键
     * @return 是否成功
     */
    boolean deleteById(Object pageId);

}