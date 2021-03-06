package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("rpt_CarOnLineHourDetail")
public class RptCaronlinehourdetail extends Model<RptCaronlinehourdetail> {

    private static final long serialVersionUID=1L;

    @TableField("Id")
    private Integer Id;

    @TableId("GpsTime")
    private LocalDateTime GpsTime;

    @TableField("IsOnline")
    private Integer IsOnline;

    @TableField("SimNum")
    private String SimNum;

    @TableField("GpsDate")
    private LocalDateTime GpsDate;


    @Override
    protected Serializable pkVal() {
        return this.GpsTime;
    }

}
