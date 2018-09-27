package com.xx.idoctorall.entity.relation;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "role")
@ApiModel
public class Role {
    @ApiModelProperty("角色id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String rolename;

}
