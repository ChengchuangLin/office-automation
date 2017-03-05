package com.keveon.oa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Keveon on 2017/3/5.
 * 职位
 */
@Entity
@Table(name = "sys_position")
@Data
@RequiredArgsConstructor
public class Position implements Serializable {
    private static final long serialVersionUID = -3501823739707374806L;

    @Id
    @GeneratedValue
    @Column(name = "position_id")
    Integer id;

    /**
     * 中文名
     */
    @Column(name = "position_name_cn", length = 50)
    String cnMane;

    /**
     * 英文名
     */
    @Column(name = "position_name_en", length = 50)
    String enName;
}
