package com.hls.api.domain;
import java.util.HashMap;
import java.util.Map;
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
        Map<String, Object> params = new HashMap<String, Object>();
        HttpResult json = new HttpResult();
        params.put("respDesc", msg);
        params.put("respCode", "-9999");
        json.put("params", params);
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
        Map<String, Object> params = new HashMap<String, Object>();
        HttpResult json = new HttpResult();
        params.put("respDesc", msg);
        params.put("result", result);
        params.put("respCode", "0");
        json.put("params", params);
        return json;
    }
}
