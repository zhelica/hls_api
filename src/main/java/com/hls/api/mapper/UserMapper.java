package com.hls.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author lizhe
 * @date 2021-08-12 14:00
 */
@Mapper
public interface UserMapper {
    List<Map<String,Object>> synDepartment();
}
