package com.gordon.myblog.service.impl;

import com.gordon.myblog.entity.Link;
import com.gordon.myblog.dao.LinkDao;
import com.gordon.myblog.service.LinkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Link)表服务实现类
 *
 * @author makejava
 * @since 2020-05-10 15:43:31
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService {
    @Resource
    private LinkDao linkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param linkId 主键
     * @return 实例对象
     */
    @Override
    public Link queryById(Object linkId) {
        return this.linkDao.queryById(linkId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Link> queryAllByLimit(int offset, int limit) {
        return this.linkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    @Override
    public Link insert(Link link) {
        this.linkDao.insert(link);
        return link;
    }

    /**
     * 修改数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    @Override
    public Link update(Link link) {
        this.linkDao.update(link);
        return this.queryById(link.getLinkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param linkId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object linkId) {
        return this.linkDao.deleteById(linkId) > 0;
    }
}