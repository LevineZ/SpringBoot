package com.mybatisDemo;

import com.alibaba.fastjson.JSON;
import com.mybatisDemo.entity.Info;
import com.mybatisDemo.mapper.InfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    private static Logger logger= LoggerFactory.getLogger(DemoApplicationTests.class);
    private SqlSession sqlSession = null;
    @Autowired
    private InfoMapper infoMapper ;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsert() {
        logger.info("新增信息");
        Info info = new Info( 1,"qcloud","UserLogin","17726055317", "111");
        infoMapper.insertInfo(info);
        String json = JSON.toJSONString(info);
        logger.info(json);
    }

    @Test
    public void test() {
        logger.info("新增多条信息");
        for (int i = 0; i < 10; i++) {
            Info info = new Info(null, "qcloud", "UserLogin", "17726055317", ""+i);
            infoMapper.insertInfo(info);

        }
    }

}
