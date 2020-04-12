package cn.kgc.service;

import cn.kgc.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AreaServiceImpl implements AreaService{
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public List<Map<String, Object>> optionData() {
        return areaMapper.optionData();

    }
}
