package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblN1 = new JLabel("Informe um n\u00FAmero:");
		lblN1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN1.setBounds(43, 12, 142, 14);
		frame.getContentPane().add(lblN1);
		
		JLabel lblNewLabel = new JLabel("Informe um n\u00FAmero:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(43, 57, 142, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtN1 = new JTextField();
		txtN1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtN1.setBounds(195, 11, 86, 20);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtN2.setBounds(195, 56, 86, 20);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblMulti = new JLabel("O resultado da multiplica\u00E7\u00E3o \u00E9: ");
		lblMulti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMulti.setBounds(43, 236, 196, 14);
		frame.getContentPane().add(lblMulti);
		
		JLabel lbldiv = new JLabel("O resultado da divis\u00E3o \u00E9: ");
		lbldiv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbldiv.setBounds(43, 211, 196, 14);
		frame.getContentPane().add(lbldiv);
		
		JLabel lblSub = new JLabel("O resultado da subtra\u00E7\u00E3o \u00E9:");
		lblSub.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSub.setBounds(43, 186, 196, 14);
		frame.getContentPane().add(lblSub);
		
		JLabel lblSum = new JLabel("O resultado da soma \u00E9:");
		lblSum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSum.setBounds(43, 161, 196, 14);
		frame.getContentPane().add(lblSum);
		
		JLabel lblSoma = new JLabel("");
		lblSoma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoma.setBounds(249, 161, 46, 14);
		frame.getContentPane().add(lblSoma);
		
		JLabel lblSoma_1 = new JLabel("");
		lblSoma_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoma_1.setBounds(246, 163, 46, 14);
		frame.getContentPane().add(lblSoma_1);
		
		JLabel lblSubtracao = new JLabel("");
		lblSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubtracao.setBounds(249, 186, 46, 14);
		frame.getContentPane().add(lblSubtracao);
		
		JLabel lblDivisao = new JLabel("");
		lblDivisao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDivisao.setBounds(249, 211, 46, 14);
		frame.getContentPane().add(lblDivisao);
		
		JLabel lblMultiplicacao = new JLabel("");
		lblMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMultiplicacao.setBounds(249, 236, 46, 14);
		frame.getContentPane().add(lblMultiplicacao);
		
		JButton btnCalcular = new JButton("Calculadora");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2;
				double soma, sub, div, multi;
				
				num1 = Integer.parseInt(txtN1.getText());
				num2 = Integer.parseInt(txtN2.getText());
				
				soma = (num1 + num2);
				sub = (num1 - num2);
				div = (num1 / num2);
				multi = (num1 * num2);
				
				lblSoma.setText(""+soma);
				lblSubtracao.setText(""+sub);
				lblDivisao.setText(""+div);
				lblMultiplicacao.setText(""+multi);
				
			}
		});
		btnCalcular.setBounds(78, 96, 173, 43);
		frame.getContentPane().add(btnCalcular);
	}

}
