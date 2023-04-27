package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio5 {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio5 window = new TelaExercicio5();
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
	public TelaExercicio5() {
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
		
		JLabel lblNome = new JLabel("Informe o seu nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(24, 38, 144, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblInformeQual = new JLabel("Informe qual \u00E9 a sua idade:");
		lblInformeQual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInformeQual.setBounds(24, 95, 207, 14);
		frame.getContentPane().add(lblInformeQual);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(178, 37, 111, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIdade.setBounds(245, 92, 86, 20);
		frame.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblApto = new JLabel("");
		lblApto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApto.setBounds(188, 191, 236, 59);
		frame.getContentPane().add(lblApto);
		
		JButton btnVerificar = new JButton("Verificar se pode votar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = 0;
				
				idade = (Integer.parseInt(txtIdade.getText()));
								
				if (idade <= 16) {
				    lblApto.setText(txtNome.getText()+" você não pode votar!");
				    } else {
				    lblApto.setText(txtNome.getText()+" você está apto para votar!");
				    }
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerificar.setBounds(10, 187, 175, 63);
		frame.getContentPane().add(btnVerificar);
		
	}

}
