/**
 * 
 */
package br.com.rpires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.rpires.dao.AcessorioDao;
import br.com.rpires.dao.CarroDao;
import br.com.rpires.dao.IAcessorioDao;
import br.com.rpires.dao.ICarroDao;
import br.com.rpires.dao.IMarcaDao;
import br.com.rpires.dao.MarcaDao;
import br.com.rpires.domain.Acessorio;
import br.com.rpires.domain.Carro;
import br.com.rpires.domain.Marca;


/**
 * @author rodrigo.pires
 *
 */
public class CarroTest {
	
	private IAcessorioDao acessorioDao;
	
	private IMarcaDao marcaDao;
	
	private ICarroDao carroDao;
	
	private IAcessorioDao computadorDao;
	
	
	
	public CarroTest() {
		acessorioDao = new AcessorioDao();
		marcaDao = new MarcaDao();
		carroDao = new CarroDao();
		
	}

	@Test
	public void cadastrar() {
		Marca marca = criarMarca("M1");
		Carro carro = criarCarro("C1");
		
		carro.setMarca(marca);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
		
	}
	

	private Carro criarCarro(String codigo) {
		Acessorio accs1 = criarAcessorio("AC1");
		Acessorio accs2 = criarAcessorio("AC2");
		
		Carro carro = new Carro();
		carro.setCodigo("A1");
		carro.setNome("carro1");
		carro.add(accs1);
		carro.add(accs2);
		
		return carroDao.cadastrar(carro);
	}

	private Marca criarMarca(String codigo) {
		Marca marca = new Marca();
		marca.setCnpj("12345678901234");
		marca.setNomeSocial("nome social 1");

		return marcaDao.cadastrar(marca);
	}
	
	private Acessorio criarAcessorio(String codigo) {
		Acessorio accs = new Acessorio();
		accs.setCodigo(codigo);
		accs.setDescricao("acessorio de carro");
		
		return acessorioDao.cadastrar(accs);
	}
}
