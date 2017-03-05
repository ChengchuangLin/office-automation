package com.keveon.oa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Keveon on 2017/3/5.
 * 校验结果
 */
@Entity
@Table(name = "biz_check_result")
@Data
@RequiredArgsConstructor
public class CheckResult implements Serializable {
    private static final long serialVersionUID = 9189320613261693688L;

    @Id
    @GeneratedValue
    @Column(name = "result_id")
    Integer id;

    @OneToOne
    @JoinColumn(name = "claim_id")
    ClaimVoucher claimVoucher;

    /**
     * 创建时间
     */
    @Column(name = "result_create_time")
    Date createTime;

    /**
     * 检验员
     */
    @Column(name = "result_checker_sn", length = 50)
    String checkerSn;

    /**
     * 结果
     */
    @Column(name = "result", length = 50)
    String result;

    /**
     *
     */
    @Column(name = "result_comm", length = 500)
    String comm;
}
