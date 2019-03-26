package Pacote2;

public class testaIMC {

	public static void main(String[] args) {
		IMC pessoa = new IMC("Maria",35,1.60,55,"F");
		
		System.out.println("Análise do IMC");
		System.out.println(pessoa.analisaIMC());
		
		//se alterar altura e peso
		pessoa.setAltura(1.7);
		pessoa.setPeso(90);
		
		System.out.println("Análise do IMC");
		System.out.println(pessoa.analisaIMC());
				
	}

}
