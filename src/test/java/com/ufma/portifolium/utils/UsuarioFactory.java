package com.ufma.portifolium.utils;

import java.time.LocalDate;

import com.ufma.portifolium.entities.Aluno;
import com.ufma.portifolium.entities.Professor;
import com.ufma.portifolium.entities.TipoUsuario;
import com.ufma.portifolium.entities.Usuario;

public class UsuarioFactory {
    public static Usuario buildUsuarioAluno() {
        LocalDate data = LocalDate.now();
        TipoUsuario tipoUsuario = TipoUsuario.builder()
                                            .descricao("Tipo usuario aluno teste")
                                            .build();

        Aluno aluno = AlunoFactory.buildALuno();
        Usuario usuario = Usuario.builder()
                                .codigoAcesso(aluno.getMatricula())
                                .criadoEm(data)
                                .descricao("Um usuario qualquer")
                                .senha("12345")
                                .tipoUsuario(tipoUsuario)
                                .build();

        return usuario;
    }    

    public static Usuario buildUsuarioProfessor() {
        LocalDate data = LocalDate.now();
        TipoUsuario tipoUsuario = TipoUsuario.builder()
                                            .descricao("Tipo usuario professor teste")
                                            .build();

        Professor professor = ProfessorFactory.buildProfessor();
        Usuario usuario = Usuario.builder()
                                .codigoAcesso(professor.getCodigo())
                                .criadoEm(data)
                                .descricao("Um usuario qualquer")
                                .senha("12345")
                                .tipoUsuario(tipoUsuario)
                                .build();

        return usuario;
    }    
}
