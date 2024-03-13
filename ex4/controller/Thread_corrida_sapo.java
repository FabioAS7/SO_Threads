package controller;

public class Thread_corrida_sapo extends Thread 
{
	public Thread_corrida_sapo()
	{
		super();
	}

	int sapo;
	int distacia_max;
	int distancia_maxima_pulo;
	
	public Thread_corrida_sapo(int sapo, int distacia_max, int distancia_maxima_pulo)
	{
		this.sapo = sapo;
		this.distacia_max = distacia_max;
		this.distancia_maxima_pulo = distancia_maxima_pulo;
	}
	
	public void run()
	{
		corrida();
	}
	
	private void corrida()
	{
		int atual = 0, pulo;
		
		while(atual <= distacia_max)
		{
			pulo = (int)(Math.random()*distancia_maxima_pulo + 1);
			atual = atual + pulo;
			if(atual<=distacia_max)
			{
				System.out.println("Thread #" + getId() + ", Sapo#" + sapo + " pulou " + pulo + "m, estando na poisçao " + atual + "m, falta mais " + (distacia_max - atual) + "m");

			}
		}
		System.out.println("Thread #" + getId() + ", Sapo#" + sapo + " TERMINOU A CORRIDA!");
	}
}
