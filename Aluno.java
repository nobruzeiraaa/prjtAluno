package prjtAluno;

public class Aluno {
	
	String nome;
	String ra;
	double notas[] = new double [4];
	double media;
	
	/* 
	//Sem retorno e sem par�metro
	public void calcularMedia() {
		for (int i=0; i<4; i++) {
			media = media + notas[i];
		}
		media = media / 4;
	}
	*/
	//Com retorno e sem par�metro
	public double calcularMedia() {
		for (int i=0; i<4; i++) {
			media = media + notas[i];
		}
		media = media / 4;
		return media;
		}
	/*
	//Sem retorno e com par�metro
	public void calcularMedia(double n1, double n2, double n3, double n4) {
		notas[0] = n1;
		notas[1] = n2;
		notas[2] = n3;
		notas[3] = n4;
		
		for (int i=0; i<4; i++) {
			media = media + notas[i];
		}
		media = media / 4;
	}
	*/
	//Com retorno e com par�metro
	public double calcularMedia(double n1, double n2, double n3, double n4) {
		notas[0] = n1;
		notas[1] = n2;
		notas[2] = n3;
		notas[3] = n4;
		
		for (int i=0; i<4; i++) {
			media = media + notas[i];
		}
		media = media / 4;
		return media;
	}
}


