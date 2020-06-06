package com.gordon.myblog.service.impl;

import com.gordon.myblog.entity.ArticleCategoryRef;
import com.gordon.myblog.dao.ArticleCategoryRefDao;
import com.gordon.myblog.service.ArticleCategoryRefService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ArticleCategoryRef)表服务实现类
 *
 * @author makejava
 * @since 2020-05-10 15:43:26
 */
@Service("articleCategoryRefService")
public class ArticleCategoryRefServiceImpl implements ArticleCategoryRefService {
    @Resource
    private ArticleCategoryRefDao articleCategoryRefDao;

    /**
     * 通过ID查询单条数据
     *
     * @param articleId 主键
     * @return 实例对象
     */
    @Override
    public ArticleCategoryRef queryById(Integer articleId) {
        return this.articleCategoryRefDao.queryById(articleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ArticleCategoryRef> queryAllByLimit(int offset, int limit) {
        return this.articleCategoryRefDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param articleCategoryRef 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleCategoryRef insert(ArticleCategoryRef articleCategoryRef) {
        this.articleCategoryRefDao.insert(articleCategoryRef);
        return articleCategoryRef;
    }

    /**
     * 修改数据
     *
     * @param articleCategoryRef 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleCategoryRef update(ArticleCategoryRef articleCategoryRef) {
        this.articleCategoryRefDao.update(articleCategoryRef);
        return this.queryById(articleCategoryRef.getArticleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.articleCategoryRefDao.deleteById(id) > 0;
    }
}