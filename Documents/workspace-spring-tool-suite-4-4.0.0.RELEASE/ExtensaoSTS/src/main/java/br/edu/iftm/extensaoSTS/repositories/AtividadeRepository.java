package br.edu.iftm.extensaoSTS.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.iftm.extensaoSTS.domain.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade,Integer>{
	//@Query("SELECT a FROM Atividade a WHERE  a.nome LIKE '%:nome%'")
	public List<Atividade> findByNomeContaining(@Param("nome") String nome);
}
