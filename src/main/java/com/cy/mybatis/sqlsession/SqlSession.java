package com.cy.mybatis.sqlsession;

/**
 * @author cy
 * @create 2021-10-10-5:12 下午
 * @Description 自定义Mybatis中和数据库交互的核心类，可以创建dao接口的代理对象
 */
public interface SqlSession {

    <T> T getMapper(Class<T> daoInterfaceClass);

    void close();
}
