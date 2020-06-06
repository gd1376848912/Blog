package com.gordon.myblog.service;

import com.gordon.myblog.entity.Options;
import java.util.List;

/**
 * (Options)表服务接口
 *
 * @author makejava
 * @since 2020-05-10 15:43:32
 */
public interface OptionsService {

    /**
     * 通过ID查询单条数据
     *
     * @param optionId 主键
     * @return 实例对象
     */
    Options queryById(Integer optionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Options> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param options 实例对象
     * @return 实例对象
     */
    Options insert(Options options);

    /**
     * 修改数据
     *
     * @param options 实例对象
     * @return 实例对象
     */
    Options update(Options options);

    /**
     * 通过主键删除数据
     *
     * @param optionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer optionId);

}