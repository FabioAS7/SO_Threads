package controller;

public class Metodos extends Thread
{
	public int corrida(int posicao)
	{
		while(posicao <= 1200)
		{
			posicao = posicao + ((int)((Math.random()*500)+1));
		}
		return posicao;
	}

}
