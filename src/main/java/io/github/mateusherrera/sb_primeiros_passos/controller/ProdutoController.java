package io.github.mateusherrera.sb_primeiros_passos.controller;

import io.github.mateusherrera.sb_primeiros_passos.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para classe Produto.
 *
 * @author Mateus Herrera
 * @since 2025-06-08
 */
@RestController
@RequestMapping("produtos")
public class ProdutoController {
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
        return produto;
    }
    // fim: métodos
}
