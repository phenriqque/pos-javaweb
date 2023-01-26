package dev.fujioka.pedrobarros.service;
import dev.fujioka.pedrobarros.model.Vendas;
import dev.fujioka.pedrobarros.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VendasService {

    @Autowired
    private VendasRepository vendasRepository;

    public Vendas salvar(Vendas vendas){
        return vendasRepository.save(vendas);
    }

    public List<Vendas> listarVendas(){
        return vendasRepository.findAll();
    }

    public Vendas consultarPorId(int id){
        return vendasRepository.findById(id).orElseThrow();
    }

    public void excluir(int id){
        vendasRepository.deleteById(id);
    }

    public Vendas alterar(Vendas vendas){
        if(Objects.isNull(vendas.getId())){
            throw new RuntimeException("ID não preenchido");
        }
        return vendasRepository.save(vendas);
    }

    public List<Vendas> buscarPorIdCliente(String idcliente){
        return vendasRepository.buscarVendasPorIDCliente(idcliente);
    }
    public List<Vendas> buscarPorIdProduto(String idproduto){
        return vendasRepository.buscarVendaPorIdProduto(idproduto);
    }

}