package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_ChatMsg")
public class BizChatmsg extends Model<BizChatmsg> {

    private static final long serialVersionUID=1L;

    @TableField("SendUserID")
    private String SendUserID;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField("Msg")
    private String Msg;

    @TableField("ToUserID")
    private String ToUserID;

    @TableField("InsTime")
    private LocalDateTime InsTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
