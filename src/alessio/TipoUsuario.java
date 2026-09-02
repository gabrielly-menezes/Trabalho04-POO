package alessio;

public enum TipoUsuario {
	Atendente(1), Administrador(2);

	public final int cod;

	TipoUsuario(int i) {
		cod = i;
	}

	static TipoUsuario getFromCode(int cod) {
		switch (cod) {
		case 1:
			return Atendente;

		case 2:
			return Administrador;
			
		default:
			throw new IllegalArgumentException("Tipo não encojntrdo");
		}
	}

}
