package com.anxian.mapper;

import com.anxian.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * 查询所有的注解信息
     * @return
     */
    @Select("select * from dept")
    List<Dept> findAll();
}
