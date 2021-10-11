package Com.cy.test;

import com.cy.mapper.StudentDao;
import com.cy.mybatis.io.Resources;
import com.cy.mybatis.sqlsession.SqlSession;
import com.cy.mybatis.sqlsession.SqlSessionFactory;
import com.cy.mybatis.sqlsession.SqlSessionFactoryBuilder;
import com.cy.pojo.Student;

import java.io.InputStream;
import java.util.List;

/**
 * @author cy
 * @create 2021-10-10-4:42 下午
 * @Description
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception{
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        StudentDao studentDao = session.getMapper(StudentDao.class);
        //5.使用代理对象执行方法
        List<Student> students = studentDao.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
