package com.renhe.java.com.renhe.java.impl;

import com.renhe.java.UserService;

import java.util.List;
import java.util.Map;

/**
 * 作者：QWZ
 * 会员业务实现层
 */
public class MemberServiceImpl implements UserService {

    @Override
    public List<Map<String, Object>> listUser() {
        System.out.println("-----------测试-------------");
        return null;
    }
}
