package com.xebialabs.congruencias.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class cng005 extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		int a = new Integer(req.getParameter("a")).intValue();
		if (ParidadWebService.isPar(a)) {
			pw.println(Utils.getCng005("Efectivamente!, " + a + " es un número par", "images/ok.jpg"));
		} else {
			pw.println(Utils.getCng005("Error, " + a + " NO es un número par", "images/ko.png"));
		}
		pw.close();
	}
}