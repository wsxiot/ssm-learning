//package cn.wsxiot;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//
///**
// * 使用spring测试模块提供的测试请求功能
// * @author Echo
// *
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {"classpath:/applicationContext.xml", "classpath:/dispatcher-servlet.xml"})
//public class MvcTest {
//    @Autowired
//    WebApplicationContext context;
//    //虚拟Mvc请求，获取到处理结果
//    MockMvc mockMvc;
//    @Before
//    public void initMokcMvc() {
//        mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
//
//    }
//    @Test
//    public void testPage() throws Exception {
//
//        //模拟一个请求并且拿到返回值
//        mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "5")).andDo(print()).andReturn().getResponse().toString();
//
//    }
//
//}