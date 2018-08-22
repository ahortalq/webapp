package com.xebialabs.congruencias.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class cng001 extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta.
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		if (CongruenciasBDD.isUsuarioRegistrado(req.getParameter("login"), req.getParameter("password"))) {
			pw.println(Utils.getCng0011(req.getParameter("login")));
		} else {
			pw.println(Utils.getCng0012(req.getParameter("login")));
		}
		pw.close();
	}

}