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

public class cng003 extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		pw.println("<HTML><HEAD><TITLE>Sistema para el calculo de Congruencias y Paridad de numeros</TITLE></HEAD>");
		pw.println("<BODY><center>");
		int a = new Integer(req.getParameter("a")).intValue();
		int b = new Integer(req.getParameter("b")).intValue();
		int c = new Integer(req.getParameter("c")).intValue();
		if (CongruenciasWebService.isCongruencia(a, b, c)) {
			pw.println("<H2>Efectivamente!<P>"
					+ a + " es congruente con " + b + " módulo " + c + "</H2><P>");
			pw.println("<img src=\"images/ok.jpg\"><P>");
		} else {
			pw.println("<H2>Error, " + a + " NO es congruente con " + b + " módulo " + c + "</H2><P>");
			pw.println("<img src=\"images/ko.png\"><P>");
		}
		pw.println("     <FORM NAME=\"form01\" METHOD=\"POST\" ACTION=\"paginaInicialCongruencias\">");
		pw.println("	   <INPUT TYPE=SUBMIT VALUE=\"Más cálculos\">");
		pw.println("    </FORM>");
		pw.println("</center></BODY></HTML>");
		pw.close();
	}
}