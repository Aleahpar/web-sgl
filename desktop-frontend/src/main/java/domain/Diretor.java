package domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Diretor implements Serializable {

    private Long id;
    private String nome;

}
