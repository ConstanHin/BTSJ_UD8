package TA_04;

public class Serie {
	
	// Constants
	
	protected int NR_TEMPORADAS = 3;
	protected boolean ENTREGADO = false;

	// Attributes
	protected String titulo;
	protected int nrTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	// Constructors
	
	public Serie() {
		this.titulo = "";
		this.nrTemporadas = NR_TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.nrTemporadas = NR_TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}
	public Serie(String titulo, int nrTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nrTemporadas = nrTemporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}
}
