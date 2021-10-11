package com.cy.mybatis.io;

import java.io.InputStream;

/**
 * @author cy
 * @create 2021-10-10-4:43 下午
 * @Description 使用类加载器读取配置文件的类
 */
public class Resources {
    /**
     * 根据传入参数，获取一个字节数入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
