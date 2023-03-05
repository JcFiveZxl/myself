package com.zhangxinlong.demo.mapper;

import com.zhangxinlong.demo.pojo.EmpMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/*加了这个注解 就表示了 这是一个Mybatis的mapper类
就相当于之前使用的spring整合mybatis接口 也可以使用@MapperScan("com.kuang.mapper")*/
@Mapper

/**@Component 也可以用这个 万能的*/
@Repository
public interface EmpMsgMapper {



    List<EmpMsg> queryUserList();

    EmpMsg queryUserById(int id);

    int addUser(EmpMsg user);

    int updateUser(EmpMsg user);

    int deleteUser(int id);


}
