package TA_03;

public class Electrodomestico {

	// Constants

	protected final double PRECIO_BASE = 100;
	protected final String COLOR = "blanco";
	protected final char CONSUMO_ENERGETICO = 'F';
	protected final double PESO = 5;

	// Attributes

	private double precioBase = PRECIO_BASE; // €
	private String color = COLOR;
	private char consumoEnergetico = CONSUMO_ENERGETICO; // A-F
	private double peso = PESO; // kg

	// Constructor

	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;

	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;

	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = asignarColor(color);
		this.consumoEnergetico = asignarConsumo(consumoEnergetico);
		this.peso = peso;
	}

	// Methods

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Methods
	
	/**
	 * Asignar la letra del consumo electrico
	 * 
	 * @param letraConsumo
	 * @return
	 */
	private char asignarConsumo(char letraConsumo) {
		if (letraConsumo > 64 && letraConsumo < 71) {
			return letraConsumo;
		} else {
			return CONSUMO_ENERGETICO;
		}
	}

	/**
	 * Asignar color
	 * 
	 * @return
	 */
	private String asignarColor(String color) {
		// convertir a minusculas
		color = color.toLowerCase();

		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };

		for (int i = 0; i < colores.length; i++) {
			if (color.equals(colores[i])) {
				return color;
			}
		}
		return COLOR;

	}

}
