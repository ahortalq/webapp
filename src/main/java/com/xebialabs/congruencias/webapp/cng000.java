package com.xebialabs.congruencias.webapp;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cng000 extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {

	public cng000() {
		super();
	}

/**
 * @brief Presentamos el formulario de bienvenida en el que el usuario introduce el usuario y la password
 * @param login Login del usuario
 * @param password Password del usuario
 * @return Se reenviaran los datos al servlet es.mtp.congruencias.webapp.cng001
 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out;
		out = response.getWriter();

		
		response.setContentType("text/html; charset=utf-8");
		out.println("<html>");
		out.println("<head><title>Sistema para el calculo de Congruencias y Paridad de numeros</title></head>");
		out.println("<body><center>");
		out.println("     <FORM NAME=\"form01\" METHOD=\"POST\" ACTION=\"validaUsuario\">");
		out.println("	       <TABLE BORDER>");
		out.println("	        <TR>");
		out.println("		  <TD><B>Login:</TD>");
		out.println("		  <TD><INPUT TYPE=TEXT NAME=\"login\" SIZE=\"25\" VALUE=\"\"></TD>");
		out.println("		</TR>");
		out.println("		<TR>");
		out.println("		  <TD><B>Password:</TD>");
		out.println("		  <TD><INPUT TYPE=PASSWORD NAME=\"password\" SIZE=\"25\" VALUE=\"\"></TD>");
		out.println("		</TR>");
		out.println("	       </TABLE>");
		out.println("	   <P></P>");	
		out.println("	   <INPUT TYPE=SUBMIT VALUE=\"Enviar\">");
		out.println("    </FORM>");
		out.println("    <font color=\"green\">Bienvenidos a la calculadora matematica!!!</font>");
		out.println("</center></body></html>");
	}
	//Resuelto el problema con el formulario de alta del clientes

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	// New comment
	}
}
