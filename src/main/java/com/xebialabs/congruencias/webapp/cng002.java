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
		out.println("<html>");
		out.println("<head><title>Sistema para el calculo de Congruencias y Paridad de numeros</title></head>");
		out.println("<body><center><table><TR><td>");
		out.println("     <FORM NAME=\"form01\" METHOD=\"POST\" ACTION=\"calculaCongruencia\">");
		out.println("	       <TABLE BORDER>");
		out.println("	        <TR>");
		out.println("		     <TD><B>¿El número ...</TD>");
		out.println("		     <TD><INPUT TYPE=TEXT NAME=\"a\" SIZE=\"5\" VALUE=\"\"></TD>");
		out.println("		    </TR>");
		out.println("		    <TR>");
		out.println("		     <TD><B>es congruente con ... </TD>");
		out.println("		     <TD><INPUT TYPE=TEXT NAME=\"b\" SIZE=\"5\" VALUE=\"\"></TD>");
		out.println("		    </TR>");
		out.println("		    <TR>");
		out.println("		     <TD><B>módulo ... </TD>");
		out.println("		     <TD><INPUT TYPE=TEXT NAME=\"c\" SIZE=\"5\" VALUE=\"\"> <b>?</TD>");
		out.println("		    </TR>");
		out.println("	       </TABLE>");
		out.println("	   <P></P>");
		out.println("	   <center><INPUT TYPE=SUBMIT VALUE=\"Calcular\"></center>");
		out.println("    </FORM></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br></td><td>");
		out.println("     <FORM NAME=\"form02\" METHOD=\"POST\" ACTION=\"calculaParidad\">");
		out.println("	       <TABLE BORDER><Tr></Tr>");
		out.println("	        <TR>");
		out.println("		     <TD><B>¿El número </TD>");
		out.println("		     <TD><INPUT TYPE=TEXT NAME=\"a\" SIZE=\"5\" VALUE=\"\"></TD>");
		out.println("		     <TD><B> es par?</TD>");
		out.println("		    </TR>");
		out.println("		    <TR>");
		out.println("		    </TR>");
		out.println("	       </TABLE>");
		out.println("	   <P></P>");
		out.println("	   <center><INPUT TYPE=SUBMIT VALUE=\"Calcular\"></center>");
		out.println("    </FORM>");
		out.println("</td></tr></table></center></body></html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}