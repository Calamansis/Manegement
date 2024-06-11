package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.pojo.Department;
import com.example.demo.service.DepartmentService;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author Calamansi
* @description 针对表【department】的数据库操作Service实现
* @createDate 2024-06-11 10:18:15
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




