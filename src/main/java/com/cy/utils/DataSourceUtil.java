package com.cy.utils;

import com.cy.config.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author cy
 * @create 2021-10-10-9:09 下午
 * @Description
 */
public class DataSourceUtil {
    /**
     * 用于获取是数据库连接
     *
     * @param cfg
     * @return
     */
    public static Connection getConnection(Configuration cfg) {
        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
