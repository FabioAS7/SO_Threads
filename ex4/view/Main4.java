package view;

import controller.Thread_corrida_sapo;

public class Main4 
{
	public static void main(String args[])
	{

		Thread_corrida_sapo Thread1 = new Thread_corrida_sapo(1, 100, 10);
		Thread_corrida_sapo Thread2 = new Thread_corrida_sapo(2, 100, 10);
		Thread_corrida_sapo Thread3 = new Thread_corrida_sapo(3, 100, 10);
		Thread_corrida_sapo Thread4 = new Thread_corrida_sapo(4, 100, 10);
		Thread_corrida_sapo Thread5 = new Thread_corrida_sapo(5, 100, 10);
		Thread1.start();
		Thread2.start();
		Thread3.start();
		Thread4.start();
		Thread5.start();
	}

}
