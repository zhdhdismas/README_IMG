package com.shz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Geo {
    @TableId(type = IdType.AUTO)
    private int gid;
    private double longitude;
    private double latitude;
    private String name;
    @TableField(exist = false)
    private double distance;
}
