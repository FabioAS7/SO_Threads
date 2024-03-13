package view;

import controller.ThreadVetor;

public class Main3 
{
	public static void main(String args[])
	{
		int vetor[] = new int[1000];
		
		for(int i : vetor)
		{
			vetor[i] = (int)(Math.random()*100)+1;
		}
		
		ThreadVetor Thread1 = new ThreadVetor(1, vetor);
		ThreadVetor Thread2 = new ThreadVetor(2, vetor);
		Thread1.start();
		Thread2.start();
	}
}
