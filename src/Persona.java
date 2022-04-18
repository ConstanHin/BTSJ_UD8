
public class Persona {

	static final private char hombre = 'H';
	static final private char mujer = 'M';

	// Attributes
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso; // kg
	private int altura; // cm

	// Constructors

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = hombre;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, char sexo, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
	}

	// Getters Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public static char getHombre() {
		return hombre;
	}

	public static char getMujer() {
		return mujer;
	}
}
