package com.demo.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public class CommonUtil {
    public static <E extends ServiceImpl<?,?>> Page<?> commonQueryUtil(E classType, Long current, Long size, String sortField,String[] field) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.orderByDesc(sortField);
        queryWrapper.select(field);
        return classType.page(new Page<>(current, size), queryWrapper);
    }
}
