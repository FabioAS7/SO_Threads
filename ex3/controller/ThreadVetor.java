package controller;

public class ThreadVetor extends Thread
{
	private int valor_numerico;
	private int vet[];

	public ThreadVetor()
	{
		super();
	}
	
	public ThreadVetor(int valor_numerico, int vet[])
	{
		this.valor_numerico = valor_numerico;
		this.vet = vet;
	}
	
	public void run()
	{
		double tempo_inicial, tempo_final;
		
		if (valor_numerico % 2 == 0)
		{
			tempo_inicial = System.nanoTime();
			for(int i=0; i<vet.length; i++)
			{
			}
			tempo_final = System.nanoTime();
			System.out.printf("Thread #" + getId() + ", o tempo para percorrer o vetor, usando .length, foi de %.8fs \n", (tempo_final - tempo_inicial)/(Math.pow(10, 8)) );
		}
		else
		{
			tempo_inicial = System.nanoTime();
			for(int i : vet)
			{
			}
			tempo_final = System.nanoTime();
			System.out.printf("Thread #" + getId() + ", o tempo para percorrer o vetor, usando ForEach, foi de %.8fs \n", (tempo_final - tempo_inicial)/(Math.pow(10, 8)) );
		}
	}
}
