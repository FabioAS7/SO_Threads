package controller;

public class Threads_id_num extends Thread
{

	public void run()
	{
		System.out.println("#" + getId());
	}

}
