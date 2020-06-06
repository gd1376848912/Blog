package com.gordon.myblog.service.impl;

import com.gordon.myblog.entity.Options;
import com.gordon.myblog.dao.OptionsDao;
import com.gordon.myblog.service.OptionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Options)表服务实现类
 *
 * @author makejava
 * @since 2020-05-10 15:43:32
 */
@Service("optionsService")
public class OptionsServiceImpl implements OptionsService {
    @Resource
    private OptionsDao optionsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param optionId 主键
     * @return 实例对象
     */
    @Override
    public Options queryById(Integer optionId) {
        return this.optionsDao.queryById(optionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Options> queryAllByLimit(int offset, int limit) {
        return this.optionsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param options 实例对象
     * @return 实例对象
     */
    @Override
    public Options insert(Options options) {
        this.optionsDao.insert(options);
        return options;
    }

    /**
     * 修改数据
     *
     * @param options 实例对象
     * @return 实例对象
     */
    @Override
    public Options update(Options options) {
        this.optionsDao.update(options);
        return this.queryById(options.getOptionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param optionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer optionId) {
        return this.optionsDao.deleteById(optionId) > 0;
    }
}