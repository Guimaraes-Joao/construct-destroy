package Joao.Guimaraes.constructpredestroy.dao;

import Joao.Guimaraes.constructpredestroy.Model.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Getter
@Setter
public class ClienteDAO {

    @Autowired
        private Cliente cliente;

    @PostConstruct
        public void postConstructor() {
            System.out.println("Objeto Criado com sucesso");
    }

    @PreDestroy
        public void preDestoy(){
             System.out.println("Objeto finalizado");
    }
}
