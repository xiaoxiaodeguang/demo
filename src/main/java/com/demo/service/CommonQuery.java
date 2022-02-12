package com.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface CommonQuery {
    public Page<?> queryListByName(Long current, Long size, String sortField, String path);
}
