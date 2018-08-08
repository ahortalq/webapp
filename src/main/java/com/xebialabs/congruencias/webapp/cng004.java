package com.xebialabs.congruencias.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class cng004 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		pw.println("<HTML>");
		pw.println("<BODY><p align=\"right\">");
		Info inf = new Info();
		String job_name = inf.getJob_name();
		String build_number = inf.getBuild_number();
		String svn_revision = inf.getSvn_revision();
		String pom_version = inf.getPom_version();
		//pw.println("<b>Congruencias</b> " + pom_version + ", <b>Rev.</b> " + svn_revision + ", <b>Job name:</b> " + job_name + ", <b>Build:</b> " + build_number + "");
		pw.println("<b>Rev.</b> " + svn_revision + ", <b>Job name:</b> " + job_name + ", <b>Build:</b> " + build_number + "");
		pw.println("</BODY></HTML>");
		pw.close();
	}
}