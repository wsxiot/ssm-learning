package cn.wsxiot.controller;

import cn.wsxiot.bean.MonitorSteadyAlarmMonth;
import cn.wsxiot.bean.Msg;
import cn.wsxiot.service.MonitorSteadyAlarmMonthService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonitorSteadyAlarmMonthController {

    @Autowired
    private MonitorSteadyAlarmMonthService monitorSteadyAlarmMonthService;

    @RequestMapping("/AlarmMonths")
    public Msg getAll(@RequestParam(value="pn",defaultValue="1")Integer pn){
        PageHelper.startPage(pn, 5);
        List<MonitorSteadyAlarmMonth> AlarmMonths=monitorSteadyAlarmMonthService.getAll();
        PageInfo page=new PageInfo(AlarmMonths,5);
        return Msg.success().add("pageInfo", page);
    }
}
