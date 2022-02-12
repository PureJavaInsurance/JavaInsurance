package Login;

import org.apache.ibatis.session.SqlSession;

import Customer.Customer;
import Employee.Employee;

public class Login {
	
	private SqlSession sqlSession;
	private Customer customer;
	private Employee employee;
	
	public Login() {
		
	}
	
	public void login() {
		
	}

	public void associate(Customer customer, Employee employee) {
		this.customer = customer;
		this.employee = employee;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
}
