package com.keveon.oa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Keveon on 2017/3/5.
 * 请假信息
 */
@Entity
@Table(name = "biz_leave")
@Data
@RequiredArgsConstructor
public class Leave implements Serializable {
    private static final long serialVersionUID = 5587190308923582841L;

    @Id
    @GeneratedValue
    @Column(name = "leave_id")
    Integer id;

    /**
     * 员工信息
     */
    @OneToOne
    @JoinColumn(name = "employee_sn")
    Employee employee;

    /**
     * 开始时间
     */
    @Column(name = "leave_start_time")
    Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "leave_end_time")
    Date endTime;

    /**
     * 请假天数
     */
    @Column(name = "leave_day", precision = 5, scale = 1)
    BigDecimal leaveDay;

    /**
     * 类型
     */
    @Column(name = "leave_type", length = 50)
    String leaveType;

    /**
     * 理由
     */
    @Column(name = "leave_reason", length = 500)
    String reason;

    /**
     * 下一位处理人
     */
    @Column(name = "leave_next_deal_sn", length = 50)
    String nextDealSn;

    /**
     *
     */
    @Column(name = "leave_approve_option", length = 100)
    String approveOption;

    /**
     * 状态
     */
    @Column(name = "leave_status", length = 20)
    String status;
}
