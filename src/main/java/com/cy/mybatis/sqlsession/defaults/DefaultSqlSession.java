package com.cy.mybatis.sqlsession.defaults;

import com.cy.config.Configuration;
import com.cy.mybatis.sqlsession.SqlSession;
import com.cy.mybatis.sqlsession.proxy.MapperProxy;
import com.cy.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author cy
 * @create 2021-10-10-7:02 下午
 * @Description
 */
public class DefaultSqlSession implements SqlSession {

    private Configuration cfg;

    private Connection conn;

    public DefaultSqlSession(Configuration cfg){
        this.cfg = cfg;
        conn = DataSourceUtil.getConnection(cfg);
    }

    /**
     * 用于创建代理对象
     * @param daoInterfaceClass
     * @param <T>
     * @return
     */
    @Override
    public <T> T getMapper(Class<T> daoInterfaceClass) {
       return (T) Proxy.newProxyInstance(
                daoInterfaceClass.getClassLoader()
                ,new Class[]{daoInterfaceClass}
                ,new MapperProxy(cfg.getMappers(),conn)
        );
    }

    /**
     * 用于释放资源
     */
    @Override
    public void close() {
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
