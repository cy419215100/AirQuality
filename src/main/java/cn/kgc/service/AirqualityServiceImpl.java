package cn.kgc.service;

import cn.kgc.mapper.AirqualityMapper;
import cn.kgc.vo.Airquality;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AirqualityServiceImpl implements AirqualityService{
    @Autowired
    private AirqualityMapper airqualityMapper;
    @Override
    public PageInfo<Map<String, Object>> showData(Airquality airquality, Integer pageNo) {
        PageHelper.startPage(pageNo,3);
        List<Map<String,Object>> list=airqualityMapper.showData(airquality);
        PageInfo<Map<String,Object>> pageInfo=new PageInfo<Map<String,Object>>(list);
        return pageInfo;
    }

    @Override
    public Map<String, Object> showInfo(Integer id) {
        return airqualityMapper.showInfo(id);
    }

    @Override
    public Integer add(Airquality airquality) {
        return airqualityMapper.add(airquality);
    }

    @Override
    public Integer edit(Airquality airquality) {
        return airqualityMapper.edit(airquality);
    }

    @Override
    public Integer del(Integer id) {
        return airqualityMapper.del(id);
    }
}
