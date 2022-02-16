package Main;

import Home.Home;

public class Main {
	private Home home;
	

	public static void main(String[] args) {
		Main main = new Main();
		main.initalize();
		main.service();
	}

	private void initalize() {
		this.instantiation();
		this.setSqlSession();
		this.associate();
	}

	private void instantiation() {
		this.home = new Home();
		this.home.instantiation();
		
	}
	
	private void setSqlSession() {
		this.home.setSqlSession();
	}

	private void associate() {
		this.home.associate();
	}
	
	private void service() {
		this.home.service();
	}
}
