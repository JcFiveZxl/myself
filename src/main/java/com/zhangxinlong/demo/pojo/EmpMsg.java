package com.zhangxinlong.demo.pojo;

import lombok.Data;

@Data
public class EmpMsg {
    private int id;
    private int empNo;
    private String phone;
    private String address;
    private int age;
    private String description;

    public EmpMsg(int id, int empNo, String phone, String address, int age, String description) {
        this.id = id;
        this.empNo = empNo;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.description = description;
    }
}
