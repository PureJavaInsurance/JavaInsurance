package Mybatis;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConnectionFactory {
	private static SqlSessionFactory sqlSessionFactory;

	public MyBatisConnectionFactory() {
        try {
        	this.initalize();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
	}
	
	private void initalize() throws IOException {
		String resource = "config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        if (sqlSessionFactory == null) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }
	}
	
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
