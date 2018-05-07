package com.soa.mfc.service;

import com.soa.mfc.common.pojo.MfcResult;
import com.soa.mfc.pojo.User;

/**
 * Created by yunxin on 2018/5/3.
 */
public interface UserService {
    public MfcResult loginUser(User user);
}
