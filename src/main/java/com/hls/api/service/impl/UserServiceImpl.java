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

    /**
     * 同步科室
     * @return
     */
    @Override
    public List<Map<String,Object>> synDepartment() {
        return userMapper.synDepartment();
    }
    /**
     * 同步出院病人
     * @return
     */
    @Override
    public Map<String,Object> af_zy_pat(Map<String,Object> map){
        map.put("a","");
        map.put("b","2021.08.11");
        map.put("c","2021.08.11");
        map.put("d","1");
        userMapper.af_zy_pat(map);
        return map;
    }
    /**
     * 同步医嘱信息
     * @return
     */
    @Override
    public Map<String,Object> af_zy_med(Map<String, Object> map) {
        map.put("a","771713");
        userMapper.af_zy_med(map);
//        String result = map.get("result") == null ? "" : String.valueOf("result");
        return map;
    }
    /**
     * 同步职工信息
     * @return
     */
    @Override
    public List<Map<String,Object>> af_per_staff() {
        return userMapper.af_per_staff();
    }
    /**
     * 同步在院病人
     * @return
     */
    @Override
    public List<Map<String,Object>> af_per_pat() {
        return userMapper.af_per_pat();
    }
}
