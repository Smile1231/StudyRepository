package com.cy.mybatis.sqlsession.defaults;

import com.cy.config.Configuration;
import com.cy.mybatis.sqlsession.SqlSession;
import com.cy.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author cy
 * @create 2021-10-10-6:59 下午
 * @Description
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }
    /**
     * 用于创建SqlSession对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
