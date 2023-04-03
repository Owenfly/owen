package com.zust.owen.common.domain;

import com.zust.owen.common.dto.model.ContentModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 *
 * 发送任务信息
 *
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskInfo {

    /**
     * 消息模板id
     */
    private Long messageTemplateId;

    /**
     * 业务id
     */
    private Long businessId;

    /**
     * 接收者
     */
    private Set<String> receiver;

    /**
     * 发送的id类型
     */
    private Integer idType;

    /**
     * 发送渠道
     */
    private Integer sendChannel;

    /**
     *  模板类型
     */
    private Integer templateType;

    /**
     * 消息类型
     */
    private Integer msgType;

    /**
     * 屏蔽类型
     */
    private Integer shieldType;

    /**
     *  发送文案模型
     *  用于处理不同渠道的不同内容
     */
    private ContentModel contentModel;

    /**
     * 发送账号
     */
    private Integer sendAccount;

}
