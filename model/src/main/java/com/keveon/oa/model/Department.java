package com.keveon.oa.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Keveon on 2017/3/5.
 * 部门
 */
@Entity
@Table(name = "sys_department")
@Data
@RequiredArgsConstructor
public class Department implements Serializable {
    private static final long serialVersionUID = 2867943417320122923L;

    /**
     * 部门编号
     */
    @Id
    @GeneratedValue
    @Column(name = "dept_id")
    Integer id;

    /**
     * 部门名称
     */
    @Column(name = "dept_name", length = 50)
    String name;
}
