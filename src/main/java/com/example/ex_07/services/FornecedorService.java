package com.example.ex_07.services;

import com.example.ex_07.models.FornecedorModel;
import com.example.ex_07.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public FornecedorModel criarFornecedor(FornecedorModel fornecedorModel) {
        return fornecedorRepository.save(fornecedorModel);
    }

    public List<FornecedorModel> findAll() {
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> buscarIdFornecedor(Long id) {
        return fornecedorRepository.findById(id);
    }

    public void deletarFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}