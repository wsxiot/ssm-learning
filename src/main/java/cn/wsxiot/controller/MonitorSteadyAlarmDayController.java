package cn.wsxiot.controller;

import cn.wsxiot.bean.MonitorSteadyAlarmDay;
import cn.wsxiot.bean.Msg;
import cn.wsxiot.service.MonitorSteadyAlarmDayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MonitorSteadyAlarmDayController {

    @Autowired
    private MonitorSteadyAlarmDayService monitorSteadyAlarmDayService;

    /**
     * 获取列表
     */
    @GetMapping("/AlarmDays")
    public Msg getAll(@RequestParam(value="pageNum",defaultValue="3")Integer pageNum, @RequestParam(value="pageSize",defaultValue="8")Integer pageSize){
        //一页显示几个
        PageHelper.startPage(pageNum, pageSize);
        List<MonitorSteadyAlarmDay> AlarmDays=monitorSteadyAlarmDayService.getAll();
        //连续显示的页数，可以取出来这几个页码
        PageInfo page=new PageInfo(AlarmDays);
        return Msg.success().add("pageInfo", page);
    }

    /**
     * 增
     */
    @PostMapping("/AlarmDay")
    public  Msg saveAlarmDay(@Valid MonitorSteadyAlarmDay monitorSteadyAlarmDay, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            Map<Object, Object> map=new HashMap<Object, Object>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println("错误字段："+fieldError.getField());
                System.out.println("错误信息："+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields", map);
        }else{
            monitorSteadyAlarmDayService.saveAlarmDay(monitorSteadyAlarmDay);
            return Msg.success();
        }
    }

    /**
     * 删
     */
    @DeleteMapping(value = "/AlarmDay/{id}")
    public Msg deleteAlarmDay(@PathVariable("id")Integer id){
        monitorSteadyAlarmDayService.deleteAlarmDay(id);
        return Msg.success();
    }

    /**
     * 改
     */
    @PutMapping(value = "/AlarmDay/{id}")
    public Msg updateAlarmDay(MonitorSteadyAlarmDay monitorSteadyAlarmDay){
        monitorSteadyAlarmDayService.updateAlarmDay(monitorSteadyAlarmDay);
        return Msg.success();
    }

    /**
     * 查
     */
    @GetMapping(value = "/AlarmDay/{id}")
    public Msg getAlarmDay(@PathVariable("id")Integer id){
        return Msg.success().add("data",monitorSteadyAlarmDayService.getAlarmDay(id));
    }
}
