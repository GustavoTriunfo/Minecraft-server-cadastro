import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.border.LineBorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.SwingConstants;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField FieldNome;
	private JTextField FieldCpf;
	private JTextField FieldTel;
	private JTextField FieldCidade;
	private JLabel txtCPF;
	private JLabel txtTel;
	private JLabel txtCidade;
	private JLabel txtUF;
	private JTextField FieldUf;
	private JLabel lblCadastrar;
	private JLabel txt_1;
	private JLabel fundoHard;
	private JLabel FrameLetras;
	private JLabel txtPesquisar;
	private JTextField FieldEmail;
	private JLabel txtEmail;

	private String Nome;
	private String CPF;
	private String Tel;
	private String Cidade;
	private String UF;
	private String Email;
	
	private JTextField FieldPesq;
	private JLabel lupaPesquisa;
	private JLabel arrowC;
	private JLabel PlacaBaixa;
	private JTextField FieldEditorNome;
	private JTextField FieldEditorTelefone;
	private JTextField FieldEditorCidade;
	private JTextField FieldEditorUF;
	private JTextField FieldEditorEmail;
	
	
	int escolha = 0;
	private JLabel txtResultadoNome;
	private JLabel txtResultadoCPF;
	private JLabel txtResultadoTelefone;
	private JLabel txtResultadoCidade;
	private JLabel txtResultadoUF;
	private JLabel txtResultadoEmail;
	private JLabel txtEscritoNome;
	private JLabel txtEscritoCpf;
	private JLabel txtEscritoTel;
	private JLabel txtEscritoCidade;
	private JLabel txtEscritoUf;
	private JLabel txtEscritoEmail;
	private JTextField FieldEditorCPF;
	

	public CadastroCliente() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		
		File fileAudio = new File("C418-Sweden-Minecraft-Volume-Alpha.wav");
		  AudioInputStream audioStream = AudioSystem.getAudioInputStream(fileAudio);
		  Clip clip = AudioSystem.getClip();
		  clip.open(audioStream);
		  clip.loop(-1);
		  
		JLabel DeleteBtn = new JLabel("");
		JLabel SalvarBtn = new JLabel("");
		SalvarBtn.setVisible(false);
		JLabel EditorButton = new JLabel("");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroCliente.class.getResource("/ImagesShop/cadastroIcone.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setBackground(new Color(0,0,0,0));
		
		JLabel xmark = new JLabel("");
		xmark.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				xmark.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/XEntered.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				xmark.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/X.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				xmark.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/XPressed.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				xmark.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/XEntered.png")));
			}
		});
		
		
		
		
		FieldPesq = new JTextField();
		FieldPesq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		FieldPesq.setForeground(new Color(255, 255, 255));
		FieldPesq.setBackground(new Color(149, 67, 23));
		FieldPesq.setVisible(false);
		
		lupaPesquisa = new JLabel("");
		lupaPesquisa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//String Retornado = "";
				
