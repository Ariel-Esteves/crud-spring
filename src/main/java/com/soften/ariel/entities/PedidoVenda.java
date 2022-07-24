package com.soften.ariel.entities;
import java.io.Serializable;
import java.util.Objects;

public class PedidoVenda implements Serializable{
	private Long id;
	private Usuario usuario;
	private Cliente cliente;
	
	public PedidoVenda(Long id, Usuario usuario, Cliente cliente) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
		PedidoVenda other = (PedidoVenda) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
