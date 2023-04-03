package com.zust.owen.common.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 日志参数信息
 *
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LogParam {

    /**
     * 需要记录的日志
     */
    private Object object;

    /**
     * 日志的业务类型
     */
    private String bizType;

    /**
     * 时间戳
     */
    private long timestamp;


}
