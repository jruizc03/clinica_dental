
public class Inventario {
	private int id;
	private int existencias;
	private String nombreInstrumento;
	
	public Inventario() {
		
	}
	
	public Inventario(int id, int existencias, String nombreInstrumento) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}
}
