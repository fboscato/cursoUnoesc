package Exercicios_Aula3_Entregar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio2 {

	protected static final JOptionPane JOptionPanel = null;
	private JFrame frame;
	private JTextField txtKm;
	private JTextField txtLitros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio2 window = new TelaExercicio2();
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
	public TelaExercicio2() {
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
		
		JLabel lblKm = new JLabel("Informe os Km percorridos:");
		lblKm.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblKm.setBounds(21, 32, 183, 25);
		frame.getContentPane().add(lblKm);
		
		
		txtKm = new JTextField();
		txtKm.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtKm.setBounds(214, 34, 86, 20);
		frame.getContentPane().add(txtKm);
		txtKm.setColumns(10);
		
		JLabel lblLitros = new JLabel("Informe a quantidade de combust\u00EDvel em litros:");
		lblLitros.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblLitros.setBounds(21, 97, 322, 14);
		frame.getContentPane().add(lblLitros);
		
		txtLitros = new JTextField();
		txtLitros.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtLitros.setBounds(319, 96, 86, 20);
		frame.getContentPane().add(txtLitros);
		txtLitros.setColumns(10);
		
		JLabel lblMedia = new JLabel("");
		lblMedia.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblMedia.setBounds(21, 225, 384, 25);
		frame.getContentPane().add(lblMedia);
		
		JButton btnConsumo = new JButton("Calcular M\u00E9dia");
		btnConsumo.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnConsumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double consumo;
				consumo = (Double.parseDouble(txtKm.getText()) / (Double.parseDouble(txtLitros.getText())));
				lblMedia.setText("A média de consumo é de: "+consumo+" Km por litro");
			}
		});
		btnConsumo.setBounds(106, 150, 194, 46);
		frame.getContentPane().add(btnConsumo);
	
	}
}
