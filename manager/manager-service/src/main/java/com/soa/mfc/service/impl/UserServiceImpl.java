package com.soa.mfc.service.impl;

import com.soa.mfc.pojo.User;
import com.soa.mfc.service.UserService;
import com.soa.mfc.common.pojo.MfcResult;
import org.springframework.stereotype.Service;

/**
 * Created by yunxin on 2018/5/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public MfcResult addUser(User user) {
       System.out.println(user.getNickname());
        return new MfcResult("测试通过");
    }
}
