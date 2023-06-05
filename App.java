package prjtAluno;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Aluno alu = new Aluno ();
		
		/*for (int i=0; i<4; i++) {
			System.out.println("Informe a " +(i+1)+ "ª nota do Aluno: ");
			alu.notas[i] = in.nextDouble();
	
		}
		/*  
		  // Sem retorno e sem parâmetro
			alu.calcularMedia();
			System.out.println("A média é: "+alu.media);
		*/
		
		 // Com retorno e sem parâmetro	
			//System.out.println("A média é: "+alu.calcularMedia());
			
		/*
		// Sem retorno e com parâmetro
			alu.calcularMedia(5, 6, 7, 8);
			System.out.println("A média é: "+alu.media);
			*/
		
		// Com retorno e com parâmetro
			System.out.println("A média é: "+alu.calcularMedia(9, 10, 8, 9));
	}

}
