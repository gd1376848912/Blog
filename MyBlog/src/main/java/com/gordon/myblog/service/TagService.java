package com.gordon.myblog.service;

import com.gordon.myblog.entity.Tag;
import java.util.List;

/**
 * (Tag)表服务接口
 *
 * @author makejava
 * @since 2020-05-10 15:43:33
 */
public interface TagService {

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    Tag queryById(Object tagId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tag> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tag 实例对象
     * @return 实例对象
     */
    Tag insert(Tag tag);

    /**
     * 修改数据
     *
     * @param tag 实例对象
     * @return 实例对象
     */
    Tag update(Tag tag);

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 是否成功
     */
    boolean deleteById(Object tagId);

}