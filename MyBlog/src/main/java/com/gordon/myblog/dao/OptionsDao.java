package com.gordon.myblog.dao;

import com.gordon.myblog.entity.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (Options)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-10 16:30:47
 */
@Mapper
public interface OptionsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param optionId 主键
     * @return 实例对象
     */
    Options queryById(Integer optionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Options> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param options 实例对象
     * @return 对象列表
     */
    List<Options> queryAll(Options options);

    /**
     * 新增数据
     *
     * @param options 实例对象
     * @return 影响行数
     */
    int insert(Options options);

    /**
     * 修改数据
     *
     * @param options 实例对象
     * @return 影响行数
     */
    int update(Options options);

    /**
     * 通过主键删除数据
     *
     * @param optionId 主键
     * @return 影响行数
     */
    int deleteById(Integer optionId);

}