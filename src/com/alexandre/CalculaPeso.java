package com.alexandre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculaPeso extends JFrame {

	private JPanel contentPane;
	private JTextField txtpeso;
	protected Object total;
	protected double txtpeso1;
	protected JLabel peso;
	protected double pesop;
	protected double result;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaPeso frame = new CalculaPeso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculaPeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peso na Terra (Kg):");
		lblNewLabel.setBounds(59, 35, 125, 14);
		contentPane.add(lblNewLabel);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(59, 60, 86, 20);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		JButton btnNewButton = new JButton("LIMPAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtpeso.setText(" ");
			}
		});
		btnNewButton.setBounds(176, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o Planeta:");
		lblNewLabel_1.setBounds(59, 107, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton mercurio = new JButton("Mercurio");
		mercurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 0.37 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em mercurio é: " +result+ "Kgs");
				
			}
		});
		mercurio.setBounds(21, 168, 89, 23);
		contentPane.add(mercurio);
		
		JButton marte = new JButton("Marte");
		marte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 0.38 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em marte é: " +result+ "Kgs");
				
			}
		});
		marte.setBounds(176, 168, 89, 23);
		contentPane.add(marte);
		
		JButton saturno = new JButton("Saturno");
		saturno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 1.15 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em saturno é: " +result+ "Kgs");
				
				
			}
		});
		saturno.setBounds(335, 168, 89, 23);
		contentPane.add(saturno);
		
		JButton venus = new JButton("Venus");
		venus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 0.88 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em venus é: " +result+ "Kgs");
				
				
			}
		});
		venus.setBounds(21, 202, 89, 23);
		contentPane.add(venus);
		
		JButton jupiter = new JButton("J\u00FApiter");
		jupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 2.64 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em jupiter é: " +result+ "Kgs");
				
			}
		});
		jupiter.setBounds(176, 202, 89, 23);
		contentPane.add(jupiter);
		
		JButton urano = new JButton("Urano");
		urano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 1.17 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em urano é: " +result+ "Kgs");
				
				
			}
		});
		urano.setBounds(335, 202, 89, 23);
		contentPane.add(urano);
	}
}
