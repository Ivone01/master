import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
	Operacoes o = new Operacoes();	
		

	
	
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o 1º valor:");
	int v1 = scanner.nextInt();
	System.out.println("Digite o 2º valor:");
	int v2 = scanner.nextInt();
	o.soma(v1,v2);
	System.out.println("vamos iniciar a operação de divisao");
	System.out.println("Digite o 1º valor:" );
int v3 = scanner.nextInt();
	System.out.println("Digite o 2º valor:");
	int v4 = scanner.nextInt();
	o.divisao(v3, v4);

	}

}
