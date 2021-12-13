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
    @JoinColumn(name="id_Cliente")
    private Cliente cliente;

    // inicio
    @ManyToOne
    @JoinColumn(name="id_Cidade")
    private Cidade cidade;
    //fim

    private char    tipoEndereco ; // E= Entrega , C=Cobranca
    private String  logradouro ;
    private String  bairro ;
    private String  cep ;
    private String  pessoacontato;

}
