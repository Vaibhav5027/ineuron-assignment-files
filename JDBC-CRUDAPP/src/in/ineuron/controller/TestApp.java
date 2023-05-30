package in.ineuron.controller;

import in.ineuron.service.UserServiceImpl;
import in.ineuron.service.UserServices;

public class TestApp {
	public static void main(String[] args) {
		UserServices service = new UserServiceImpl();
		service.select();
		service.insert();
		service.update(7);
		service.delete(7);
	}
}
