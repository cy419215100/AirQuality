package cn.kgc.mapper;

import cn.kgc.vo.Airquality;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.junit.Test;

import java.util.List;
import java.util.Map;
public interface AirqualityMapper {
    //对空气质量监测信息按区域检索，并添加分页效果
    @Test
    public List<Map<String,Object>> showData(Airquality airquality);
    //根据ID查找指定的记录
    public Map<String,Object> showInfo(Integer id);
    //添加新的空气质量记录
    @Insert("insert into airquality (area_id,monitor_time,pm10,pm25,monitoring_station,last_modify_time) values(#{area_id},#{monitor_time},#{pm10},#{pm25},#{monitoring_station},now())")
    public Integer add(Airquality airquality);
    //修改指定记录
    @Update("update airquality set area_id=#{area_id},monitor_time=#{monitor_time},pm10=#{pm10},pm25=#{pm25},monitoring_station=#{monitoring_station},now()")
    public Integer edit(Airquality airquality);
    //删除指定记录
    @Delete("delete from airquality where id=#{id}")
    public Integer del(Integer id);

}
