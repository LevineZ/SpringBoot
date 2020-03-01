package com.mybatisDemo.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.mybatisDemo.entity.Info;
import com.mybatisDemo.mapper.InfoMapper;
import org.apache.http.protocol.HttpService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


@RestController
public class InfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoController.class);

    @Autowired
    InfoMapper infoMapper;

    /**
     * 单条数据
     * @param request
     * @param info
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String save(HttpServletRequest request,@RequestBody Info info) {
        JSONObject jsonObject = new JSONObject();

        info.setParam("周欢你好");
        info.setPhone("13502057672");
        info.setSmsActionType("UserVertify");
        info.setSmsType("Ali");
        try {
            //for (int i = 0; i < 10; i++) {
                infoMapper.insertInfo(info);
                jsonObject.put("data" , info);
                LOGGER.info("数据:"  + info.getParam());
           // }
        } catch (Exception e) {
            jsonObject.put("message", e.getMessage());
            e.printStackTrace();
        }
        String json = JSON.toJSONString(info);
        jsonObject.put("code", 200);
        jsonObject.put("data", json);
        LOGGER.info("回调数据：" + json);
        return jsonObject.toString();
    }


    @GetMapping(value = "/saves", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String insert(HttpServletRequest request,  Info info) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        info.setParam("周欢你好");
        info.setPhone("13502057672");
        info.setSmsActionType("UserVertify");
        info.setSmsType("Ali");

        try {
            for (int i = 0; i < 10; i++) {
                infoMapper.insertInfo(info);
                String json = JSON.toJSONString(info);
                jsonObject.put("data"+i, json.replace("\"",""));
                LOGGER.info("数据" + i, json);
            }
        } catch (Exception e) {
            jsonObject.put("message", e.getMessage());
            e.printStackTrace();

        }
        return jsonObject.toString();
    }

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getInfo(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        ArrayList infos = new ArrayList(infoMapper.getInfo());
        String info = JSON.toJSONString(infos);
        jsonObject.put("data", infos);
        return jsonObject.toString();
    }

}
