package br.com.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ClienteEndereco implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Cliente cliente;
   // private List<Cliente> cliente;

    private char    tipoEndereco ; // E= Entrega , C=Cobranca
    private String  logradouro ;
    private String  bairro ;
    private String  cep ;
    private Integer codcidade ;// indica o cod da cidade
    private String  pessoacontato;

}
