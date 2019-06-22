//package cn.wsxiot;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Random;
//import java.util.UUID;
//
//import cn.wsxiot.bean.MonitorSteadyAlarmDay;
//import cn.wsxiot.dao.MonitorSteadyAlarmDayMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {"classpath:/applicationContext.xml", "classpath:/dispatcher-servlet.xml"})
//public class MapperTest {
//    @Autowired
//    MonitorSteadyAlarmDayMapper monitorSteadyAlarmDayMapper;
//
//    @Autowired
//    SqlSession sqlSession;
//
//    private static Date randomDate(String beginDate, String endDate) {
//        try {
//            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//            Date start = format.parse(beginDate);// 构造开始日期
//            Date end = format.parse(endDate);// 构造结束日期
//// getTime()表示返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
//            if (start.getTime() >= end.getTime()) {
//                return null;
//            }
//            long date = random(start.getTime(), end.getTime());
//
//            return new Date(date);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private static long random(long begin, long end) {
//        long rtn = begin + (long) (Math.random() * (end - begin));
//// 如果返回的是开始时间和结束时间，则递归调用本函数查找随机值
//        if (rtn == begin || rtn == end) {
//            return random(begin, end);
//        }
//        return rtn;
//    }
//
//    @Test
//    public void testCRUD() {
//        Random ram = new Random();
//        MonitorSteadyAlarmDayMapper mapper= sqlSession.getMapper(MonitorSteadyAlarmDayMapper.class);
//
//        for(int i=0;i<6000;i++) {
//            mapper.insert(new MonitorSteadyAlarmDay(null, String.valueOf(ram.nextInt(80)), new SimpleDateFormat("yyyy-MM-dd").format(MapperTest.randomDate("2017-01-01", "2019-05-15")),ram.nextInt(300),ram.nextInt(300),ram.nextInt(300),ram.nextInt(300),ram.nextInt(300),ram.nextInt(300),ram.nextInt(300),ram.nextInt(300),ram.nextInt(300)));
//        }
//        System.out.println("批量完成");
//    }
//}
