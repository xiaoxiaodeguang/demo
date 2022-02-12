package com.demo.service;

import com.demo.entity.PageDef;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 武晓光
 * @since 2022-01-27
 */
public interface PageDefService extends IService<PageDef> {
    public String[] getFieldName (String path);
}
