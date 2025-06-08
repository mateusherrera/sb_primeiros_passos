package io.github.mateusherrera.sb_primeiros_passos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.mateusherrera.sb_primeiros_passos.model.Produto;

/**
 * Repositório para a entidade Produto.
 * Este repositório é responsável por realizar operações de persistência
 * e consulta na base de dados para a entidade Produto.
 *
 * @author Mateus Herrera
 * @since 2025-06-08
 */
public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
