package TugasPrakAlpro_2511533023;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class OperatorRelasional_2511533023 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField textField_2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void PesanEror(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorRelasional_2511533023 frame = new OperatorRelasional_2511533023();
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
	public OperatorRelasional_2511533023() {
		setTitle("Operator Relasional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR RELASIONAL");
		lblNewLabel.setBounds(135, 6, 166, 16);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bil 1");
		lblNewLabel_1.setBounds(24, 55, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bil 2");
		lblNewLabel_2.setBounds(24, 83, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(24, 139, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(24, 189, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(97, 50, 130, 26);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(97, 83, 130, 26);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"==", "!=", ">", "<", ">=", "<="}));
		cbOperator.setBounds(97, 135, 75, 27);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 Harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 Harus diisi");
				} else
				{	
					try {
						int a= Integer.valueOf(txtBil1.getText());
						int b= Integer.valueOf(txtBil2.getText());
						int c= cbOperator.getSelectedIndex();
						boolean hasil = false;
						
						switch (c) {
						case 0:
							hasil = (a == b);
							break;	
						case 1:
							hasil = (a != b);
							break;
						case 2:
							hasil = (a > b);
							break;
						case 3:
							hasil = (a < b);
							break;
						case 4:
							hasil = (a >= b);
							break;
						case 5:
							hasil = (a <= b);
							break;
							default:
								hasil = false;
								break;
						}
						txtHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						PesanEror("Bilangan 1 dan Bilangan 2 harus angka");
					}
					
		    	}
	        }
		});
		btnNewButton.setBounds(209, 134, 117, 29);
		contentPane.add(btnNewButton);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(97, 184, 130, 26);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
	}
}
