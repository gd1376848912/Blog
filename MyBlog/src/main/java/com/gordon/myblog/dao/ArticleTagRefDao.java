package com.gordon.myblog.dao;

import com.gordon.myblog.entity.ArticleTagRef;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (ArticleTagRef)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-10 16:30:45
 */
@Mapper
public interface ArticleTagRefDao {

    /**
     * 通过ID查询单条数据
     *
     * @param articleId 主键
     * @return 实例对象
     */
    ArticleTagRef queryById(Integer articleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArticleTagRef> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param articleTagRef 实例对象
     * @return 对象列表
     */
    List<ArticleTagRef> queryAll(ArticleTagRef articleTagRef);

    /**
     * 新增数据
     *
     * @param articleTagRef 实例对象
     * @return 影响行数
     */
    int insert(ArticleTagRef articleTagRef);

    /**
     * 修改数据
     *
     * @param articleTagRef 实例对象
     * @return 影响行数
     */
    int update(ArticleTagRef articleTagRef);

    /**
     * 通过主键删除数据
     *
     * @param articleId 主键
     * @return 影响行数
     */
    int deleteById(Integer articleId);

}