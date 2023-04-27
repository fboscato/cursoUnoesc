package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Aluno {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno window = new Aluno();
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
	public Aluno() {
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
		
		JLabel lblNome = new JLabel("Informe o seu nome: ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 11, 136, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Informe a sua idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setBounds(10, 42, 136, 14);
		frame.getContentPane().add(lblIdade);
		
		JLabel lblN1 = new JLabel("Informe a primeira nota:");
		lblN1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN1.setBounds(10, 77, 157, 14);
		frame.getContentPane().add(lblN1);
		
		JLabel lblN3 = new JLabel("Informe a terceira nota:");
		lblN3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN3.setBounds(10, 143, 157, 14);
		frame.getContentPane().add(lblN3);
		
		JLabel lblN2 = new JLabel("Informe a segunda nota:");
		lblN2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN2.setBounds(10, 111, 157, 14);
		frame.getContentPane().add(lblN2);
		
		txtNome = new JTextField();
		txtNome.setBounds(156, 10, 246, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(156, 41, 86, 20);
		frame.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		txtN1 = new JTextField();
		txtN1.setBounds(177, 76, 86, 20);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(177, 110, 86, 20);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		txtN3 = new JTextField();
		txtN3.setBounds(177, 142, 86, 20);
		frame.getContentPane().add(txtN3);
		txtN3.setColumns(10);
		
		JLabel lblMedia = new JLabel("");
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMedia.setBounds(187, 173, 240, 35);
		frame.getContentPane().add(lblMedia);

		JLabel lblSituacao = new JLabel("");
		lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSituacao.setBounds(253, 219, 138, 31);
		frame.getContentPane().add(lblSituacao);
		
		JButton btnCalcular = new JButton("Calcular Notas");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double media;
				double n1;
				double n2;
				double n3;
				
				n1 = Double.parseDouble(txtN1.getText());
				n2 = Double.parseDouble(txtN2.getText());
				n3 = Double.parseDouble(txtN3.getText());
				
				media = (n1 + n2 + n3) / 3;
				lblMedia.setText("A média de "+txtNome.getText()+" é "+media);
				if (media < 5) { 
					lblSituacao.setText("Reprovado!"); }
					else if (media < 7) 
					{
					lblSituacao.setText("Em exame!"); }
					else { 
					lblSituacao.setText("Aprovado!"); }	
				
				}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(19, 190, 127, 46);
		frame.getContentPane().add(btnCalcular);
		
	}

}
