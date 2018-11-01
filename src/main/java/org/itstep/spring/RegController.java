package org.itstep.spring;

import java.sql.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegController {
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	  public ModelAndView index() {
	      return new ModelAndView("reg", "user", new User());
	  }  
	
	  @RequestMapping(value = "/regrap", method = RequestMethod.POST)
	  public ModelAndView addUser(@ModelAttribute User user1) throws ClassNotFoundException, SQLException {

		  Class.forName("com.mysql.jdbc.Driver");
		  
	//	  String login  = user1.getLogin();
	//	  String pass1 = user1.getPass1();
	//	  String pass2 = user1.getPass2();
	//	  String email = user1.getEmail();
		  String login  = "login";
     	  String pass1 = "pass";
		  String status = "status";
		  String email = "email";

		  String host = "jdbc:mysql://localhost:3306/spring_mvc_db?serverTimezone=UTC";
		  String user = "root";
		  String pass = "root";
	  
		  Connection conn = DriverManager.getConnection(host, user, pass);
		  
		  PreparedStatement pstmt = conn.prepareStatement("insert into user (login, pass, email, status) values(?,?,?,?)");
	      pstmt.setString(1, login);
	      pstmt.setString(2, pass1);
	      pstmt.setString(3, email);
	      pstmt.setString(4, status);
	      pstmt.execute();
	      pstmt.close();
	      conn.close();		  
		  
		  System.out.println(login+pass1+status+email);
	      return new ModelAndView("regraport", "user", user1);
	  } 
}
