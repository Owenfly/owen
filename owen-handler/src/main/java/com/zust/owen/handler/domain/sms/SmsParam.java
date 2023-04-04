package com.zust.owen.handler.domain.sms;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * 发送短信参数值
 *
 * */
@Data
@Builder
public class SmsParam {

    /**
     * 业务Id
     */
    private Long messageTemplateId;

    /**
     * 发送的手机号
     */
    private Set<String> phones;


    /** 备忘录
     * 发送账号的id（如果短信模板指定了发送账号，则该字段有值）
     * 如果有账号id，那就用账号id 检索
     * 如果没有账号id，那就根据 #scriptName 检索
     */
    private Integer sendAccountId;

    /**
     * 渠道账号的脚本名标识
     */
    private String scriptName;

    /**
     * 发送文案
     */
    private String content;
}
