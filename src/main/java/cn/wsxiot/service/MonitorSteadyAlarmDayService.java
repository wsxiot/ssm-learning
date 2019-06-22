package cn.wsxiot.service;

import cn.wsxiot.bean.MonitorSteadyAlarmDay;
import cn.wsxiot.dao.MonitorSteadyAlarmDayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorSteadyAlarmDayService {

    @Autowired
    private MonitorSteadyAlarmDayMapper monitorSteadyAlarmDayMapper;

    public List<MonitorSteadyAlarmDay> getAll() {
        return monitorSteadyAlarmDayMapper.selectAll();
    }

    public void saveAlarmDay(MonitorSteadyAlarmDay monitorSteadyAlarmDay){
        monitorSteadyAlarmDayMapper.insert(monitorSteadyAlarmDay);
    }

    public void deleteAlarmDay(Integer id){
        monitorSteadyAlarmDayMapper.deleteByPrimaryKey(id);
    }

    public void updateAlarmDay(MonitorSteadyAlarmDay monitorSteadyAlarmDay){
        monitorSteadyAlarmDayMapper.updateByPrimaryKey(monitorSteadyAlarmDay);
    }

    public MonitorSteadyAlarmDay getAlarmDay(Integer id){
        return monitorSteadyAlarmDayMapper.selectByPrimaryKey(id);
    }
}
