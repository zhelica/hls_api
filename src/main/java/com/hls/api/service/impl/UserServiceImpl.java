package com.hls.api.service.impl;

import com.hls.api.mapper.UserMapper;
import com.hls.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author lizhe
 * @date 2021-08-12 13:59
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Map<String,Object>> synDepartment() {
        return userMapper.synDepartment();
    }
}
