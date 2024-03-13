package view;

import controller.Threads_id_num;

public class Main 
{
	public static void main(String args[])
	{
		for(int i=0; i<5; i++)
		{
			Threads_id_num thread = new Threads_id_num();
			thread.start();
		}
	}
}
