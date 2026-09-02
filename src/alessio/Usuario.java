package alessio;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private int id;
	private String nomeUsuario;
	private String senha;
	private TipoUsuario tipo;

	public static int quantUsuarios;
	
	private Usuario() {
		System.out.println("Criou um objeto usuario()");
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		if (!nomeUsuario.isEmpty() && nomeUsuario != null)
			this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (!senha.isEmpty() && senha != null)
			this.senha = senha;
	}

	public int getTipo() {
		return tipo.cod;
	}

	public void setTipo(TipoUsuario tipo) {
		if (tipo == TipoUsuario.Atendente || tipo == TipoUsuario.Administrador)
			this.tipo = tipo;
	}

	public Usuario(String nomeUsuario, String senha, TipoUsuario tipo) {
		id++;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.tipo = tipo;
		quantUsuarios++;
	}

}
