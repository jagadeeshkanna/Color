package com.example.projectDay1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Color {
	@RequestMapping("show")
	public String display(HttpServletRequest req)
	{
		String colour=req.getParameter("colour");
		HttpSession session=req.getSession();
		session.setAttribute("displayName", colour);
		return "NewFile2.jsp";
	}
}
