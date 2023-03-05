package com.zhangxinlong.demo.Controller;

import com.zhangxinlong.demo.mapper.EmpMsgMapper;
import com.zhangxinlong.demo.pojo.EmpMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RequestMapping("/EmpMsg")
@RestController
public class EmpMsgController {

    @Autowired
    private EmpMsgMapper empMsgMapper;

    @GetMapping("/queryUserList")
    public List<EmpMsg> queryUserList(){
        List<EmpMsg> userList = empMsgMapper.queryUserList();

        for(EmpMsg user:userList){
            System.out.println(user);
        }

        return userList;
    }

    @GetMapping("/queryUserById")
    public EmpMsg queryUserById(){

        EmpMsg user = empMsgMapper.queryUserById(1);
        return user;
    }


    @GetMapping("/addUser")
    public String addUser(){
        empMsgMapper.addUser(new EmpMsg(1,1,"12345678901","地址",18,"18岁小年轻"));
        return "添加成功";

    }

    @GetMapping("/updateUser")
    public String updateUser(){
        empMsgMapper.updateUser(new EmpMsg(1,1,"12345678901","地址",30,"30岁大叔"));
        return "更改成功";
    }


    @GetMapping("/deleteUser")
    public String deleteUser(){
        empMsgMapper.deleteUser(1);
        return "删除成功";

    }


}
