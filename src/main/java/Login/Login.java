package Login;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Customer.Customer;
import Employee.Employee;
import Global.Constants;

public class Login {
	
	private SqlSession sqlSession;
	private Customer customer;
	private Employee employee;
	private LoginDAO loginDAO;
	
	public Login() {
		this.loginDAO = new LoginDAO();
	}
	
	public boolean login(String id, String password) {
		List<LoginVO> loginList = this.loginDAO.selectAll();
		for(LoginVO login : loginList) {
			if(login.getId().matches(id) && login.getPassword().matches(password)) {
				return true;
			}
		}
		return false;
	}

	public int getRoll(String id) {
		return this.loginDAO.getRoll(id);
	}

	public void associate(Customer customer, Employee employee) {
		this.customer = customer;
		this.employee = employee;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		this.loginDAO.setSqlSession(sqlSession);
	}
}
