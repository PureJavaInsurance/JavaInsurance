package Main;

import org.apache.ibatis.session.SqlSession;
import Customer.Customer;
import Employee.Employee;
import Factory.Factory;
import Login.Login;
import Mybatis.MyBatisConnectionFactory;

public class Main {
	
	private Login login;
	private Customer customer;
	private Employee employee;
	private SqlSession sqlSession;

	public static void main(String[] args) {
		Main main = new Main();
		main.initalize();
		main.service();
	}

	private void initalize() {
		this.sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		this.instantiation();
		this.setSqlSession();
		this.associate();
	}

	private void instantiation() {
		this.login = new Login();
		this.customer = new Customer();
		this.employee = new Employee();
	}
	
	private void setSqlSession() {
		this.login.setSqlSession(this.sqlSession);
	}

	private void associate() {
		this.login.associate(this.customer, this.employee);
	}
	
	private void service() {
		this.login.login();
	}
}
