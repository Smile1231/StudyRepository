package com.cy.config;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cy
 * @create 2021-10-10-5:30 下午
 * @Description
 */
@Data
public class Configuration {
    private String driver;
    private String url;
    private String username;
    private String password;

    private Map<String, Mapper> mappers = new HashMap<String, Mapper>();

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers.putAll(mappers);//此处需要使用追加
    }
}
