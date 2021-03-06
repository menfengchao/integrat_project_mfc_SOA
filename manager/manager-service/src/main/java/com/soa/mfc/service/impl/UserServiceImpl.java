package com.soa.mfc.service.impl;

import com.soa.mfc.jedis.JedisClientPool;
import com.soa.mfc.mapper.UserMapper;
import com.soa.mfc.pojo.User;
import com.soa.mfc.service.UserService;
import com.soa.mfc.common.pojo.MfcResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by MFC on 2018/5/3.
 * 用户相关服务
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JedisClientPool jedisClientPool;

    @Override
    public MfcResult index(User user) {
        if("SUCCESS".equals( jedisClientPool.hget("managerService","manage"))){
            jedisClientPool.expire("managerService",100);
            return new MfcResult(200,"SUCCESS","已登录");
        }
        return new MfcResult(200,"FAIL","登录失效");
    }

    @Override
    public MfcResult loginUser(User user) {
        User use = userMapper.nameSelectPsaa(user);
        if(!StringUtils.isEmpty(use) && use.getPswd().equals(user.getPswd())){
            jedisClientPool.hset("managerService","manage","SUCCESS");
            jedisClientPool.expire("managerService",100);
            return new MfcResult(200,"SUCCESS","测试通过");
        }else
        {
            return new MfcResult(200,"FAIL","测试通过登录失败");
        }
    }
}
