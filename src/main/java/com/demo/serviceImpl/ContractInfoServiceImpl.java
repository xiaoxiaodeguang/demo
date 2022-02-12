package com.demo.serviceImpl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.ContractInfo;
import com.demo.mapper.ContractInfoMapper;
import com.demo.service.CommonQuery;
import com.demo.service.ContractInfoService;
import com.demo.service.PageDefService;
import com.demo.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 武晓光
 * @since 2022-01-26
 */
@Service("ContractInfoService")
public class ContractInfoServiceImpl extends ServiceImpl<ContractInfoMapper, ContractInfo> implements ContractInfoService, CommonQuery {
    @Autowired
    private PageDefService pageDefService;
    @Override
    public Page<?> queryListByName(Long current, Long size, String sortField, String path) {
        return  CommonUtil.commonQueryUtil(this,current,size,sortField,pageDefService.getFieldName(path));
    }
}
