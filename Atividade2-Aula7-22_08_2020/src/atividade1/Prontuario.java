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
		
		JMenuBar barraDeMenu = new JMenuBar();
		setJMenuBar(barraDeMenu);
		
		JMenu mnMenu = new JMenu("Menu");
		barraDeMenu.add(mnMenu);
		
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
		
		JPanel painelDadosPessoais = new JPanel();
		painelDadosPessoais.setBackground(new Color(95, 158, 160));
		tabbedPane.addTab("Dados Pessoais", new ImageIcon(Prontuario.class.getResource("/figuras/folder.png")), painelDadosPessoais, null);
		painelDadosPessoais.setLayout(new MigLayout("", "[][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelNome = new JLabel("Nome");
		painelDadosPessoais.add(labelNome, "cell 0 0,alignx left");
		
		fieldNome = new JTextField();
		painelDadosPessoais.add(fieldNome, "cell 1 0 3 1,growx");
		fieldNome.setColumns(10);
		
		JLabel labelCPF = new JLabel("CPF");
		painelDadosPessoais.add(labelCPF, "cell 0 1,alignx left");
		
		textFieldCPF = new JTextField();
		painelDadosPessoais.add(textFieldCPF, "cell 1 1,growx");
		textFieldCPF.setColumns(10);
		
		JLabel labelNaturalidade = new JLabel("Naturalidade");
		painelDadosPessoais.add(labelNaturalidade, "flowx,cell 2 1,alignx right");
		
		fieldNaturalidade = new JTextField();
		painelDadosPessoais.add(fieldNaturalidade, "cell 3 1,growx");
		fieldNaturalidade.setColumns(10);
		
		JLabel labelSexo = new JLabel("Sexo");
		painelDadosPessoais.add(labelSexo, "cell 0 2,alignx left");
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		painelDadosPessoais.add(comboBoxSexo, "cell 1 2,growx");
		
		JLabel labelDataNascimento = new JLabel("Data de nascimento");
		painelDadosPessoais.add(labelDataNascimento, "cell 2 2,alignx right");
		
		fieldDataNascimento = new JTextField();
		painelDadosPessoais.add(fieldDataNascimento, "cell 3 2,growx");
		fieldDataNascimento.setColumns(10);
		
		JLabel labelEstadoCivil = new JLabel("Estado Civil");
		painelDadosPessoais.add(labelEstadoCivil, "cell 0 3,alignx trailing");
		
		JComboBox comboBoxEstadoCivil = new JComboBox();
		comboBoxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Uniao Estavel", "Casado", "Divorciado", "Viuvo"}));
		painelDadosPessoais.add(comboBoxEstadoCivil, "cell 1 3,growx");
		
		JLabel labelTelefone = new JLabel("Telefone");
		painelDadosPessoais.add(labelTelefone, "cell 2 3,alignx right");
		
		fieldTelefone = new JTextField();
		painelDadosPessoais.add(fieldTelefone, "cell 3 3,growx");
		fieldTelefone.setColumns(10);
		
		JLabel labelEndereco = new JLabel("Endere\u00E7o");
		painelDadosPessoais.add(labelEndereco, "cell 0 4,alignx left");
		
		fieldEndereco = new JTextField();
		painelDadosPessoais.add(fieldEndereco, "cell 1 4 3 1,growx");
		fieldEndereco.setColumns(10);
		
		JButton buttonSalvarDadosPessoais = new JButton("Salvar");
		buttonSalvarDadosPessoais.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		painelDadosPessoais.add(buttonSalvarDadosPessoais, "cell 0 5 4 1,alignx center");
		
		JPanel painelAnamnese = new JPanel();
		painelAnamnese.setBackground(new Color(144, 238, 144));
		tabbedPane.addTab("Anamnese", new ImageIcon(Prontuario.class.getResource("/figuras/conversa.png")), painelAnamnese, null);
		painelAnamnese.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelQueixaPrincipal = new JLabel("Queixa Principal");
		painelAnamnese.add(labelQueixaPrincipal, "cell 0 0");
		
		JScrollPane scrollPaneQueixaPrincipal = new JScrollPane();
		painelAnamnese.add(scrollPaneQueixaPrincipal, "cell 0 1 2 1,grow");
		
		JTextArea textAreaQP = new JTextArea();
		scrollPaneQueixaPrincipal.setViewportView(textAreaQP);
		
		JLabel labelHistoricoDoenca = new JLabel("Hist\u00F3rico da Doen\u00E7a Atual");
		painelAnamnese.add(labelHistoricoDoenca, "cell 0 2");
		
		JLabel labelHistoricoFamiliar = new JLabel("Hist\u00F3rico Familiar");
		painelAnamnese.add(labelHistoricoFamiliar, "cell 1 2");
		
		JScrollPane scrollPaneHistoricoDoenca = new JScrollPane();
		painelAnamnese.add(scrollPaneHistoricoDoenca, "cell 0 3,grow");
		
		JTextArea textAreaHDA = new JTextArea();
		scrollPaneHistoricoDoenca.setViewportView(textAreaHDA);
		
		JScrollPane scrollPaneHistoricoFamiliar = new JScrollPane();
		painelAnamnese.add(scrollPaneHistoricoFamiliar, "cell 1 3,grow");
		
		JTextArea textAreaHF = new JTextArea();
		scrollPaneHistoricoFamiliar.setViewportView(textAreaHF);
		
		JLabel labelAntecedentes = new JLabel("Antecedentes pessoais");
		painelAnamnese.add(labelAntecedentes, "cell 0 4");
		
		JLabel labelHabitos = new JLabel("H\u00E1bitos de vida");
		painelAnamnese.add(labelHabitos, "cell 1 4");
		
		JScrollPane scrollPaneAntecedentes = new JScrollPane();
		painelAnamnese.add(scrollPaneAntecedentes, "cell 0 5,grow");
		
		JTextArea textAreaAP = new JTextArea();
		scrollPaneAntecedentes.setViewportView(textAreaAP);
		
		JScrollPane scrollPaneHabitos = new JScrollPane();
		painelAnamnese.add(scrollPaneHabitos, "cell 1 5,grow");
		
		JTextArea textAreaHabitos = new JTextArea();
		scrollPaneHabitos.setViewportView(textAreaHabitos);
		
		JButton buttonSalvarAnamnese = new JButton("Salvar");
		buttonSalvarAnamnese.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		painelAnamnese.add(buttonSalvarAnamnese, "cell 0 6 2 1,alignx center");
		
		JPanel painelExames = new JPanel();
		painelExames.setBackground(new Color(255, 165, 0));
		tabbedPane.addTab("Exames", new ImageIcon(Prontuario.class.getResource("/figuras/test.png")), painelExames, null);
		painelExames.setLayout(new MigLayout("", "[][grow]", "[grow][grow][grow][grow][grow]"));
		
		JLabel labelTipoExame = new JLabel("Tipo de Exame");
		painelExames.add(labelTipoExame, "cell 0 0,alignx trailing");
		
		textFieldExame = new JTextField();
		painelExames.add(textFieldExame, "cell 1 0,growx");
		textFieldExame.setColumns(10);
		
		JLabel labelData = new JLabel("Data");
		painelExames.add(labelData, "cell 0 1,alignx left");
		
		textFieldData = new JTextField();
		painelExames.add(textFieldData, "cell 1 1,alignx left");
		textFieldData.setColumns(10);
		
		JLabel labelLaudo = new JLabel("Laudo");
		painelExames.add(labelLaudo, "cell 0 2");
		
		TextArea textAreaLaudo = new TextArea();
		painelExames.add(textAreaLaudo, "cell 1 2,growx");
		
		JButton buttonSalvarExames = new JButton("Salvar");
		buttonSalvarExames.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		painelExames.add(buttonSalvarExames, "cell 0 4 2 1,alignx center");
		
		JPanel painelTratamento = new JPanel();
		painelTratamento.setBackground(new Color(233, 150, 122));
		tabbedPane.addTab("Tratamento", new ImageIcon(Prontuario.class.getResource("/figuras/remedio.png")), painelTratamento, null);
		painelTratamento.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow][grow][grow]"));
		
		JLabel labelTratamentoTipo = new JLabel("Tipo de Tratamento");
		painelTratamento.add(labelTratamentoTipo, "cell 0 0");
		
		textFieldTratamentoTipo = new JTextField();
		painelTratamento.add(textFieldTratamentoTipo, "cell 0 1,growx");
		textFieldTratamentoTipo.setColumns(10);
		
		JLabel labelTratamentoDescricao = new JLabel("Descri\u00E7\u00E3o");
		painelTratamento.add(labelTratamentoDescricao, "cell 0 2");
		
		TextArea textAreaTratamentoDescricao = new TextArea();
		painelTratamento.add(textAreaTratamentoDescricao, "cell 0 3,growx");
		
		JButton buttonSalvarTratamento = new JButton("Salvar");
		buttonSalvarTratamento.setIcon(new ImageIcon(Prontuario.class.getResource("/figuras/ok1.png")));
		painelTratamento.add(buttonSalvarTratamento, "cell 0 5,alignx center");
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}
	
	

}
