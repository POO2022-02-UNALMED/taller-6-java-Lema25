package vehiculos;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante {
	public static Map<Fabricante, Integer> mapaFabri = new HashMap<Fabricante, Integer>();
	private String nombre;
	private Pais pais;

	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int max= -1;
		Fabricante fabricaMayorVentas = null;
		
		for(Entry<Fabricante, Integer> entry : mapaFabri.entrySet()) {
			final int actual = entry.getValue();
			
			if (actual > max) {
				fabricaMayorVentas = entry.getKey();
				max = actual;
				
			}
		}
		return fabricaMayorVentas;
	}
	
	public Pais getPais() {
		return pais;}
	public void setPais(Pais pais) {
		this.pais = pais;}
	
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}
	
}
