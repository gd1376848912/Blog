package com.gordon.myblog.service;

import com.gordon.myblog.entity.ArticleTagRef;
import java.util.List;

/**
 * (ArticleTagRef)表服务接口
 *
 * @author makejava
 * @since 2020-05-10 15:43:27
 */
public interface ArticleTagRefService {

    /**
     * 通过ID查询单条数据
     *
     * @param articleId 主键
     * @return 实例对象
     */
    ArticleTagRef queryById(Integer articleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArticleTagRef> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param articleTagRef 实例对象
     * @return 实例对象
     */
    ArticleTagRef insert(ArticleTagRef articleTagRef);

    /**
     * 修改数据
     *
     * @param articleTagRef 实例对象
     * @return 实例对象
     */
    ArticleTagRef update(ArticleTagRef articleTagRef);

    /**
     * 通过主键删除数据
     *
     * @param articleId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer articleId);

}