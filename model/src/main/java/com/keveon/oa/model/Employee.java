package com.keveon.oa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Keveon on 2017/3/5.
 * 员工信息
 */
@Entity
@Table(name = "sys_employee")
@Data
@RequiredArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 2745264684758426242L;

    /**
     * 工号
     */
    @Id
//    @GeneratedValue
    @Column(name = "employee_sn", length = 50)
    String sn;

    /**
     * 职位信息
     */
    @OneToOne
    @JoinColumn(name = "position_id")
    Position position;

    /**
     * 部门信息
     */
    @OneToOne
    @JoinColumn(name = "department_id")
    Department department;

    /**
     * 姓名
     */
    @Column(name = "employee_name", length = 50)
    String name;

    /**
     * 密码
     */
    @Column(name = "employee_password", length = 50)
    String password;

    /**
     * 状态
     */
    @Column(name = "employee_status", length = 20)
    String status;
}
