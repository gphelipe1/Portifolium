package com.ufma.portifolium.repository;

import com.ufma.portifolium.model.entities.TipoUsuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoUsuarioRepository extends JpaRepository <TipoUsuario, Long>{
    
}
