package operadores;

public class OperadoresAritmeticos {
	/* Ordem correta de precedência:
	 * 1-> () Parênteses,
	 * 2-> ++x,--x (pré) incremento/decremento(executados antes da expressão),
	 * 3-> *, /, % Multiplicação, Divisão e Módulo,
	 * 4->+, -Soma e Subtração,
	 * 5->x++,x--(pós) incremento/decremento(mesmo resultado que o pré porém é executados após a expressão).*/
	 
	public static void main(String[]args) {
		
		//1-Parênteses: calcula (executa) o que está dentro do parênteses primeiro.
		
		int x = 10;
		int y = 20;
		int z = 3;
		
		var sem_parenteses = x * y + z;//203- multiplica 10 * 20= 200 e depois soma com 3;
		
		var parenteses = x * (y + z);// 230- soma 20 + 3 = 23 e depois multiplica por 10;
		
		System.out.println(sem_parenteses);
		System.out.println(parenteses);
		System.out.println("--------------------------");
		
		
		//2->(unário)++x,--x (pré) incremento/decremento.
		
		int pIncremento = 10;
		int pDecremento = 60;
		
		++pIncremento;//aumenta 1 (11).
		--pDecremento;//diminui 1 (59).
		
		System.out.println(pIncremento);
		System.out.println(pDecremento);
		System.out.println("--------------------------");
		
		
		//3-> *, /, % Multiplicação, Divisão e Módulo.
		
		int valorA = 30;
		int valorB = 7;
		
		int multiplicacao = valorA * valorB;//30 * 7 = 210;
		int divisao = valorA / valorB;//30 / 7 = exibe o inteiro 4;
		int restoD = valorA % valorB;//30 / 7 = 4,2... retorna o inteiro do resto da divisão = 2;
		
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(restoD);
		System.out.println("--------------------------");
		
		
		//4-> +, -Soma e Subtração.
		
		int a = 100;
		int b = 50;
		
		int soma = a + b;//150;
		int sub = a - b;//50;
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println("--------------------------");
		
	}

}
