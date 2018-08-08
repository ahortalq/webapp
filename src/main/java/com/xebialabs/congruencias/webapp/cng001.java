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
		pw.println("<HTML><HEAD><TITLE>Sistema para el calculo de Congruencias y Paridad de numeros</TITLE></HEAD>");
		pw.println("<BODY><center>");
		if (CongruenciasBDD.isUsuarioRegistrado(req.getParameter("login"), req.getParameter("password"))) {
			pw.println("<H2>Hola "
					+ req.getParameter("login")
					+ "!, bienvenido al sistema integral de cálculo de congruencias</H2><P>");
			pw.println("<UL><P>");
			pw.println("<img src=\"images/mathematics.jpg\"><P>");
			pw.println("     <FORM NAME=\"form01\" METHOD=\"POST\" ACTION=\"paginaInicialCongruencias\">");
			pw.println("	   <INPUT TYPE=SUBMIT VALUE=\"Comenzar\">");
			pw.println("    </FORM>");
		} else {
			pw.println("<H2>Amigo "
					+ req.getParameter("login")
					+ ", lo sentimos pero no estás autorizado</H2><P>");
			pw.println("<UL><P>");
			pw.println("<img src=\"images/prohibido_paso.jpg\"><P>");
			pw.println("     <FORM NAME=\"form01\" METHOD=\"POST\" ACTION=\"index\">");
			pw.println("	   <INPUT TYPE=SUBMIT VALUE=\"Volver a la página principal\">");
			pw.println("    </FORM>");
		}
		pw.println("</center></BODY></HTML>");
		pw.close();
	}

}