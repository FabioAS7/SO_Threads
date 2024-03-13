package controller;

public class Thread_soma_vet extends Thread
{
	private int vet[];
	private int indentificao_linha;
			
	public Thread_soma_vet()
	{
		super();
	}
	
	public Thread_soma_vet(int vet[], int indentificao_linha)
	{
		this.vet = vet;
		this.indentificao_linha = indentificao_linha;
	}

	public void run()
	{
		int soma = 0;
		for(int i=0; i<5; i++)
		{
			soma = soma + vet[i];
		}
		System.out.println("\nThead #" + indentificao_linha + "\nVet = " +  vet[0] + " " + vet[1]+ " " + vet[2] + " " + vet[3] + " " + vet[4] + "\nSoma Total = " + soma);
	}
}
