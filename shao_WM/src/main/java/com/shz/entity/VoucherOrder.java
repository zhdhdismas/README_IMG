package com.shz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class VoucherOrder {
    @TableId(type=IdType.INPUT)
    private Long vcid;
    private Integer uid;
    private Long vid;
}
