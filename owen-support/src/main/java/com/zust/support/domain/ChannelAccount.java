package com.zust.support.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * 渠道账号信息
 *
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class ChannelAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账号名称
     */
    private String name;

    /**
     * 发送渠道
     * 枚举值放在com.zust.owen.common.enums.ChannelType
     */
    private Integer sendChannel;

    /**
     * 账号配置
     */
    private String accountConfig;

    /**
     * 账号拥有者
     */
    private String creator;

    /**
     * 创建时间
     */
    private Integer created;

    /**
     * 更新时间 单位s
     */
    private Integer updated;

    /**
     * 是否删除
     * 0：未删除
     * 1：已删除
     */
    private Integer isDeleted;
}
