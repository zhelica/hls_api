package com.his.api.domain;
import java.util.HashMap;

/**
 * @author lizhe
 * @date 2021-08-12 14:01
 */
public class HttpResult extends HashMap<String, Object>{
    private static final long serialVersionUID = 1L;
    /**
     * 返回错误消息
     *
     * @param msg 内容
     * @return 错误消息
     */
    public static HttpResult error(String msg)
    {
        HttpResult json = new HttpResult();
        json.put("respDesc", msg);
        json.put("respCode", "-9999");
        return json;
    }
    /**
     * 返回成功消息
     *
     * @param msg 内容
     * @param result 结果集
     * @return 成功消息
     */
    public static HttpResult success(String msg,Object result)
    {
        HttpResult json = new HttpResult();
        json.put("respDesc", msg);
        json.put("result", result);
        json.put("code", "0000");
        return json;
    }
}
