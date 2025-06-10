package io.github.mateusherrera.sb_primeiros_passos.controller;

import io.github.mateusherrera.sb_primeiros_passos.model.Produto;
import io.github.mateusherrera.sb_primeiros_passos.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Controlador REST para classe Produto.
 *
 * @author Mateus Herrera
 * @since 2025-06-08
 */
@RestController
@RequestMapping("produtos")
public class ProdutoController {
    // ini: atributos
    private final ProdutoRepository produtoRepository;
    // fim: atributos

    /**
     * Construtor da classe ProdutoController.
     *
     * @param produtoRepository Repositório de produtos.
     */
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // ini: métodos
    /**
     * Método para salvar um objeto Produto.
     *
     * @param produto Objeto Produto a ser salvo.
     * @return Objeto Produto salvo.
     */
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        // Lógica para salvar o produto
        // System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        this.produtoRepository.save(produto);
        return produto;
    }

    /**
     * Método para buscar um produto por ID.
     *
     * @param id ID do produto a ser buscado.
     * @return Produto encontrado ou null se não existir.
     */
    @GetMapping("{id}")
    public Produto buscarPorId(@PathVariable("id") String id) {
        return this.produtoRepository.findById(id).orElse(null);
    }

    /**
     * Método para atualizar um produto por ID.
     *
     * @param id ID do produto a ser atualizado.
     * @param produto Objeto Produto com os dados atualizados.
     */
    @PutMapping("{id}")
    public void atualizar(@PathVariable String id, @RequestBody Produto produto) {
        produto.setId(id);
        this.produtoRepository.save(produto);
    }

    /**
     * Método para excluir um produto por ID.
     *
     * @param id ID do produto a ser excluído.
     */
    @DeleteMapping("{id}")
    public void deletar(@PathVariable String id) {
        this.produtoRepository.deleteById(id);
    }
    // fim: métodos
}
