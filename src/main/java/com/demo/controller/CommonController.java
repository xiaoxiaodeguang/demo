package com.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.entity.ContractInfo;
import com.demo.entity.ContractOpposite;
import com.demo.service.CommonQuery;
import com.demo.service.ContractInfoService;
import com.demo.service.ContractOppositeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 武晓光
 * @since 2022-01-26
 */
@Api(tags = "公共查询测试")
@RestController
@RequestMapping("/common")
public class CommonController {
    @Autowired
    private ContractInfoService contractInfoService;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ContractOppositeService contractOppositeService;
    @GetMapping("/queryContractInfo")
    @ApiOperation("根据id查询合同信息的接口")
    @ApiImplicitParam(name = "id", value = "合同id",required = true)
    public ContractInfo queryContractInfoById(BigDecimal id){
        return contractInfoService.getById(id);
    }

    @GetMapping("/queryContractOpposite")
    @ApiOperation("根据相对方id查询相对方信息接口")
    @ApiImplicitParam(name = "id", value = "相对方id", required = true)
    public ContractOpposite queryContractOppositeById( BigDecimal id){
        return contractOppositeService.getById(id);
    }

    @GetMapping("/{path}")
    @ApiOperation("根据实体类service查询对应表数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tabName", value = "service名称", required = true),
            @ApiImplicitParam(name = "current", value = "查询当前页数", required = true),
            @ApiImplicitParam(name = "size", value = "当前页数数据条数", required = true),
            @ApiImplicitParam(name = "sortField", value = "排序字段", required = true)
    })
    public Page<?> queryListByName(String tabName, Long current, Long size, String sortField, @PathVariable String path){
        CommonQuery commonQuery = applicationContext.getBean(tabName, CommonQuery.class);
        return commonQuery.queryListByName(current,size,sortField,path);
    }
}
