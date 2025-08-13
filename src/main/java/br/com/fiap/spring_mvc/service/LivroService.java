package br.com.fiap.spring_mvc.service;


import br.com.fiap.spring_mvc.entity.Livro;
import br.com.fiap.spring_mvc.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    @Autowired
    public LivroService(LivroRepository livroRepository){

    }

    //CRUD
    public Livro createLivro(Livro livro){
        return livroRepository.save(livro);
    }


    public Livro readLivros(Long livro){
        return livroRepository.findById(id).orElse(null);
    }

    public List<Livro> readLivro(Long id){
        return livroRepository.findById(id).orElse(null);
    }

    public Livro updateLivro (Livro livro){
        return livroRepository.save(livro);

    }

    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
