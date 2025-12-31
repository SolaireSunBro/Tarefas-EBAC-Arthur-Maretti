/**
 * 
 */
package br.com.Arthas.jpa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteJpaDaoTest.class, ProdutoJpaDAOTest.class, VendaJpaDAOTest.class})
public class AllTests {

}
