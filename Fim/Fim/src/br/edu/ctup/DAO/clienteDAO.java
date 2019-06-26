package br.edu.ctup.DAO;

import java.util.List;

import br.edu.ctup.bean.Cliente;

public interface clienteDAO {

	void salvarCliente (Cliente cliente);
	void excluir(Integer codigo);
	List<Cliente> listarClientes();
	void editarCliente(Cliente cliente);
	void login(String login, String senha);
		
}
