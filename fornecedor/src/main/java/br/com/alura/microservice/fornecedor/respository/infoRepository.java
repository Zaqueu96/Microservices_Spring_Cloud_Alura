package br.com.alura.microservice.fornecedor.respository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;

public interface infoRepository extends CrudRepository<InfoFornecedor, Long>{
	
	InfoFornecedor findByEstado(String estado);

}
