package atividade1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Prontuario extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JTextField fieldNome;
	private JTextField fieldDataNascimento;
	private JTextField fieldNaturalidade;
	private JTextField fieldTelefone;
	private JTextField fieldEndereco;
	private JTextField textFieldExame;
	private JTextField textFieldData;
	private JTextField textFieldTratamentoTipo;
	private JTextField textFieldCPF;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prontuario frame = new Prontuario();
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
	public Prontuario() {
		setResizable(false);
		setTitle("Prontu\u00E1rio M\u00E9dico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnMenu.add(menuItemSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Dados Pessoais", new ImageIcon(Prontuario.class.getResource("/figuras/folder.png")), panel1, null);
		panel1.setLayout(new MigLayout("", "[][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelNome = new JLabel("Nome");
		panel1.add(labelNome, "cell 0 0,alignx left");
		
		fieldNome = new JTextField();
		panel1.add(fieldNome, "cell 1 0 3 1,growx");
		fieldNome.setColumns(10);
		
		JLabel labelCPF = new JLabel("CPF");
		panel1.add(labelCPF, "cell 0 1,alignx left");
		
		textFieldCPF = new JTextField();
		panel1.add(textFieldCPF, "cell 1 1,growx");
		textFieldCPF.setColumns(10);
		
		JLabel labelNaturalidade = new JLabel("Naturalidade");
		panel1.add(labelNaturalidade, "flowx,cell 2 1,alignx right");
		
		fieldNaturalidade = new JTextField();
		panel1.add(fieldNaturalidade, "cell 3 1,growx");
		fieldNaturalidade.setColumns(10);
		
		JLabel labelSexo = new JLabel("Sexo");
		panel1.add(labelSexo, "cell 0 2,alignx left");
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		panel1.add(comboBoxSexo, "cell 1 2,growx");
		
		JLabel labelDataNascimento = new JLabel("Data de nascimento");
		panel1.add(labelDataNascimento, "cell 2 2,alignx right");
		
		fieldDataNascimento = new JTextField();
		panel1.add(fieldDataNascimento, "cell 3 2,growx");
		fieldDataNascimento.setColumns(10);
		
		JLabel labelEstadoCivil = new JLabel("Estado Civil");
		panel1.add(labelEstadoCivil, "cell 0 3,alignx trailing");
		
		JComboBox comboBoxEstadoCivil = new JComboBox();
		comboBoxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Uniao Estavel", "Casado", "Divorciado", "Viuvo"}));
		panel1.add(comboBoxEstadoCivil, "cell 1 3,growx");
		
		JLabel labelTelefone = new JLabel("Telefone");
		panel1.add(labelTelefone, "cell 2 3,alignx right");
		
		fieldTelefone = new JTextField();
		panel1.add(fieldTelefone, "cell 3 3,growx");
		fieldTelefone.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		panel1.add(labelEndereco, "cell 0 4,alignx left");
		
		fieldEndereco = new JTextField();
		panel1.add(fieldEndereco, "cell 1 4 3 1,growx");
		fieldEndereco.setColumns(10);
		
		JButton buttonSalvar1 = new JButton("Salvar");
		buttonSalvar1.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		panel1.add(buttonSalvar1, "cell 0 5 4 1,alignx center");
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(144, 238, 144));
		tabbedPane.addTab("Anamnese", new ImageIcon(Prontuario.class.getResource("/figuras/conversa.png")), panel2, null);
		panel2.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelQueixa = new JLabel("Queixa Principal");
		panel2.add(labelQueixa, "cell 0 0");
		
		JScrollPane scrollPane5 = new JScrollPane();
		panel2.add(scrollPane5, "cell 0 1 2 1,grow");
		
		JTextArea textAreaQP = new JTextArea();
		scrollPane5.setViewportView(textAreaQP);
		
		JLabel labelHDA = new JLabel("Hist\u00F3rico da Doen\u00E7a Atual");
		panel2.add(labelHDA, "cell 0 2");
		
		JLabel labelHF = new JLabel("Hist\u00F3rico Familiar");
		panel2.add(labelHF, "cell 1 2");
		
		JScrollPane scrollPane1 = new JScrollPane();
		panel2.add(scrollPane1, "cell 0 3,grow");
		
		JTextArea textAreaHDA = new JTextArea();
		scrollPane1.setViewportView(textAreaHDA);
		
		JScrollPane scrollPane2 = new JScrollPane();
		panel2.add(scrollPane2, "cell 1 3,grow");
		
		JTextArea textAreaHF = new JTextArea();
		scrollPane2.setViewportView(textAreaHF);
		
		JLabel labelAP = new JLabel("Antecedentes pessoais");
		panel2.add(labelAP, "cell 0 4");
		
		JLabel labelHabitos = new JLabel("H\u00E1bitos de vida");
		panel2.add(labelHabitos, "cell 1 4");
		
		JScrollPane scrollPane3 = new JScrollPane();
		panel2.add(scrollPane3, "cell 0 5,grow");
		
		JTextArea textAreaAP = new JTextArea();
		scrollPane3.setViewportView(textAreaAP);
		
		JScrollPane scrollPane4 = new JScrollPane();
		panel2.add(scrollPane4, "cell 1 5,grow");
		
		JTextArea textAreaHabitos = new JTextArea();
		scrollPane4.setViewportView(textAreaHabitos);
		
		JButton buttonSalvar2 = new JButton("Salvar");
		buttonSalvar2.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		panel2.add(buttonSalvar2, "cell 0 6 2 1,alignx center");
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 165, 0));
		tabbedPane.addTab("Exames", new ImageIcon(Prontuario.class.getResource("/figuras/test.png")), panel3, null);
		panel3.setLayout(new MigLayout("", "[][grow]", "[grow][grow][grow][grow][grow]"));
		
		JLabel labelTipoExame = new JLabel("Tipo de Exame");
		panel3.add(labelTipoExame, "cell 0 0,alignx trailing");
		
		textFieldExame = new JTextField();
		panel3.add(textFieldExame, "cell 1 0,growx");
		textFieldExame.setColumns(10);
		
		JLabel labelData = new JLabel("Data");
		panel3.add(labelData, "cell 0 1,alignx left");
		
		textFieldData = new JTextField();
		panel3.add(textFieldData, "cell 1 1,alignx left");
		textFieldData.setColumns(10);
		
		JLabel labelLaudo = new JLabel("Laudo");
		panel3.add(labelLaudo, "cell 0 2");
		
		TextArea textAreaLaudo = new TextArea();
		panel3.add(textAreaLaudo, "cell 1 2,growx");
		
		JButton buttonSalvar3 = new JButton("Salvar");
		buttonSalvar3.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		panel3.add(buttonSalvar3, "cell 0 4 2 1,alignx center");
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(233, 150, 122));
		tabbedPane.addTab("Tratamento", new ImageIcon(Prontuario.class.getResource("/figuras/remedio.png")), panel4, null);
		panel4.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelTratamentoTipo = new JLabel("Tipo de Tratamento");
		panel4.add(labelTratamentoTipo, "cell 0 0");
		
		textFieldTratamentoTipo = new JTextField();
		panel4.add(textFieldTratamentoTipo, "cell 0 1,growx");
		textFieldTratamentoTipo.setColumns(10);
		
		JLabel labelTratamentoDescricao = new JLabel("Descri\u00E7\u00E3o");
		panel4.add(labelTratamentoDescricao, "cell 0 2");
		
		TextArea textAreaTratamentoDescricao = new TextArea();
		panel4.add(textAreaTratamentoDescricao, "cell 0 3,growx");
		
		JButton buttonSalvar4 = new JButton("Salvar");
		buttonSalvar4.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		panel4.add(buttonSalvar4, "cell 0 5,alignx center");
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}
	
	

}
