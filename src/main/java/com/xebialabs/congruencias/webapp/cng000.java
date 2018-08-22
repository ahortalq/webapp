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
 * @return Se reenviaran los datos al servlet com.xebialabs.congruencias.webapp.cng001
 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out;
		out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.println(Utils.getCng000());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
