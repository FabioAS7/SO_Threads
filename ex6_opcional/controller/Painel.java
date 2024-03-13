package controller;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Painel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Painel frame = new Painel();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Painel() 
	{
		int posicao1 = 270;
		int posicao2 = 270;
		
		setTitle("CORRIDA! YAY!!!!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 225, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("COMEÇAR!");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(30, 500, 100, 50);
		contentPane.add(btnNewButton);
		
		JLabel Carrinho1 = new JLabel("");
		Carrinho1.setIcon(new ImageIcon(Painel.class.getResource("/imagens/carrinho_1.png")));
		Carrinho1.setBounds(30, 50, posicao1, 200);
		contentPane.add(Carrinho1);
		
		JLabel carrinho2 = new JLabel("");
		carrinho2.setIcon(new ImageIcon(Painel.class.getResource("/imagens/carrinho_2.png")));
		carrinho2.setBounds(30, 260, posicao2, 200);
		contentPane.add(carrinho2);
		
		JLabel linha = new JLabel("");
		linha.setIcon(new ImageIcon(Painel.class.getResource("/imagens/linha.png")));
		linha.setBounds(40, 248, 1406, 14);
		contentPane.add(linha);
		
		JLabel titulo1 = new JLabel("CARRINHO 1");
		titulo1.setForeground(new Color(255, 0, 0));
		titulo1.setFont(new Font("Tahoma", Font.BOLD, 15));
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo1.setBounds(123, 25, 110, 32);
		contentPane.add(titulo1);
		
		JLabel titulo2 = new JLabel("CARRINHO 2");
		titulo2.setHorizontalAlignment(SwingConstants.CENTER);
		titulo2.setForeground(new Color(0, 0, 255));
		titulo2.setFont(new Font("Tahoma", Font.BOLD, 15));
		titulo2.setBounds(133, 462, 110, 32);
		contentPane.add(titulo2);
	}
}
