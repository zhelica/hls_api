package com.hls.api.service;

import java.util.List;
import java.util.Map;

/**
 * @author lizhe
 * @date 2021-08-12 13:59
 */
public interface IUserService {
    //1.同步科室
    List<Map<String,Object>> synDepartment();
    //4.同步出院病人
    Map<String,Object> af_zy_pat(Map<String,Object> map);
    //5.同步遗嘱信息
    Map<String,Object> af_zy_med(Map<String,Object> map);
    //2.同步职工信息
    List<Map<String,Object>> af_per_staff();
    //3.同步在院病人
    List<Map<String,Object>> af_per_pat();
}
