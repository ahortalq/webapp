package com.xebialabs.congruencias.webapp;

import com.xebialabs.congruencias.webservices.server.WebservicesStub;

public class ParidadWebService {
	
	public static boolean isPar(int numero_a) {
		try {
			// creamos el soporte y la petición
			WebservicesStub customer = new WebservicesStub();
			WebservicesStub.IsPar request = new WebservicesStub.IsPar();
			WebservicesStub.IsParResponse response = null;

			// establecemos el parametro de la invocacion
			request.setA(numero_a);

			// invocamos al web service
			response = customer.isPar(request);

			// mostramos la respuesta
			return response.get_return();

		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}

	}
}