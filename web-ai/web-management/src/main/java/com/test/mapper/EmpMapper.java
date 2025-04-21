package com.test.mapper;

import com.test.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    /*原始分页查询
    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id where e.name like concat('%',#{name},'%') and e.gender = #{gender} and e.entry_date between #{begin} and #{end} order by e.update_time desc")
    public Long count(String name, Integer gender, LocalDate begin, LocalDate end);


    public List<Emp> list(Integer start, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);

     */
    //pagehelper分页查询方法
    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc")
    List<Emp> list();
    @Options(useGeneratedKeys = true,keyProperty = "id") //获得生成主键 -- 主键返回
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time)"+
    "values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);
}
