/**
 * 
 */
package br.com.Arthas.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * @author rodrigo.pires
 *
 */
@Named
@ViewScoped
public class IndexController implements Serializable {

	private static final long serialVersionUID = -3176307559028924604L;
	
	public String redirectCliente() {
		return "/cliente/list.xhtml";
	}
	
	public String redirectProduto() {
		return "/produto/list.xhtml";
	}
	
	public String redirectVenda() {
		return "/venda/list.xhtml";
	}
}
