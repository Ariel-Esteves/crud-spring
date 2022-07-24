package com.soften.ariel.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class PedidoVendaItens implements Serializable{
	private long id;
	private List<PedidoVenda> pedido;
	private List<Produto> produtos;
	
	public PedidoVendaItens(long id, List<PedidoVenda> pedido, List<Produto> produtos) {
		super();
		this.id = id;
		this.pedido = pedido;
		this.produtos = produtos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<PedidoVenda> getPedido() {
		return pedido;
	}

	public void setPedido(List<PedidoVenda> pedido) {
		this.pedido = pedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoVendaItens other = (PedidoVendaItens) obj;
		return id == other.id;
	}
	
	
}
