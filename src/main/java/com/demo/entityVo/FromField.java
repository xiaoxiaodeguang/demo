package com.demo.entityVo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "表单字段信息")
public class FromField {
    public String name;
    public String caption;
    public String dataType;
    public String fieldName;
    public String columName;
}
