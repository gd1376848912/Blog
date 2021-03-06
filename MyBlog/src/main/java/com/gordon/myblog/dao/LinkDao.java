package com.gordon.myblog.dao;

import com.gordon.myblog.entity.Link;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (Link)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-10 16:30:46
 */
@Mapper
public interface LinkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param linkId 主键
     * @return 实例对象
     */
    Link queryById(Object linkId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Link> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param link 实例对象
     * @return 对象列表
     */
    List<Link> queryAll(Link link);

    /**
     * 新增数据
     *
     * @param link 实例对象
     * @return 影响行数
     */
    int insert(Link link);

    /**
     * 修改数据
     *
     * @param link 实例对象
     * @return 影响行数
     */
    int update(Link link);

    /**
     * 通过主键删除数据
     *
     * @param linkId 主键
     * @return 影响行数
     */
    int deleteById(Object linkId);

}