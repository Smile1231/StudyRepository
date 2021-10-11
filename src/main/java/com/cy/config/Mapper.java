package com.cy.config;

import lombok.Data;

/**
 * @author cy
 * @create 2021-10-10-5:31 下午
 * @Description 用于封装执行的sql语句和结果类型的全限定类名
 */
@Data
public class Mapper {
    /**
     * sql语句
     */
    private String queryString;
    /**
     * 结果类型的全限定类名
     */
    private String resultType;
}
