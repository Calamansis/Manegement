package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author Calamansi
* @description 针对表【employee】的数据库操作Service实现
* @createDate 2024-06-11 10:18:23
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




