package br.com.faculdade.web2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank(message = "A descrição é obrigatória")
    @Column(length = 500)
    private String descricao;

    @Positive(message = "O preço deve ser maior que zero")
    @Column(nullable = false)
    private BigDecimal preco;

    @Positive(message = "A quantidade em estoque deve ser maior que zero")
    @Column(nullable = false)
    private Integer quantidadeEstoque;

    @NotBlank(message = "A categoria é obrigatória")
    @Column(length = 100)
    private String categoria;

    @Column(nullable = false)
    private Boolean ativo = true;
}
