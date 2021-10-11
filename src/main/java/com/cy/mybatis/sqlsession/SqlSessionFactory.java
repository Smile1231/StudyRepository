package com.cy.mybatis.sqlsession;

/**
 * @author cy
 * @create 2021-10-10-4:48 下午
 * @Description
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
