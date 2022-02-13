package Login;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class LoginDAO {
	
	private SqlSession sqlSession;
	
	static final String selectAll = "loginMapper.selectAll";
	static final String getRoll = "loginMapper.getRoll";
	
	public List<LoginVO> selectAll() {
		List<LoginVO> loginList = this.sqlSession.selectList(selectAll);
		return loginList;
	}
	
	public int getRoll(String id) {
		return this.sqlSession.selectOne(getRoll, id);
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
}
