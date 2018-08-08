package com.xebialabs.congruencias.webapp;

import java.util.Vector;

import com.xebialabs.congruencias.bdd.dao.DAOGeneral;
import com.xebialabs.congruencias.bdd.dao.accesoDatos.FactoriaDAO;
import com.xebialabs.congruencias.bdd.dao.accesoDatos.InterfaceDAO;
import com.xebialabs.congruencias.bdd.domain.cng.Usuarios;

public class CongruenciasBDD {
	
	public static boolean isUsuarioRegistrado(String login, String password) {
		boolean valid_user = false;
		try {
			InterfaceDAO dao_users = FactoriaDAO.getDAO("tabla_usuario");
			dao_users.setConnection(DAOGeneral.getConexion_bdd());
			Vector<Usuarios> listUsers = dao_users.select("login = '" + login
							+ "' and password = '" + password + "'");
			if (listUsers.iterator().hasNext()) valid_user = true;
			DAOGeneral.closeConnection_bdd();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return valid_user;
	}
}