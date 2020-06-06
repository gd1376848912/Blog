package com.gordon.myblog.service.impl;

import com.gordon.myblog.entity.Page;
import com.gordon.myblog.dao.PageDao;
import com.gordon.myblog.service.PageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Page)表服务实现类
 *
 * @author makejava
 * @since 2020-05-10 15:43:33
 */
@Service("pageService")
public class PageServiceImpl implements PageService {
    @Resource
    private PageDao pageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pageId 主键
     * @return 实例对象
     */
    @Override
    public Page queryById(Object pageId) {
        return this.pageDao.queryById(pageId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Page> queryAllByLimit(int offset, int limit) {
        return this.pageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param page 实例对象
     * @return 实例对象
     */
    @Override
    public Page insert(Page page) {
        this.pageDao.insert(page);
        return page;
    }

    /**
     * 修改数据
     *
     * @param page 实例对象
     * @return 实例对象
     */
    @Override
    public Page update(Page page) {
        this.pageDao.update(page);
        return this.queryById(page.getPageId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pageId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object pageId) {
        return this.pageDao.deleteById(pageId) > 0;
    }
}