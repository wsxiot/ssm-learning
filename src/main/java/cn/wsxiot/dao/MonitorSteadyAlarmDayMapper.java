package cn.wsxiot.dao;

import cn.wsxiot.bean.MonitorSteadyAlarmDay;
import java.util.List;

public interface MonitorSteadyAlarmDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MonitorSteadyAlarmDay record);

    MonitorSteadyAlarmDay selectByPrimaryKey(Integer id);

    List<MonitorSteadyAlarmDay> selectAll();

    int updateByPrimaryKey(MonitorSteadyAlarmDay record);
}