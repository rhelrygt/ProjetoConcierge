package com.example.concierge.service;

import com.example.concierge.model.Aluno;
import com.example.concierge.model.Usuario;
import com.example.concierge.repository.AlunoRepository;
import com.example.concierge.view.AlunoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    UsuarioService userService;


    @Autowired
    AlunoRepository repository;

    public AlunoView save(AlunoView aluno){
        Usuario user = new Usuario();
        if(aluno.getId_usuario() != null){
            user.setid(aluno.getId_usuario());
        }
        user.setNome(aluno.getNome());
        user.setSenha(aluno.getSenha());
        user.setCpf(aluno.getCpf());
        aluno.setId_usuario(userService.save(user).getid());

        Aluno aluno1 = new Aluno();
        if(aluno.getId() != null){
            aluno1.setId(aluno.getId());
        }
        aluno1.setTelefone(aluno.getTelefone());
        aluno1.setData_nascimento(aluno.getData_nascimento());
        aluno1.setSexo(aluno.getSexo());
        aluno1.setNum_rg(aluno.getNum_rg());
        aluno1.setOrgao_expedidor(aluno.getOrgao_expedidor());
        aluno1.setNaturalidade(aluno.getNaturalidade());
        aluno1.setNome_mae(aluno.getNome_mae());
        aluno1.setNome_pai(aluno.getNome_pai());
        aluno1.setEstado_civil(aluno.getEstado_civil());
        aluno1.setRua(aluno.getRua());
        aluno1.setBairro(aluno.getBairro());
        aluno1.setComplemento(aluno.getComplemento());
        aluno1.setCidade(aluno.getCidade());
        aluno1.setOcupacao(aluno.getOcupacao());
        aluno1.setRenda(aluno.getRenda());
        aluno1.setEscolaridade(aluno.getEscolaridade());
        aluno1.setTipo_residencia(aluno.getTipo_residencia());
        aluno1.setPcdef(aluno.getPcdef());
        aluno1.setDisp_horario(aluno.getDisp_horario());
        aluno1.setId_usuario(aluno.getId_usuario());

        repository.save(aluno1);
        return aluno;
    }

    public Optional<Aluno> findById(Long id) {
        return repository.findById(id);
    }

    public ArrayList<Aluno> findAll(){
        return (ArrayList<Aluno>) repository.findAll();
    }
}
