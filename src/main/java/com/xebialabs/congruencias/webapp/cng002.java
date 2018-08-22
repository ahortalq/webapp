package com.xebialabs.congruencias.webapp;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cng002 extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {

	public cng002() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out;
		out = response.getWriter();

		response.setContentType("text/html; charset=utf-8");
		out.println(Utils.getCng002());
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}