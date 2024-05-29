package br.com.gustavo.luan.domain;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter
    @Column(nullable = false, unique = true)
    private String usuaio;
    @Getter @Setter
    @Column(nullable = false)
    private String senha;
    
    
	
}
