package financeiroPessoal;

import org.hibernate.Session;

import br.com.javaparaweb.financeiroPessoal.util.HibernateUtil;

public class ConectaHibernateMySQL {
	public static void main(String[] args) {
		Session sessao = null;
		sessao = HibernateUtil.getSessionfactory().openSession();
		System.out.println("Conectou!!");
		sessao.close();
	}
}
