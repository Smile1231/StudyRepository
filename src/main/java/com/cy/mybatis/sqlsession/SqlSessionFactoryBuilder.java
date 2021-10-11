package com.cy.mybatis.sqlsession;

import com.cy.config.Configuration;
import com.cy.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.cy.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author cy
 * @create 2021-10-10-4:46 下午
 * @Description 用于创建sqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }

}
