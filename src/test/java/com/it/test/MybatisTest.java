package com.it.test;



import org.apache.ibatis.session.SqlSessionFactory;
import sun.security.util.Resources;

import java.io.InputStream;

/**
 *
 * mybatis 入门案例
 */
public class MybatisTest {
    /**
     * 入门案例
     * @param args
     */
    public static void main(String[] args) throws  Exception{
        //1、读取配置文件
        InputStream  in = Resources.class.getResourceAsStream("SqlMapConfig.xml");

        //2、创建SqlSessionFactory工厂
        SqlSessionFactory factory = null;
        //3、使用工厂生产SqlSession对象
        //4、使用SqlSession创建dao接口的代理对象
        //5、使用代理对象执行方法
        //6、释放资源
    }
}
