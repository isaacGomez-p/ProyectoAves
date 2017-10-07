
public class DatosAve {
	String nombre,especie;
	int edad, puntos;
	
	public DatosAve(String nombre, String especie, int edad, int puntos) {
		this.nombre=nombre;
		this.especie=especie;
		this.edad=edad;
		this.puntos=puntos;
	}
	public DatosAve(String nombre, String especie,int puntos) {
		this.nombre=nombre;
		this.especie=especie;
		this.puntos=puntos;
	}
	public DatosAve(String nombre,int edad, String especie) {
		this.nombre=nombre;
		this.especie=especie;
		this.edad=edad;
	}
	public DatosAve(String nombre, int edad, int punt) {
		this.nombre=nombre;
		this.edad=edad;
		this.puntos=punt;
	}
	public String getNom() {
		return nombre;
	}
	public void setNom(String c) {
		this.nombre=c;
	}
	public String getEsp() {
		return especie;
	}
	public void setEsp(String c) {
		this.especie=c;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int c) {
		this.edad=c;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int c) {
		this.puntos=c;
	}
	public String toString() {
		return nombre;
	}
}
