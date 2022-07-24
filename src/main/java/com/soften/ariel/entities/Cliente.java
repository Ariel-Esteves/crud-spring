package com.soften.ariel.entities;
import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable{
	
	private long id;
	private String Name;
	
	public Cliente(long id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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
		Cliente other = (Cliente) obj;
		return id == other.id;
	}
	
	
}
