package pbl.pbl9;

public class Movie {

	private String Titulo;
	private Double Pais;
	private Integer Visualizacoes;
	
	public Movie(String Titulo, Double Pais, Integer Visualizacoes) {
		this.Titulo = Titulo;
		this.Pais = Pais;
		this.Visualizacoes = Visualizacoes;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}
	public Double getPais() {
		return Pais;
	}
	public void setPais(Double Pais) {
		this.Pais = Pais;
	}
	public Integer getVisualizacoes() {
		return Visualizacoes;
	}
	public void setVisualizacoes(Integer Visualizacoes) {
		this.Visualizacoes = Visualizacoes;
	}
	public double total() {
		return Pais * Visualizacoes;
	}
}