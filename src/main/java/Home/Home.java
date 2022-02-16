package Home;

import java.util.Scanner;
import org.apache.ibatis.session.SqlSession;
import Customer.Customer;
import Employee.Employee;
import Insurance.Insurance;
import Login.Login;
import Mybatis.MyBatisConnectionFactory;

public class Home {
	
	private SqlSession sqlSession;
	private Scanner sc;

	private Login login;
	private Customer customer;
	private Employee employee;
	private Insurance insurance;

	public void service() {
		this.sc = new Scanner(System.in);
		while(true) {
			this.login();
			this.provideService();
		}
	}

	private void login() {
		boolean isSuccess = false;
		while(!isSuccess) {
			String id = this.getInputId();
			String password = this.getInputPassword();
			if(this.login.login(id, password)) {
				System.out.println( this.login.login(id, password));
				isSuccess = true;
			} else {
				System.out.println("잘못된 아이디 또는 비밀번호입니다");
			}
		}
	}

	private void provideService() {
		
	}
	
	public void instantiation() {
		this.login = new Login();
		this.customer = new Customer();
		this.employee = new Employee();
		this.insurance = new Insurance();
	}

	public void setSqlSession() {
		this.sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		this.login.setSqlSession(this.sqlSession);
	}

	public void associate() {
		this.employee.associate(this.customer, this.insurance);
		this.customer.associate(this.insurance);
	}
	
	private String getInputPassword() {
		System.out.print("비밀번호 : ");
		return sc.next();
	}

	private String getInputId() {
		System.out.print("아이디 : ");
		return sc.next();
	}
}
