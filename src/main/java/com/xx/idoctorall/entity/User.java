package com.xx.idoctorall.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "user")
@ApiModel
public class User implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;

    @ApiModelProperty("用户id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("用户密码")
    @JsonIgnore
    private String password;
    /**
     * TODO 忽略该字段的映射
     */
    @Transient
    private String  email;
    @Transient
    private boolean rememberMe;

    private String name;
    private int roleid;
    private String phone;
    private Date birthday;

}
