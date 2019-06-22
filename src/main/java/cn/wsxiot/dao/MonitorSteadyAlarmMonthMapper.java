package cn.wsxiot.dao;

import cn.wsxiot.bean.MonitorSteadyAlarmMonth;
import java.util.List;

public interface MonitorSteadyAlarmMonthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MonitorSteadyAlarmMonth record);

    MonitorSteadyAlarmMonth selectByPrimaryKey(Integer id);

    List<MonitorSteadyAlarmMonth> selectAll();

    int updateByPrimaryKey(MonitorSteadyAlarmMonth record);
}