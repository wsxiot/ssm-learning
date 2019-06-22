package cn.wsxiot.service;

import cn.wsxiot.bean.MonitorSteadyAlarmMonth;
import cn.wsxiot.dao.MonitorSteadyAlarmMonthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorSteadyAlarmMonthService {

    @Autowired
    private MonitorSteadyAlarmMonthMapper monitorSteadyAlarmMonthMapper;

    public List<MonitorSteadyAlarmMonth> getAll(){
        return monitorSteadyAlarmMonthMapper.selectAll();
    }
}
