package com.test.mapper;

import com.test.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpExprMapper {
    /**
     * 批量保存员工数据
     * @param exprList
     */
    void insertBatch(List<EmpExpr> exprList);
}
