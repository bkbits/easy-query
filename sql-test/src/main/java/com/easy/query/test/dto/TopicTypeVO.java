package com.easy.query.test.dto;

import com.easy.query.core.annotation.Column;
import com.easy.query.core.annotation.EntityProxy;
import com.easy.query.test.conversion.EnumConverter;
import com.easy.query.test.enums.TopicTypeEnum;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDateTime;

/**
 * create time 2023/5/22 14:34
 * 文件说明
 *
 * @author xuejiaming
 */
@Data
@ToString
@EntityProxy
@FieldNameConstants
public class TopicTypeVO {

    private String id;
    private Integer stars;
    private String title;
    @Column(value = "topic_type1",conversion = EnumConverter.class)
    private TopicTypeEnum topicType;
    private LocalDateTime createTime;
}
