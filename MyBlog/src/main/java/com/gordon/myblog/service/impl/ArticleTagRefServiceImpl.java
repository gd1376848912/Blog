package com.gordon.myblog.service.impl;

import com.gordon.myblog.entity.ArticleTagRef;
import com.gordon.myblog.dao.ArticleTagRefDao;
import com.gordon.myblog.service.ArticleTagRefService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ArticleTagRef)表服务实现类
 *
 * @author makejava
 * @since 2020-05-10 15:43:27
 */
@Service("articleTagRefService")
public class ArticleTagRefServiceImpl implements ArticleTagRefService {
    @Resource
    private ArticleTagRefDao articleTagRefDao;

    /**
     * 通过ID查询单条数据
     *
     * @param articleId 主键
     * @return 实例对象
     */
    @Override
    public ArticleTagRef queryById(Integer articleId) {
        return this.articleTagRefDao.queryById(articleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ArticleTagRef> queryAllByLimit(int offset, int limit) {
        return this.articleTagRefDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param articleTagRef 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleTagRef insert(ArticleTagRef articleTagRef) {
        this.articleTagRefDao.insert(articleTagRef);
        return articleTagRef;
    }

    /**
     * 修改数据
     *
     * @param articleTagRef 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleTagRef update(ArticleTagRef articleTagRef) {
        this.articleTagRefDao.update(articleTagRef);
        return this.queryById(articleTagRef.getArticleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param articleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer articleId) {
        return this.articleTagRefDao.deleteById(articleId) > 0;
    }
}