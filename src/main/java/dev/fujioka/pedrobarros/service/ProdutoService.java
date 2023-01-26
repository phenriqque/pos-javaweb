package dev.fujioka.pedrobarros.service;
import dev.fujioka.pedrobarros.model.Produto;
import dev.fujioka.pedrobarros.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto consultarPorId(int id){
        return produtoRepository.findById(id).orElseThrow();
    }

    public void excluir(int id){
        produtoRepository.deleteById(id);
    }

    public Produto alterar(Produto produto){
        if(Objects.isNull(produto.getId())){
            throw new RuntimeException("ID não preenchido");
        }
        return produtoRepository.save(produto);
    }

    public List<Produto> buscarPorDescLike(String descricao){
        return produtoRepository.buscarProdutoPorDescLike(descricao);
    }
    public List<Produto> buscarPorCor(String cpf){
        return produtoRepository.buscarProdutoPorCor(cpf);
    }

}