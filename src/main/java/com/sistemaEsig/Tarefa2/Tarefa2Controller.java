package com.sistemaEsig.Tarefa2;

import java.util.List;
import java.util.Optional;

import com.sistemaEsig.Tarefa2.Tarefa2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("unused")
@RestController 
@RequestMapping("/tarefas") 
public class Tarefa2Controller {
	
	
	@Autowired
    private TarefaRepository tarefaRepository;
	/*public Tarefa2 getInfor(){
		Tarefa2 tarefa = new Tarefa2(1L, "Programacao", "programacao java", "Thaise", "media", "15/12", "Andamento");
         return tarefa;
     }*/
	
	@GetMapping  
	public List<Tarefa2> listar(){
        return tarefaRepository.findAll();
    }
	@PostMapping
    public void incluir(@RequestBody Tarefa2 tarefa){
        tarefaRepository.save(tarefa);
    }

    @PutMapping
    public void alterar(@RequestBody Tarefa2 tarefa){
        tarefaRepository.save(tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        tarefaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Tarefa2> ler(@PathVariable Long id){
        return tarefaRepository.findById(id);
    }
}
