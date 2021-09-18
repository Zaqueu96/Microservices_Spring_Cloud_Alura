package br.com.alura.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.respository.infoRepository;

@Service
public class InfoService {

	@Autowired
	private infoRepository repository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		return this.repository.findByEstado(estado);
	}
}
