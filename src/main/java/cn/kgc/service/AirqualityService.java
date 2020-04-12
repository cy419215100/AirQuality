package cn.kgc.service;

import cn.kgc.vo.Airquality;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface AirqualityService {
    public PageInfo<Map<String,Object>> showData(Airquality airquality,Integer pageNo);
    public Map<String,Object> showInfo(Integer id);
    public Integer add(Airquality airquality);
    public Integer edit(Airquality airquality);
    public Integer del(Integer id);
}
