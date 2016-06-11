package br.com.javaparaweb.financeiroPessoal.util;

import br.com.javaparaweb.financeiroPessoal.usuario.UsuarioDAO;
import br.com.javaparaweb.financeiroPessoal.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionfactory().getCurrentSession());
		return usuarioDAO;
	}
}
