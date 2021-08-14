package com.hls.api.controller;

import com.hls.api.domain.HttpResult;
import com.hls.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author lizhe
 * @date 2021-05-07 20:40
 */
@RestController
@RequestMapping("/api/system")
public class UserController {

    @Autowired
    private IUserService userService;
    //1.同步科室
    @PostMapping(value = "/synDepartment")
    public Map<String, Object> synDepartment(@RequestBody(required = false) Map<String,Object> reqMap) {
//        Map<String, Object> params = (Map<String, Object>) map.get("params");
//        String userName = params.get("userName") == null ? "" : String.valueOf(params.get("userName"));
        try {
            List<Map<String,Object>> rpsMap = userService.synDepartment();
            return HttpResult.success("请求成功",rpsMap);
        }catch (Exception exception){
            return HttpResult.error(exception.getMessage());
        }
    }
    //4.同步出院病人
    @PostMapping(value = "/af_zy_pat")
    public Map<String, Object> af_zy_pat(@RequestBody(required = false) Map<String,Object> reqMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            String result = userService.af_zy_pat(map);
            return HttpResult.success("请求成功",result);
        }catch (Exception exception){
            return HttpResult.error(exception.getMessage());
        }
    }
    //5.同步遗嘱信息
    @PostMapping(value = "/af_zy_med")
    public Map<String, Object> af_zy_med(@RequestBody(required = false) Map<String,Object> reqMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            String result = userService.af_zy_med(map);
            return HttpResult.success("请求成功",result);
        }catch (Exception exception){
            return HttpResult.error(exception.getMessage());
        }
    }
    //2.同步职工信息
    @PostMapping(value = "/af_per_staff")
    public Map<String, Object> af_per_staff(@RequestBody(required = false) Map<String,Object> reqMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<Map<String,Object>> resultMap = userService.af_per_staff(map);
            return HttpResult.success("请求成功",resultMap);
        }catch (Exception exception){
            return HttpResult.error(exception.getMessage());
        }
    }
    //3.同步在院病人
    @GetMapping(value = "/af_per_pat")
    public Map<String, Object> af_per_pat() {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<Map<String,Object>> resultMap = userService.af_per_pat();
            return HttpResult.success("请求成功",resultMap);
        }catch (Exception exception){
            return HttpResult.error(exception.getMessage());
        }
    }
}
