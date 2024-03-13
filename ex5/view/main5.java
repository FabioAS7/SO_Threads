package view;

import controller.Thread_ping;

public class main5 
{
	public static void main (String args[])
	{
		Thread_ping Thread1 = new Thread_ping("www.uol.com.br");
		Thread_ping Thread2 = new Thread_ping("www.terra.com.br");
		Thread_ping Thread3 = new Thread_ping("www.google.com.br");
		Thread1.start();
		Thread2.start();
		Thread3.start();
	}
}
