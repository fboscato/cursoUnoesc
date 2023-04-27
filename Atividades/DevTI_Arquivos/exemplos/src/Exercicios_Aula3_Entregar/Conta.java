package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Conta {

	private JFrame frame;
	private JTextField txtValor;
	private JTextField txtTipo;
	private JTextField txtNome;
	private JTextField txtConta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conta window = new Conta();
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
	public Conta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblValor = new JLabel("Informe seu nome:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor.setBounds(10, 39, 172, 14);
		frame.getContentPane().add(lblValor);
		
		JLabel lblValorConta = new JLabel("");
		lblValorConta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorConta.setBounds(30, 160, 371, 30);
		frame.getContentPane().add(lblValorConta);
		
		JLabel lblNewLabel = new JLabel("Saldo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(330, 11, 71, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R$1.000,00");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(306, 31, 118, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTipoConta = new JLabel("");
		lblTipoConta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTipoConta.setBounds(30, 119, 371, 30);
		frame.getContentPane().add(lblTipoConta);
		
		JLabel lblNumeroConta = new JLabel("");
		lblNumeroConta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumeroConta.setBounds(30, 201, 371, 30);
		frame.getContentPane().add(lblNumeroConta);
		
		JLabel lblTitularConta = new JLabel("");
		lblTitularConta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitularConta.setBounds(30, 242, 371, 30);
		frame.getContentPane().add(lblTitularConta);
		
		JLabel lblValor_1 = new JLabel("Informe o valor:");
		lblValor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor_1.setBounds(10, 94, 100, 14);
		frame.getContentPane().add(lblValor_1);
		
		JLabel lblInformeONmero = new JLabel("Informe o n\u00FAmero da conta:");
		lblInformeONmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInformeONmero.setBounds(10, 14, 184, 14);
		frame.getContentPane().add(lblInformeONmero);
		
		JLabel lblInformeOTipo = new JLabel("Informe o tipo da conta:");
		lblInformeOTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInformeOTipo.setBounds(10, 66, 172, 14);
		frame.getContentPane().add(lblInformeOTipo);
		
		txtTipo = new JTextField();
		txtTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTipo.setColumns(10);
		txtTipo.setBounds(171, 63, 118, 20);
		frame.getContentPane().add(txtTipo);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setColumns(10);
		txtNome.setBounds(136, 36, 153, 20);
		frame.getContentPane().add(txtNome);
		
		txtConta = new JTextField();
		txtConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtConta.setColumns(10);
		txtConta.setBounds(188, 11, 100, 20);
		frame.getContentPane().add(txtConta);
		
		JButton btnDepositar = new JButton("DEPOSITAR");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double deposito;
				double saldo = 1000;
				
				deposito = saldo + (Double.parseDouble(txtValor.getText()));
				lblValorConta.setText("Valor em conta é: " + deposito);
			}
		});
		btnDepositar.setBounds(30, 285, 172, 30);
		frame.getContentPane().add(btnDepositar);
		
		JButton btnSacar = new JButton("SACAR");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double saldo = 1000;
				double sacar;
								
				sacar = Double.parseDouble(txtValor.getText());
					
				if (sacar <= saldo) {
					saldo = saldo - sacar;
					lblValorConta.setText("Valor em conta é: " + saldo);
				} else {
					lblValorConta.setText("Saldo insuficiente para saque!");
				}
			}
		});
		btnSacar.setBounds(231, 285, 172, 30);
		frame.getContentPane().add(btnSacar);
		
		JButton btnExtrato = new JButton("EXTRATO");
		btnExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				double saldo = 1000;
				
				lblNumeroConta.setText("O número da conta é: "+txtConta.getText());
				lblTipoConta.setText("O tipo da conta é: "+txtTipo.getText());
				lblTitularConta.setText("O titular da conta é: "+txtNome.getText());
				lblValorConta.setText("O saldo da sua conta é: "+saldo);
			}
		});
		btnExtrato.setBounds(30, 348, 172, 30);
		frame.getContentPane().add(btnExtrato);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(231, 348, 172, 30);
		frame.getContentPane().add(btnSair);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtValor.setBounds(121, 91, 78, 20);
		frame.getContentPane().add(txtValor);
		txtValor.setColumns(10);
			
	}

}
