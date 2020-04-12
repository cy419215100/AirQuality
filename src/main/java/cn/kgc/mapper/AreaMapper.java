package cn.kgc.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface AreaMapper {
    //一方下拉列表
    @Select("select * from area")
    public List<Map<String,Object>> optionData();
}
