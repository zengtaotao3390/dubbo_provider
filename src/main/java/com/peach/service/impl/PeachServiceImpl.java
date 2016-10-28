package com.peach.service.impl;

import com.peach.service.PeachService;
import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * Created by zengtao on 2016/10/25.
 */
public class PeachServiceImpl implements PeachService {

    @Override
    public String hello(String id, String url) {
        System.out.println("taozi");
        Map<String, Object> map = new HashedMap();
        map.get("123").toString();
        return "75";
    }

    @Override
    public String hello1(String id, String url) {
        System.out.println("taozi");
        return "75";
    }
}
