package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 员工账号禁用或启用
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    Employee getById(long id);
    /**
     * 编辑员工
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
