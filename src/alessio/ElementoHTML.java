package alessio;

import java.util.Map;
import java.util.HashMap;
import alessio.*;


public abstract class ElementoHTML {
	protected String id;
	protected String classeCss;
	protected Map<String, String> estilos = new HashMap<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != null)
			this.id = id;
	}

	public String getClasseCss() {
		return classeCss;
	}

	public void setClasseCss(String classeCss) {
		if (id != null)
			this.classeCss = classeCss;
	}

	public Map<String, String> getEstilos() {
		return estilos;
	}

	public void setEstilos(Map<String, String> estilos) {
		if (id != null)
			this.estilos = estilos;
	}

	public ElementoHTML(String id, String classeCss) {
		this.id = id;
		this.classeCss = classeCss;
	}

	public void adicionarEstilo(String propriedade, String valor) {
		this.estilos.put(propriedade, valor);
	}

	protected String formatarEstilos() {
		if (estilos.isEmpty())
			return "";
		StringBuilder sb = new StringBuilder(" style=\"");
		estilos.forEach((prop, val) -> sb.append(prop).append(": ").append(val).append("; "));
		sb.append("\"");
		return sb.toString();
	}

	// Método polimórfico que cada elemento implementa
	public abstract String renderizar(int nivelIndentacao);

	protected String getIndentacao(int nivel) {
		return "  ".repeat(nivel);
	}
}
