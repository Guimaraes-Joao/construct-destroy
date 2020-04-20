package Joao.Guimaraes.constructpredestroy.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cliente {

    private String name;

    public Cliente(){
        System.out.println("Classe cliente!");
    }
}
