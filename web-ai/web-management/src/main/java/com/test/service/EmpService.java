package com.test.service;

import com.test.pojo.Emp;
import com.test.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public interface EmpService {
    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageResult<Emp> page(Integer page, Integer pageSize);

    /**
     * 新增员工
     * @param emp
     */
    void save(Emp emp);
}
