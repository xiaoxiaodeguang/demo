package com.demo.serviceImpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entityVo.FromField;
import com.demo.entity.PageDef;
import com.demo.mapper.PageDefMapper;
import com.demo.service.PageDefService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 武晓光
 * @since 2022-01-27
 */
@Service
@DS("slave")
public class PageDefServiceImpl extends ServiceImpl<PageDefMapper, PageDef> implements PageDefService {

    @Override
    public String[] getFieldName(String path) {
        if (path == null || "".equals(path)) throw new RuntimeException("路径不可为空!");
        String def = this.getById(path).getDef();
        if (def == null || "".equals(def)) throw new RuntimeException("表单字段配置信息为空!");
        String strIndexStr = "<property name=\"columns\">";
        int str = def.indexOf(strIndexStr);
        //对获取的数据进行截取,获取字段设置信息
        String stratString = def.substring(str+strIndexStr.length());
        int endString = stratString.indexOf("</property>");
        String resultStr = stratString.substring(0, endString);
        //对获取到的字符串进行转换
        JSONArray jsonArray=JSONArray.fromObject(resultStr);
        List<String> columnList = new ArrayList<>();
        for (Object o : jsonArray) {
            FromField fromField = (FromField) JSONObject.toBean(JSONObject.fromObject(o), FromField.class);
            columnList.add(fromField.getColumName());
        }
        String[] columnArr = new String[columnList.size()];
        columnList.toArray(columnArr);
        return columnArr;
    }
}
