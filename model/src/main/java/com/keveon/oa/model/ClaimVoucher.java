package com.keveon.oa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Keveon on 2017/3/5.
 * .
 */
@Entity
@Table(name = "biz_claim_voucher")
@Data
@RequiredArgsConstructor
public class ClaimVoucher implements Serializable {
    private static final long serialVersionUID = 3835627114293476667L;

    @Id
    @GeneratedValue
    @Column(name = "voucher_id")
    Integer id;

    /**
     * 下一位处理人
     */
    @OneToOne
    @JoinColumn(name = "voucher_next_deal_sn")
    Employee employee;

    /**
     * 创建人
     */
    @OneToOne
    @JoinColumn(name = "voucher_create_sn")
    Employee createEmployee;

    /**
     * 创建时间
     */
    @Column(name = "voucher_create_time")
    Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "voucher_modify_time")
    Date modifyTime;

    /**
     * 事件
     */
    @Column(name = "voucher_event")
    String event;

    /**
     *
     */
    @Column(name = "voucher_total_account", precision = 20, scale = 2)
    BigDecimal totalAccount;

    /**
     * 状态
     */
    @Column(name = "voucher_status", length = 20)
    String status;
}
