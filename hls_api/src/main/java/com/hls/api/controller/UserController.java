package com.hls.api.controller;

import com.hls.api.domain.HttpResult;
import com.hls.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    //同步科室
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
}