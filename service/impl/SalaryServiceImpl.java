package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.pojo.Salary;
import com.example.demo.service.SalaryService;
import com.example.demo.mapper.SalaryMapper;
import org.springframework.stereotype.Service;

/**
* @author Calamansi
* @description 针对表【salary】的数据库操作Service实现
* @createDate 2024-06-11 10:18:29
*/
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary>
    implements SalaryService{

}




