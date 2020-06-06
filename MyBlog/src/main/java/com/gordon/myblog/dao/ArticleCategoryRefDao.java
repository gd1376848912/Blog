package com.gordon.myblog.dao;

import com.gordon.myblog.entity.ArticleCategoryRef;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * (ArticleCategoryRef)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-10 16:30:44
 */
@Mapper
public interface ArticleCategoryRefDao {

    /**
     * 通过ID查询单条数据
     *
     * @param articleId 主键
     * @return 实例对象
     */
    ArticleCategoryRef queryById( Integer articleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArticleCategoryRef> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param articleCategoryRef 实例对象
     * @return 对象列表
     */
    List<ArticleCategoryRef> queryAll(ArticleCategoryRef articleCategoryRef);

    /**
     * 新增数据
     *
     * @param articleCategoryRef 实例对象
     * @return 影响行数
     */
    int insert(ArticleCategoryRef articleCategoryRef);

    /**
     * 修改数据
     *
     * @param articleCategoryRef 实例对象
     * @return 影响行数
     */
    int update(ArticleCategoryRef articleCategoryRef);

    /**
     * 通过主键删除数据
     *
     * @param articleId 主键
     * @return 影响行数
     */
    int deleteById(Integer articleId);

}