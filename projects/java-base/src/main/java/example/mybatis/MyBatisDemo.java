package example.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisDemo {

    public static void main(String[] args) throws IOException {
        String configFileName = "mybatis-config.xml";
        InputStream configInput = ClassLoader.getSystemResourceAsStream(configFileName);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configInput);

//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            BlogMapper mapper = session.getMapper(BlogMapper.class);
//            Blog blog = mapper.selectBlog(101);
//        }
    }
}
