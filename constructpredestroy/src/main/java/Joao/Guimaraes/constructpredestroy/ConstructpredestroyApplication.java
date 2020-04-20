package Joao.Guimaraes.constructpredestroy;

import Joao.Guimaraes.constructpredestroy.Model.Cliente;
import Joao.Guimaraes.constructpredestroy.dao.ClienteDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ConstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ConstructpredestroyApplication.class, args);

		ClienteDAO clienteDAO = applicationContext.getBean(ClienteDAO.class);

		clienteDAO.setCliente(new Cliente( "João Pedro"));

		System.out.println("Objeto CLiente DAO: " + clienteDAO);
		System.out.println("Objeto cliente: " + clienteDAO.getCliente());
	}

}
