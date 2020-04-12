package cn.kgc.controller;

import cn.kgc.service.AirqualityService;
import cn.kgc.service.AreaService;
import cn.kgc.vo.Airquality;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CenterController {
    @Autowired
    private AreaService areaService;
    @Autowired
    private AirqualityService airqualityService;

    @RequestMapping("/option.do")
    public List<Map<String, Object>> optionData() {
        return areaService.optionData();
    }

    @RequestMapping("/pageInfo.do")
    public PageInfo<Map<String, Object>> showData(Airquality airquality, Integer pageNo) {
        return airqualityService.showData(airquality, pageNo);
    }

    @RequestMapping("/info.do")
    public Map<String, Object> showInfo(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("arealist", areaService.optionData());
        map.put("airquality", airqualityService.showInfo(id));

        return map;
    }

    @RequestMapping("/add.do")
    public Integer add(Airquality airquality) {
        return airqualityService.add(airquality);
    }

    @RequestMapping("/edit.do")
    public Integer edit(Airquality airquality) {
        return airqualityService.edit(airquality);
    }

    @RequestMapping("/del.do")
    public Integer del(Integer id) {
        return airqualityService.del(id);
    }


}
