package com.xebialabs.congruencias.webapp;

import com.xebialabs.congruencias.webservices.server.CongruenciasWebservicesStub;

public class CongruenciasWebService {
	
	public static boolean isCongruencia(int numero_a, int numero_b, int numero_c) {
		try {
			// creamos el soporte y la petición
			CongruenciasWebservicesStub customer = new CongruenciasWebservicesStub();
			CongruenciasWebservicesStub.IsCongruente request = new CongruenciasWebservicesStub.IsCongruente();
			CongruenciasWebservicesStub.IsCongruenteResponse response = null;

			// establecemos el parametro de la invocacion
			request.setA(numero_a);
			request.setB(numero_b);
			request.setC(numero_c);

			// invocamos al web service
			response = customer.isCongruente(request);

			// mostramos la respuesta
			return response.get_return();

		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}

	}
}