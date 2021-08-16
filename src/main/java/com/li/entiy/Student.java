package com.li.entiy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(value = "员工实体类",description = "这里是一些关于实体类的描述，给前端开发人员看")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @ApiModelProperty(value = "员工ID",required = false)
    private String id;
    private String name;
    private Double scope;
    private Date birthday;
}
