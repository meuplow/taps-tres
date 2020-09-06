package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JSplit extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSplit frame = new JSplit();
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
	public JSplit() {
		setTitle("JSplit Task");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		splitPane.setDividerLocation(180);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JLabel labelImagem = new JLabel("");
		labelImagem.setToolTipText("homer.jpg");
		labelImagem.setIcon(new ImageIcon(JSplit.class.getResource("/figuras/homer2.jpg")));
		scrollPane.setViewportView(labelImagem);
		
		JPanel panelDireita = new JPanel();
		splitPane.setRightComponent(panelDireita);
		panelDireita.setLayout(null);
		
		JLabel labelNome = new JLabel("");
		labelNome.setBounds(10, 27, 198, 41);
		panelDireita.add(labelNome);
		labelNome.setText("Nome da imagem: " + labelImagem.getToolTipText()); 
		
		JLabel labelLargura = new JLabel("");
		labelLargura.setBounds(10, 100, 198, 41);
		panelDireita.add(labelLargura);
		labelLargura.setText("Largura: " + labelImagem.getIcon().getIconWidth());
		
		JLabel labelAltura = new JLabel("");
		labelAltura.setBounds(10, 182, 198, 41);
		panelDireita.add(labelAltura);
		labelAltura.setText("Altura: " + labelImagem.getIcon().getIconHeight());
		
		JPanel panelSul = new JPanel();
		contentPane.add(panelSul, BorderLayout.SOUTH);
		
		JButton buttonSair = new JButton("Sair");
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panelSul.add(buttonSair);
	}

	public JSplitPane getSplitPane() {
		return splitPane;
	}

	public void setSplitPane(JSplitPane splitPane) {
		this.splitPane = splitPane;
	}
	
	
}