//					While? java.lang.NumberFormatException;
//					 try {
//						 if(Integer.parseInt(FieldPesq.getText()) == Integer.getInteger(FieldPesq.getText())) {
//							 
//					    }} catch (NumberFormatException NEx){
//					    	JOptionPane.showMessageDialog (null,"Digite somente números!");
//					    }
                    CadastroCliente.EfeitoSonoroBotao();
				
				if(FieldPesq.getText().equals("")) {
					 JOptionPane.showMessageDialog(null, "Você não preencheu o campo de pesquisa!","Erro!", JOptionPane.ERROR_MESSAGE);
					FieldPesq.setBorder(new LineBorder(new Color(255, 0, 0), 3));
					//txtResultadoBusca.setText("...");
					EditorButton.setVisible(false);
					escolha = 0;
					
					FieldEditorEmail.setVisible(false);
					FieldEditorUF.setVisible(false);
					FieldEditorCidade.setVisible(false);
					FieldEditorTelefone.setVisible(false);
					FieldEditorNome.setVisible(false);
					FieldEditorCPF.setVisible(false);
					
					FieldEditorCPF.setText("");
					FieldEditorEmail.setText("");
					FieldEditorUF.setText("");
					FieldEditorCidade.setText("");
					FieldEditorTelefone.setText("");
					FieldEditorNome.setText("");
					
					///////////////////////////////////////////////
					
					 txtResultadoNome.setText("");
					 txtResultadoCPF.setText("");
					 txtResultadoTelefone.setText("");
					 txtResultadoCidade.setText("");
					 txtResultadoUF.setText("");
					 txtResultadoEmail.setText("");
					
					EditorButton.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/EditBtn.png")));
					SalvarBtn.setVisible(false);
					DeleteBtn.setVisible(false);
					
					txtEscritoNome.setVisible(false);
					txtEscritoCpf.setVisible(false);
					txtEscritoTel.setVisible(false);
					txtEscritoCidade.setVisible(false);
					txtEscritoUf.setVisible(false);
					txtEscritoEmail.setVisible(false);
					
				}
				if(!FieldPesq.getText().equals("")){
				String stringSelecao = FieldPesq.getText();
				String Select = "SELECT Nome, CPF, Telefone, Cidade, UF, Email FROM BancoClientes WHERE [CPF] LIKE " + stringSelecao;
				
				try {
					ConnectionClass retornoSelect = new ConnectionClass();
					retornoSelect.SelectMethod(Select);
					// Retornado = retornoSelect.retorno;
					 
					 List<String> CamposRetornados = new ArrayList<>();
					 CamposRetornados = retornoSelect.RetornarLista;
					 
					 
					 txtResultadoNome.setText(retornoSelect.nome);
					 txtResultadoCPF.setText(retornoSelect.cpf);
					 txtResultadoTelefone.setText(retornoSelect.telefone);
					 txtResultadoCidade.setText(retornoSelect.cidade);
					 txtResultadoUF.setText(retornoSelect.uf);
					 txtResultadoEmail.setText(retornoSelect.email);
				
					 FieldEditorNome.setText(retornoSelect.nome);
					 FieldEditorCPF.setText(retornoSelect.cpf);
					 FieldEditorTelefone.setText(retornoSelect.telefone);
					 FieldEditorCidade.setText(retornoSelect.cidade);
					 FieldEditorUF.setText(retornoSelect.uf);
					 FieldEditorEmail.setText(retornoSelect.email);
					 
//					 for (String i : CamposRetornados) {
//						
//				            // Print all elements of ArrayList
//				            System.out.println(i);
//					 }
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				FieldPesq.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				
			//	txtResultadoBusca.setText(Retornado);
				EditorButton.setVisible(true);
				
				txtEscritoNome.setVisible(true);
				txtEscritoCpf.setVisible(true);
				txtEscritoTel.setVisible(true);
				txtEscritoCidade.setVisible(true);
				txtEscritoUf.setVisible(true);
				txtEscritoEmail.setVisible(true);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lupaPesquisa.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/lupaEntered.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lupaPesquisa.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/lupa (1).png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lupaPesquisa.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/lupaPressionada.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lupaPesquisa.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/lupaEntered.png")));
			}
		});
		lupaPesquisa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lupaPesquisa.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/lupa (1).png")));
		lupaPesquisa.setVisible(false);
		
		JLabel arrowB = new JLabel("");
		JLabel placa = new JLabel("");
		
		arrowC = new JLabel("");
		arrowC.setVisible(false);
		arrowC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				arrowB.setVisible(true);
				FieldPesq.setVisible(false);
				placa.setVisible(false);
				lupaPesquisa.setVisible(false);
				arrowC.setVisible(false);
			}
		});
		
		
		arrowB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				arrowB.setVisible(false);
				FieldPesq.setVisible(true);
				placa.setVisible(true);
				lupaPesquisa.setVisible(true);
				arrowC.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtPesquisar.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtPesquisar.setForeground(new Color(0, 0, 0));
			}
		});
		
		FieldEditorEmail = new JTextField();
		FieldEditorEmail.setVisible(false);
		
		
		SalvarBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastroCliente.EfeitoSonoroBotao();
				ConnectionClass conexao = new ConnectionClass();
				
				String nome = FieldEditorNome.getText();
				String cpf1 = FieldEditorCPF.getText();
				String cpf2 = txtResultadoCPF.getText();
				String tel = FieldEditorTelefone.getText();
				String cidade = FieldEditorCidade.getText();
				String uf = FieldEditorUF.getText();
				String email = FieldEditorEmail.getText();
				
				String Atualizando = "UPDATE [dbo].[BancoClientes] SET [Nome] = '" + nome + "',[CPF] = '"+ cpf1 + "',[Telefone] = '" + tel + "' ,[Cidade] = '"+ cidade + "', [UF] = '" + uf + "',[Email] = '" + email + "' WHERE [CPF] LIKE '" + cpf2 + "'";
				try {
					ConnectionClass.CUpdate(Atualizando);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog (null,"O usuário foi Atualizado!");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				SalvarBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/SalvarBotaoEntered.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SalvarBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/SalvarBotao.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				SalvarBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/SalvarBotaoClick.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				SalvarBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/SalvarBotaoEntered.png")));
			}
		});
		
		
		DeleteBtn.setVisible(false);
		DeleteBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DeleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastroCliente.EfeitoSonoroBotao();
				ConnectionClass conexao = new ConnectionClass();
				String cpf = FieldEditorCPF.getText();
				String Deletando = "DELETE FROM [dbo].[BancoClientes] WHERE [CPF] LIKE '" + cpf + "'";
				try {
					ConnectionClass.CDelete(Deletando);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog (null,"O usuário foi Deletado!");
				
				FieldEditorEmail.setVisible(false);
				FieldEditorUF.setVisible(false);
				FieldEditorCidade.setVisible(false);
				FieldEditorTelefone.setVisible(false);
				FieldEditorNome.setVisible(false);
				FieldEditorCPF.setVisible(false);
				
				FieldEditorCPF.setText("");
				FieldEditorEmail.setText("");
				FieldEditorUF.setText("");
				FieldEditorCidade.setText("");
				FieldEditorTelefone.setText("");
				FieldEditorNome.setText("");
				
				FieldPesq.setText("");
				
				///////////////////////////////////////////////
				
				 txtResultadoNome.setText("");
				 txtResultadoCPF.setText("");
				 txtResultadoTelefone.setText("");
				 txtResultadoCidade.setText("");
				 txtResultadoUF.setText("");
				 txtResultadoEmail.setText("");
				
				EditorButton.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/EditBtn.png")));
				SalvarBtn.setVisible(false);
				DeleteBtn.setVisible(false);
				EditorButton.setVisible(false);
				
				txtEscritoNome.setVisible(false);
				txtEscritoCpf.setVisible(false);
				txtEscritoTel.setVisible(false);
				txtEscritoCidade.setVisible(false);
				txtEscritoUf.setVisible(false);
				txtEscritoEmail.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				DeleteBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/DeleteBtnEntered.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				DeleteBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/DeleteBtn.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				DeleteBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/DeleteBtnPressed.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				DeleteBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/DeleteBtnEntered.png")));
			}
		});
		
		txtEscritoEmail = new JLabel("Email:");
		txtEscritoEmail.setVisible(false);
		txtEscritoEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscritoEmail.setForeground(Color.BLACK);
		txtEscritoEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEscritoEmail.setBounds(620, 367, 93, 29);
		contentPane.add(txtEscritoEmail);
		
		txtEscritoUf = new JLabel("UF:");
		txtEscritoUf.setVisible(false);
		txtEscritoUf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscritoUf.setForeground(Color.BLACK);
		txtEscritoUf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEscritoUf.setBounds(426, 367, 93, 29);
		contentPane.add(txtEscritoUf);
		
		txtEscritoCidade = new JLabel("Cidade:");
		txtEscritoCidade.setVisible(false);
		txtEscritoCidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscritoCidade.setForeground(Color.BLACK);
		txtEscritoCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEscritoCidade.setBounds(670, 316, 80, 29);
		contentPane.add(txtEscritoCidade);
		
		txtEscritoTel = new JLabel("Telefone:");
		txtEscritoTel.setVisible(false);
		txtEscritoTel.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscritoTel.setForeground(Color.BLACK);
		txtEscritoTel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEscritoTel.setBounds(567, 316, 93, 29);
		contentPane.add(txtEscritoTel);
		
		txtEscritoCpf = new JLabel("CPF:");
		txtEscritoCpf.setVisible(false);
		txtEscritoCpf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscritoCpf.setForeground(Color.BLACK);
		txtEscritoCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEscritoCpf.setBounds(470, 316, 88, 29);
		contentPane.add(txtEscritoCpf);
		
		txtEscritoNome = new JLabel("Nome:");
		txtEscritoNome.setVisible(false);
		txtEscritoNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscritoNome.setForeground(Color.BLACK);
		txtEscritoNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEscritoNome.setBounds(373, 316, 88, 29);
		contentPane.add(txtEscritoNome);
		DeleteBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/DeleteBtn.png")));
		DeleteBtn.setBounds(708, 471, 59, 56);
		contentPane.add(DeleteBtn);
		
		txtResultadoEmail = new JLabel("");
		txtResultadoEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoEmail.setForeground(Color.BLACK);
		txtResultadoEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResultadoEmail.setBounds(620, 392, 93, 29);
		contentPane.add(txtResultadoEmail);
		
		txtResultadoUF = new JLabel("");
		txtResultadoUF.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoUF.setForeground(Color.BLACK);
		txtResultadoUF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResultadoUF.setBounds(426, 392, 93, 29);
		contentPane.add(txtResultadoUF);
		
		txtResultadoCidade = new JLabel("");
		txtResultadoCidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoCidade.setForeground(Color.BLACK);
		txtResultadoCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResultadoCidade.setBounds(670, 342, 80, 29);
		contentPane.add(txtResultadoCidade);
		
		txtResultadoTelefone = new JLabel("");
		txtResultadoTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoTelefone.setForeground(Color.BLACK);
		txtResultadoTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResultadoTelefone.setBounds(567, 342, 93, 29);
		contentPane.add(txtResultadoTelefone);
		
		txtResultadoCPF = new JLabel("");
		txtResultadoCPF.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoCPF.setForeground(Color.BLACK);
		txtResultadoCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResultadoCPF.setBounds(470, 342, 88, 29);
		contentPane.add(txtResultadoCPF);
		
		txtResultadoNome = new JLabel("");
		txtResultadoNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoNome.setForeground(Color.BLACK);
		txtResultadoNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResultadoNome.setBounds(373, 342, 88, 29);
		contentPane.add(txtResultadoNome);
		SalvarBtn.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/SalvarBotao.png")));
		SalvarBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SalvarBtn.setBounds(634, 471, 59, 56);
		contentPane.add(SalvarBtn);
		
		FieldEditorCPF = new JTextField();
		FieldEditorCPF.setVisible(false);
		FieldEditorCPF.setOpaque(false);
		FieldEditorCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FieldEditorCPF.setColumns(10);
		FieldEditorCPF.setBorder(new LineBorder(new Color(0, 0, 0)));
		FieldEditorCPF.setBounds(529, 478, 67, 29);
		contentPane.add(FieldEditorCPF);
		FieldEditorEmail.setOpaque(false);
		FieldEditorEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FieldEditorEmail.setColumns(10);
		FieldEditorEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		FieldEditorEmail.setBounds(683, 444, 67, 29);
		contentPane.add(FieldEditorEmail);
		
		FieldEditorUF = new JTextField();
		FieldEditorUF.setVisible(false);
		FieldEditorUF.setOpaque(false);
		FieldEditorUF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FieldEditorUF.setColumns(10);
		FieldEditorUF.setBorder(new LineBorder(new Color(0, 0, 0)));
		FieldEditorUF.setBounds(606, 444, 67, 29);
		contentPane.add(FieldEditorUF);
		
		FieldEditorCidade = new JTextField();
		FieldEditorCidade.setVisible(false);
		FieldEditorCidade.setOpaque(false);
		FieldEditorCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FieldEditorCidade.setColumns(10);
		FieldEditorCidade.setBorder(new LineBorder(new Color(0, 0, 0)));
		FieldEditorCidade.setBounds(529, 444, 67, 29);
		contentPane.add(FieldEditorCidade);
		
		FieldEditorTelefone = new JTextField();
		FieldEditorTelefone.setVisible(false);
		FieldEditorTelefone.setOpaque(false);
		FieldEditorTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FieldEditorTelefone.setColumns(10);
		FieldEditorTelefone.setBorder(new LineBorder(new Color(0, 0, 0)));
		FieldEditorTelefone.setBounds(452, 444, 67, 29);
		contentPane.add(FieldEditorTelefone);
		
		
		EditorButton.setVisible(false);
		EditorButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastroCliente.EfeitoSonoroBotao();
				if(escolha == 0) {
				FieldEditorEmail.setVisible(true);
				FieldEditorUF.setVisible(true);
				FieldEditorCidade.setVisible(true);
				FieldEditorTelefone.setVisible(true);
				FieldEditorNome.setVisible(true);
				FieldEditorCPF.setVisible(true);
				escolha++;
				EditorButton.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/EditBtnAzul.png")));
				SalvarBtn.setVisible(true);
				DeleteBtn.setVisible(true);
				
				}
				
				else if (escolha == 1) {
					FieldEditorEmail.setVisible(false);
					FieldEditorUF.setVisible(false);
					FieldEditorCidade.setVisible(false);
					FieldEditorTelefone.setVisible(false);
					FieldEditorNome.setVisible(false);
					FieldEditorCPF.setVisible(false);
					escolha--;
					EditorButton.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/EditBtn.png")));
					SalvarBtn.setVisible(false);
					DeleteBtn.setVisible(false);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(escolha != 1) {
					EditorButton.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/EditBtnEntered.png")));
					}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(escolha != 1) {
				EditorButton.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/EditBtn.png")));
				}
			}
		});
		EditorButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		EditorButton.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/EditBtn.png")));
		EditorButton.setBounds(356, 471, 55, 56);
		contentPane.add(EditorButton);
		
		FieldEditorNome = new JTextField();
		FieldEditorNome.setVisible(false);
		FieldEditorNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		FieldEditorNome.setOpaque(false);
		FieldEditorNome.setColumns(10);
		FieldEditorNome.setBorder(new LineBorder(new Color(0, 0, 0)));
		FieldEditorNome.setBounds(375, 444, 67, 29);
		contentPane.add(FieldEditorNome);
		arrowB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		arrowB.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/arrowBaixo (1).png")));
		arrowB.setBounds(561, 46, 47, 46);
		contentPane.add(arrowB);
		arrowC.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/arrowCima (1).png")));
	
		arrowC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		arrowC.setBounds(561, 253, 47, 46);
		contentPane.add(arrowC);
		
		PlacaBaixa = new JLabel("");
		PlacaBaixa.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/placaNovaP (1).png")));
		PlacaBaixa.setBounds(320, 292, 477, 232);
		contentPane.add(PlacaBaixa);
		lupaPesquisa.setBounds(703, 183, 47, 46);
		contentPane.add(lupaPesquisa);
		FieldPesq.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		FieldPesq.setColumns(10);
		FieldPesq.setBounds(543, 197, 150, 29);
		contentPane.add(FieldPesq);
		
		placa.setVisible(false);
		placa.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/sign correct.png")));
		placa.setBounds(517, 46, 250, 216);
		contentPane.add(placa);
		
		txtEmail = new JLabel("Email:");
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txtEmail.setBounds(21, 331, 118, 29);
		contentPane.add(txtEmail);
		
		FieldEmail = new JTextField();
		FieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FieldEmail.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		FieldEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtEmail.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtEmail.setForeground(new Color(0, 0, 0));
			}
		});
		FieldEmail.setColumns(10);
		FieldEmail.setBounds(181, 331, 129, 29);
		contentPane.add(FieldEmail);
		
		txtPesquisar = new JLabel("Pesquisar:");
		txtPesquisar.setForeground(Color.BLACK);
		txtPesquisar.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txtPesquisar.setBounds(384, 69, 174, 29);
		contentPane.add(txtPesquisar);
		
		txt_1 = new JLabel("");
		txt_1.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/logoHard (1).png")));
		txt_1.setForeground(Color.BLACK);
		txt_1.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txt_1.setBounds(10, 10, 375, 99);
		contentPane.add(txt_1);
		
		FieldUf = new JTextField();
		FieldUf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FieldUf.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		FieldUf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtUF.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtUF.setForeground(new Color(0, 0, 0));
			}
		});
		FieldUf.setColumns(10);
		FieldUf.setBounds(181, 292, 53, 29);
		contentPane.add(FieldUf);
		
		txtUF = new JLabel("UF:");
		txtUF.setForeground(Color.BLACK);
		txtUF.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txtUF.setBounds(21, 292, 60, 29);
		contentPane.add(txtUF);
		
		txtCidade = new JLabel("Cidade:");
		txtCidade.setForeground(Color.BLACK);
		txtCidade.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txtCidade.setBounds(21, 253, 118, 29);
		contentPane.add(txtCidade);
		
		txtTel = new JLabel("Telefone:");
		txtTel.setForeground(Color.BLACK);
		txtTel.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txtTel.setBounds(0, 219, 150, 29);
		contentPane.add(txtTel);
		
		txtCPF = new JLabel("CPF:");
		txtCPF.setForeground(Color.BLACK);
		txtCPF.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txtCPF.setBounds(21, 180, 108, 29);
		contentPane.add(txtCPF);
		
		JLabel txtNome = new JLabel("Nome:");
		txtNome.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 21));
		txtNome.setForeground(new Color(0, 0, 0));
		txtNome.setBounds(21, 141, 108, 29);
		contentPane.add(txtNome);
		
		FieldCidade = new JTextField();
		FieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FieldCidade.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		FieldCidade.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtCidade.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtCidade.setForeground(new Color(0, 0, 0));
			}
		});
		FieldCidade.setColumns(10);
		FieldCidade.setBounds(181, 253, 129, 29);
		contentPane.add(FieldCidade);
		
		FieldTel = new JTextField();
		FieldTel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FieldTel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		FieldTel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtTel.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtTel.setForeground(new Color(0, 0, 0));
			}
		});
		FieldTel.setColumns(10);
		FieldTel.setBounds(181, 219, 129, 29);
		contentPane.add(FieldTel);
		
		FieldCpf = new JTextField();
		FieldCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FieldCpf.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		FieldCpf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtCPF.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtCPF.setForeground(new Color(0, 0, 0));
			}
		});
		FieldCpf.setColumns(10);
		FieldCpf.setBounds(179, 180, 129, 29);
		contentPane.add(FieldCpf);
		xmark.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/X.png")));
		xmark.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		xmark.setBounds(751, 27, 60, 55);
		contentPane.add(xmark);
		
		FieldNome = new JTextField();
		FieldNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FieldNome.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		FieldNome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtNome.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtNome.setForeground(new Color(0, 0, 0));
			}
		});
		FieldNome.setBounds(179, 141, 129, 29);
		contentPane.add(FieldNome);
		FieldNome.setColumns(10);
		
		FrameLetras = new JLabel("");
		FrameLetras.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/FrameP.png")));
		FrameLetras.setBounds(-99, 102, 288, 294);
		contentPane.add(FrameLetras);
		
		fundoHard = new JLabel("");
		fundoHard.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/hardcorefundo.png")));
		fundoHard.setBounds(-65, 38, 234, 486);
		contentPane.add(fundoHard);
		
		JButton btnCadastrar = new JButton("");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                CadastroCliente.EfeitoSonoroBotao();
				if(FieldNome.getText().equals("") || FieldCpf.getText().equals("") || FieldTel.getText().equals("") ||
						FieldCidade.getText().equals("") || FieldUf.getText().equals("") || FieldEmail.getText().equals("")) {
//					|| FieldCpf == null || FieldTel == null || 
//							FieldCidade.equals(null) || FieldCidade.equals(null) || FieldEmail.equals(null)
					JOptionPane.showMessageDialog(null, "Você não preencheu algum dos campos! Todos são obrigatórios!","Erro!", JOptionPane.ERROR_MESSAGE);
					
					if(FieldNome.getText().equals("")){
						FieldNome.setBorder(new LineBorder(new Color(255, 0, 0), 3));
					}
				  if(FieldCpf.getText().equals("")) {
					 FieldCpf.setBorder(new LineBorder(new Color(255, 0, 0), 3));
				} if(FieldTel.getText().equals("")) {
					FieldTel.setBorder(new LineBorder(new Color(255, 0, 0), 3));
				} if(FieldCidade.getText().equals("")) {
					FieldCidade.setBorder(new LineBorder(new Color(255, 0, 0), 3));
				} if(FieldUf.getText().equals("")) {
					FieldUf.setBorder(new LineBorder(new Color(255, 0, 0), 3));
				} if(FieldEmail.getText().equals("")) {
					FieldEmail.setBorder(new LineBorder(new Color(255, 0, 0), 3));
				}
					
				}

					

				 if(!FieldNome.getText().equals("") && !FieldCpf.getText().equals("") && !FieldTel.getText().equals("") && 
						!FieldCidade.getText().equals("") && !FieldUf.getText().equals("") && !FieldEmail.getText().equals("")) {
					 
				Nome = FieldNome.getText();
				CPF = FieldCpf.getText();
				Tel = FieldTel.getText();
				Cidade = FieldCidade.getText();
				UF = FieldUf.getText();
				Email = FieldEmail.getText();
				
				String Insert = "INSERT INTO [dbo].[BancoClientes] ([Nome],[CPF],[Telefone],[Cidade],[UF],[Email]) VALUES('" + 
				Nome + "','" + CPF + "','" + Tel + "','" + Cidade + "','" + UF + "','" + Email + "')";
				
				try {
					ConnectionClass.CInsert(Insert);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				//Borda Preta
				FieldNome.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				FieldCpf.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				FieldTel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				FieldCidade.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				FieldUf.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				FieldEmail.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				
				
				FieldNome.setText("");
				FieldCpf.setText("");
				FieldTel.setText("");
				FieldCidade.setText("");
				FieldUf.setText("");
				FieldEmail.setText("");
				
				JOptionPane.showMessageDialog (null,"O Cadastro foi efetuado com Sucesso!");
				
				}
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnCadastrar.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/buttonBlue.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnCadastrar.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/button (1).png")));
			}
		});
		
		lblCadastrar = new JLabel("CADASTRAR");
		lblCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCadastrar.setForeground(Color.BLACK);
		lblCadastrar.setFont(new Font("PKMN RBYGSC", Font.PLAIN, 9));
		lblCadastrar.setBounds(191, 392, 88, 21);
		contentPane.add(lblCadastrar);
		btnCadastrar.setBorder(null);
		btnCadastrar.setOpaque(false);
		btnCadastrar.setBackground(new Color(0, 0, 0));
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/button (1).png")));
		btnCadastrar.setBounds(181, 384, 108, 35);
		contentPane.add(btnCadastrar);
		
		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(CadastroCliente.class.getResource("/ImagesShop/wood1.jpg")));
		Fundo.setBounds(10, 48, 787, 476);
		contentPane.add(Fundo);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public static void EfeitoSonoroBotao() {
		 try {
			  File file = new File("Minecraft-Button-Sound-Effects.wav");
			  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			  Clip clipEfeito = AudioSystem.getClip();
			  clipEfeito.open(audioStream);
			  clipEfeito.start();
			  clipEfeito.setMicrosecondPosition(0);
			  }catch (UnsupportedAudioFileException ex){
                  ex.printStackTrace();                 
			  }catch (IOException ez) {
				  ez.printStackTrace();
			  }catch (LineUnavailableException ea){
                  ea.printStackTrace();       
		}
	}
}
