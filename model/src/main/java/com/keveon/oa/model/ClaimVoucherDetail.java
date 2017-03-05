package com.keveon.oa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Keveon on 2017/3/5.
 * 索赔凭证细节
 */
@Entity
@Table(name = "biz_claim_voucher_detail")
@Data
@RequiredArgsConstructor
public class ClaimVoucherDetail implements Serializable {
    private static final long serialVersionUID = -7106911496423169210L;

    @Id
    @GeneratedValue
    @Column(name = "detail_id")
    Integer id;

    @OneToOne
    @JoinColumn(name = "detail_main_id")
    ClaimVoucher claimVoucher;

    @Column(name = "detail_item", length = 20)
    String item;

    @Column(name = "detail_account", precision = 20, scale = 2)
    BigDecimal account;

    @Column(name = "detail_des", length = 200)
    String des;
}
