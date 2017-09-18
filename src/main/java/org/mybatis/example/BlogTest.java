package org.mybatis.example;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BlogTest {

    public static void main(String[] args) throws Exception {
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
            System.out.println(blog);
        } finally {
            session.close();
        }
    }

}
