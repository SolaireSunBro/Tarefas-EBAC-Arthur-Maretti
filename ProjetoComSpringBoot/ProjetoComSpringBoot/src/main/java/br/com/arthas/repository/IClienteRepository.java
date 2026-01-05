/**
 * 
 */
package br.com.arthas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.arthas.domain.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}