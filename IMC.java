package Pacote2;

public class IMC {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public IMC(String nome, int idade, double altura, double peso, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String analisaIMC() {
		double indice=calcIMC();
		String resAnalise;

		if (indice<=18.5)
			resAnalise="Abaixo do peso normal";

		if (indice > 18.5 && indice <= 25)
			resAnalise="Peso normal";

		if (indice > 25 && indice<=30);
		resAnalise="Acima do peso normal";

		if( indice > 30)
			resAnalise="Obsidade";
		
		return resAnalise;
	}
	
	private double calcIMC() {
		return this.peso/(this.altura*this.altura);
	}

}
