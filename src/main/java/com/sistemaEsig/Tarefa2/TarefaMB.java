package com.sistemaEsig.Tarefa2;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Named(value = "tarefaMB")
@ViewScoped
public class TarefaMB {


    @Getter
    @Setter
    private List<Tarefa2> tarefas = new ArrayList<>();

    @Getter
    @Setter
    private Tarefa2 tarefa;

    @Autowired
    private TarefaRepository tarefaRepository;

    @PostConstruct
    public List<Tarefa2> listarTodas() {
        tarefas = tarefaRepository.findAll();
        return tarefas;
    }

    public Integer getTamanhoDaLista() {
        return tarefas.size();
    }

    @PutMapping
    public void concluir(@RequestBody Tarefa2 tarefa){
        tarefa.setSituacao("Concluida");
        tarefaRepository.save(tarefa);
    }

/*
    @DeleteMapping
    public void deletar(@PathVariable Long id){
        tarefaRepository.deleteById(id);
    }
*/

    @DeleteMapping
    public void deletar(@RequestBody Tarefa2 tarefa){
        tarefaRepository.delete(tarefa);
    }


    @PostMapping
    public void incluir(@RequestBody Tarefa2 tarefa){
        tarefa.setId(123);
        tarefaRepository.save(tarefa);
        tarefa = new Tarefa2();
        tarefas = tarefaRepository.findAll();
    }

    @PostMapping
    public void alterar(@RequestBody Tarefa2 tarefa){
            tarefaRepository.save(tarefa);
            tarefa = new Tarefa2();
    }

    public void novo() {
        tarefa = new Tarefa2();
    }


}
