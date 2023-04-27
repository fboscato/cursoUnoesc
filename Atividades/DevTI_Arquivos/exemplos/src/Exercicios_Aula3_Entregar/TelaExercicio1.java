package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio1 {

	private JFrame frame;
	private JTextField txtNum;
	private JLabel lblSucessor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio1 window = new TelaExercicio1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaExercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setLayout(null);
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNum.setBounds(223, 23, 86, 20);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);
		
		lblSucessor = new JLabel("");
		lblSucessor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSucessor.setBounds(91, 181, 218, 38);
		frame.getContentPane().add(lblSucessor);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_1 = new JLabel("Digite um n\u00FAmero:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(91, 26, 147, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnVerificar = new JButton("Sucessor");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sucessor;
				
				sucessor = Integer.parseInt(txtNum.getText());
				sucessor += 1;
				lblSucessor.setText("O Sucessor de "+txtNum.getText()+ " é: "+sucessor);
			}
		});
		btnVerificar.setBounds(142, 96, 103, 38);
		frame.getContentPane().add(btnVerificar);
		
	}
}
