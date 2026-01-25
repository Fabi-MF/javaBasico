package variaveis;

public class VariaveisXConstantes {
	/*Variáveis são espaços na memória que podem mudar de valor durante a execução, seu valor final pode se tornar uma constante.
	Constantes não podem ser alterados depois que seus valores são atribuídos.*/

	public static void main(String[]args) {
		
	//Constante:
	int a = 5;
	int b = 10;
	
	final int VALOR_FINAL = a + b;// constantes são declaradas usando final 
	
	System.out.print("O resultado é : " + VALOR_FINAL+"\n");
	
	//Variáveis: em Java, existem diferentes tipos de variáveis, que devem ser declaradas:
	
	
	//String: armazena texto, declarado com "aspas duplas".
	var nome= "Anna"; //var - deduz automaticamente o tipo da variável, só funciona em variáveis locais (dentro de métodos, blocos, loops).
	var nome2 = "Maria";
	
	System.out.println(nome +" "+ nome2);// + serve para concatenar(juntar) 
	
	
	
	//int: armazena números inteiros, sem casas decimais.
	int idade = 105;
	
	//float: armazena números de ponto flutuante, com casas decimais(declarado com f no final).
	float saldo = 190000.55f;
	
	//char: armazena caracteres individuais.
	char sexo = 'f'; // declarado com aspas simples ''
	
	//boolean: armazena valores com dois estados: verdadeiro ou falso.
	boolean pv = true; 
	System.out.println("Nome: "+nome+", idade: "+idade+", saldo: R$"+saldo+", sexo: "+sexo+", prova de vida: "+pv);
	}
}
