package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Thread_ping extends Thread
{
	private String dominio;
	private int tempo;
	
	public Thread_ping(String dominio)
	{
		this.dominio = dominio;
		if (dominio.contains("uol"))
		{
			tempo = 1000;
		}
		else if (dominio.contains("terra"))
		{
			tempo = 2500;
		}
		else if (dominio.contains("google"))
		{
			tempo = 4000;
		}
		else
		{
			tempo = 5500;
		}
	}
	
	public Thread_ping()
	{
		super();
	}
	
	private static String os()
	{
		String so = System.getProperty("os.name");
		return so;
	}
	
	private void ler_ping()
	{
		String linha_lida;
		StringBuffer comando = new StringBuffer();
		comando = comando.append("ping -4 -c 10 ");
		comando = comando.append(dominio);
		
		try
		{
			Process proc = Runtime.getRuntime().exec(comando.toString());
			InputStream fluxo = proc.getInputStream();
			InputStreamReader leitor_dados = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor_dados);
			linha_lida = buffer.readLine();
			
			while(linha_lida != null)
			{
				if ((linha_lida.contains("ping statistics")) || (linha_lida.contains("rtt min/avg/max/mdev")))
				{
					System.out.println("#" + getId() + " " + linha_lida);
				}
				linha_lida = buffer.readLine();	
			}
			fluxo.close();
			leitor_dados.close();
			buffer.close();
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		
		
	}
	
	public void run()
	{
		try 
		{
			sleep(tempo);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		if(os().contains("Linux"))
		{
			ler_ping();
		}
		else
		{
			System.out.println("#" + getId() + " " + "Esse programa e exclusivo para Sistemas Operacionais Linux");
		}
	}
}
