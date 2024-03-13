package view;

import controller.Thread_soma_vet;

public class Main2 
{
	public static void main(String args[])
	{
		int matriz[][] = new int[3][5];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++)
			{
				matriz[i][j] = (int)(Math.random()*100);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		for(int i=0; i<3; i++)
		{
			Thread_soma_vet th = new Thread_soma_vet(matriz[i],i);
			th.start();
		}
	}
}
