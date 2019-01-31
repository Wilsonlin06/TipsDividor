import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class tipsdividor {

	private JFrame frame;
	private JTextField ttl_tips;
	private JTextField psn_sls_1;
	private JTextField psn_sls_2;
	private JTextField psn_sls_3;
	private JTextField psn_sls_4;
	private JTextField psn_sls_5;
	private JTextField psn_sls_6;
	private JTextField cal_tips_1;
	private JTextField cal_tips_2;
	private JTextField cal_tips_3;
	private JTextField cal_tips_4;
	private JTextField cal_tips_5;
	private JTextField cal_tips_6;
	final DecimalFormat df= new DecimalFormat("###.00");
	private int ttltps;
	private int count = 2;
	private double rate;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tipsdividor window = new tipsdividor();
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
	public tipsdividor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(tipsdividor.class.getResource("/about_files/Logo-Gray.png")));
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblTipDividor = new JLabel("Tips Dividor");
		lblTipDividor.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblTipDividor.setBounds(170, 13, 123, 50);
		frame.getContentPane().add(lblTipDividor);
		
		JLabel lblTotalTips = new JLabel("Total Tips:");
		lblTotalTips.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalTips.setBounds(46, 64, 77, 16);
		frame.getContentPane().add(lblTotalTips);
		
		JLabel lblHowManyPeople = new JLabel("How many people?");
		lblHowManyPeople.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHowManyPeople.setBounds(170, 64, 136, 16);
		frame.getContentPane().add(lblHowManyPeople);
		
		
		
		String[] ppl = {"2","3","4","5","6"};
		final JComboBox list=new JComboBox(ppl);
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String select = list.getSelectedItem().toString();
				switch(select){
					case "2":
						set_dsb(psn_sls_3,cal_tips_3);
						set_dsb(psn_sls_4,cal_tips_4);
						set_dsb(psn_sls_5,cal_tips_5);
						set_dsb(psn_sls_6,cal_tips_6);
						count = 2;
						cal_tps(count);
						break;
					case "3":
						set_enb(psn_sls_3,cal_tips_3);
						set_dsb(psn_sls_4,cal_tips_4);
						set_dsb(psn_sls_5,cal_tips_5);
						set_dsb(psn_sls_6,cal_tips_6);
						count = 3;
//						cal_tps(count);
						break;
					case "4":
						set_enb(psn_sls_3,cal_tips_3);
						set_enb(psn_sls_4,cal_tips_4);
						set_dsb(psn_sls_5,cal_tips_5);
						set_dsb(psn_sls_6,cal_tips_6);
						count = 4;
//						cal_tps(count);
						break;
					case "5":
						set_enb(psn_sls_3,cal_tips_3);
						set_enb(psn_sls_4,cal_tips_4);
						set_enb(psn_sls_5,cal_tips_5);
						set_dsb(psn_sls_6,cal_tips_6);
						count = 5;
//						cal_tps(count);
						break;
					case "6":
						set_enb(psn_sls_3,cal_tips_3);
						set_enb(psn_sls_4,cal_tips_4);
						set_enb(psn_sls_5,cal_tips_5);
						set_enb(psn_sls_6,cal_tips_6);
						count = 6;
//						cal_tps(count);
						break;
					default:
						set_dsb(psn_sls_3,cal_tips_3);
						set_dsb(psn_sls_4,cal_tips_4);
						set_dsb(psn_sls_5,cal_tips_5);
						set_dsb(psn_sls_6,cal_tips_6);
						count = 2;
						cal_tps(count);
						break;	
				}
			}
		});
		list.setEditable(true);
		list.setBounds(171, 93, 135, 22);
		frame.getContentPane().add(list);
		
		ttl_tips = new JTextField();
		ttl_tips.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
					ttltps = Integer.parseInt(ttl_tips.getText());
					cal_tps(count);
				}catch(Exception e){
					ttl_tips.setText("");
					cal_tips_1.setText("");
					cal_tips_2.setText("");
				}
			}
		});
		ttl_tips.setBounds(25, 93, 116, 22);
		frame.getContentPane().add(ttl_tips);
		ttl_tips.setColumns(10);
		
		JLabel lblTotalSales = new JLabel("Personal Sales:");
		lblTotalSales.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalSales.setBounds(146, 129, 121, 16);
		frame.getContentPane().add(lblTotalSales);
		
		JLabel lb1stPsn = new JLabel("1st Person:");
		lb1stPsn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb1stPsn.setBounds(25, 161, 90, 16);
		frame.getContentPane().add(lb1stPsn);
		
		psn_sls_1 = new JTextField();
		psn_sls_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				cal_tps(count);
			}
		});
		psn_sls_1.setBounds(133, 158, 135, 22);
		frame.getContentPane().add(psn_sls_1);
		psn_sls_1.setColumns(10);
		
		JLabel lb2ndPsn = new JLabel("2nd Person:");
		lb2ndPsn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb2ndPsn.setBounds(25, 196, 90, 16);
		frame.getContentPane().add(lb2ndPsn);
		
		psn_sls_2 = new JTextField();
		psn_sls_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				cal_tps(count);
			}
		});
		psn_sls_2.setBounds(132, 193, 136, 22);
		frame.getContentPane().add(psn_sls_2);
		psn_sls_2.setColumns(10);
		
		JLabel lb3rdPsn = new JLabel("3rd Person:");
		lb3rdPsn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb3rdPsn.setBounds(25, 231, 90, 16);
		frame.getContentPane().add(lb3rdPsn);
		
		psn_sls_3 = new JTextField();
		psn_sls_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				cal_tps(count);
			}
		});
		psn_sls_3.setEnabled(false);
		psn_sls_3.setBounds(132, 228, 136, 22);
		frame.getContentPane().add(psn_sls_3);
		psn_sls_3.setColumns(10);
		
		JLabel lb4thPsn = new JLabel("4th Person:");
		lb4thPsn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb4thPsn.setBounds(25, 266, 90, 16);
		frame.getContentPane().add(lb4thPsn);
		
		psn_sls_4 = new JTextField();
		psn_sls_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				cal_tps(count);
			}
		});
		psn_sls_4.setEnabled(false);
		psn_sls_4.setBounds(132, 263, 136, 22);
		frame.getContentPane().add(psn_sls_4);
		psn_sls_4.setColumns(10);
		
		JLabel lb5thPsn = new JLabel("5th Person:");
		lb5thPsn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb5thPsn.setBounds(25, 301, 90, 16);
		frame.getContentPane().add(lb5thPsn);
		
		psn_sls_5 = new JTextField();
		psn_sls_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				cal_tps(count);
			}
		});
		psn_sls_5.setEnabled(false);
		psn_sls_5.setBounds(132, 298, 136, 22);
		frame.getContentPane().add(psn_sls_5);
		psn_sls_5.setColumns(10);
		
		JLabel lb6thPsn = new JLabel("6th Person:");
		lb6thPsn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb6thPsn.setBounds(25, 336, 90, 16);
		frame.getContentPane().add(lb6thPsn);
		
		psn_sls_6 = new JTextField();
		psn_sls_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				cal_tps(count);
			}
		});
		psn_sls_6.setEnabled(false);
		psn_sls_6.setBounds(132, 333, 136, 22);
		frame.getContentPane().add(psn_sls_6);
		psn_sls_6.setColumns(10);
		
		cal_tips_1 = new JTextField();
		cal_tips_1.setEditable(false);
		cal_tips_1.setBounds(283, 159, 116, 22);
		frame.getContentPane().add(cal_tips_1);
		cal_tips_1.setColumns(10);
		
		cal_tips_2 = new JTextField();
		cal_tips_2.setEditable(false);
		cal_tips_2.setBounds(283, 192, 116, 22);
		frame.getContentPane().add(cal_tips_2);
		cal_tips_2.setColumns(10);
		
		cal_tips_3 = new JTextField();
		cal_tips_3.setEnabled(false);
		cal_tips_3.setEditable(false);
		cal_tips_3.setBounds(283, 228, 116, 22);
		frame.getContentPane().add(cal_tips_3);
		cal_tips_3.setColumns(10);
		
		cal_tips_4 = new JTextField();
		cal_tips_4.setEnabled(false);
		cal_tips_4.setEditable(false);
		cal_tips_4.setBounds(283, 263, 116, 22);
		frame.getContentPane().add(cal_tips_4);
		cal_tips_4.setColumns(10);
		
		cal_tips_5 = new JTextField();
		cal_tips_5.setEnabled(false);
		cal_tips_5.setEditable(false);
		cal_tips_5.setBounds(283, 298, 116, 22);
		frame.getContentPane().add(cal_tips_5);
		cal_tips_5.setColumns(10);
		
		cal_tips_6 = new JTextField();
		cal_tips_6.setEnabled(false);
		cal_tips_6.setEditable(false);
		cal_tips_6.setBounds(283, 333, 116, 22);
		frame.getContentPane().add(cal_tips_6);
		cal_tips_6.setColumns(10);
		
		JLabel lblTips = new JLabel("Tips:");
		lblTips.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTips.setBounds(319, 129, 56, 16);
		frame.getContentPane().add(lblTips);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(173, 255, 47));
		btnReset.setBackground(new Color(138, 43, 226));
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				ttltps = 0;
				list.setSelectedIndex(0);
				set_dsb(psn_sls_3,cal_tips_3);
				set_dsb(psn_sls_4,cal_tips_4);
				set_dsb(psn_sls_5,cal_tips_5);
				set_dsb(psn_sls_6,cal_tips_6);
				ttl_tips.setText("");
				cal_tips_1.setText("");
				cal_tips_2.setText("");
				cal_tips_3.setText("");
				cal_tips_4.setText("");
				cal_tips_5.setText("");
				cal_tips_6.setText("");
				psn_sls_1.setText("");
				psn_sls_2.setText("");
				psn_sls_3.setText("");
				psn_sls_4.setText("");
				psn_sls_5.setText("");
				psn_sls_6.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(152, 368, 97, 25);
		frame.getContentPane().add(btnReset);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(tipsdividor.class.getResource("/about_files/Icon.png")));
		label.setBounds(317, 32, 115, 94);
		frame.getContentPane().add(label);
	}
	public void set_enb(JTextField a, JTextField b){
		a.enable();
		b.enable();
	}
	public void set_dsb(JTextField a, JTextField b){
		a.disable();
		b.disable();
		a.setText("");
		b.setText("");
	}
	public void cal_tps(int c){
		double ttlsls;
		switch(c){
		case 2:
			try{
				if(psn_sls_1.getText() == null || psn_sls_1.getText().compareTo("") == 0){
					cal_tips_1.setText("");
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0){
							ttlsls = 0.0;
							cal_tips_2.setText("");
						}
						else
							ttlsls = Double.parseDouble(psn_sls_2.getText());
					}catch(Exception e){
						ttlsls = 0.0;
						cal_tips_2.setText("");
					}
				}else{
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0){
							ttlsls = Double.parseDouble(psn_sls_1.getText());
							cal_tips_2.setText("");
						}
						else
							ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText());
					}catch(Exception e){
						ttlsls = Double.parseDouble(psn_sls_1.getText());
						cal_tips_2.setText("");
					}
				}
			}catch(Exception e){
				try{
					if(psn_sls_2.getText() != null || psn_sls_2.getText().compareTo("") != 0){
						ttlsls = Double.parseDouble(psn_sls_2.getText());
					}
					else
						ttlsls = 0.0;
				}catch(Exception f){
					ttlsls = 0.0;
					cal_tips_1.setText("");
					cal_tips_2.setText("");
				}
			}
			break;
		case 3:
			try{
				if(psn_sls_1.getText() == null || psn_sls_1.getText().compareTo("") == 0){
					cal_tips_1.setText("");
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0) {
							cal_tips_2.setText("");
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									ttlsls = 0.0;
									cal_tips_3.setText("");
								}
								else
									ttlsls = Double.parseDouble(psn_sls_3.getText());
							}catch(Exception e){
								ttlsls = 0.0;
								cal_tips_3.setText("");
							}
						}
						else
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
									ttlsls = Double.parseDouble(psn_sls_2.getText());
								}
								else
									ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_2.getText());
								cal_tips_3.setText("");
							}
					}catch(Exception e){
						try{
							if(psn_sls_3.getText() != null && psn_sls_3.getText().compareTo("") != 0) ttlsls = Double.parseDouble(psn_sls_3.getText());
							else ttlsls = 0.0;
						}catch(Exception f){
							ttlsls = 0.0;
						}
						cal_tips_2.setText("");
					}
				}else{
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0){
							cal_tips_2.setText("");
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									ttlsls = Double.parseDouble(psn_sls_1.getText());
									cal_tips_3.setText("");
								}
								else
									ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_3.getText());
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_1.getText());
								cal_tips_3.setText("");
							}
						}
						else{
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText());
									cal_tips_3.setText("");
								}
								else{
									ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
								}
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText());
								cal_tips_3.setText("");
							}
						}
					}catch(Exception e){
						try{
							if(psn_sls_3.getText() != null && psn_sls_3.getText().compareTo("") != 0) ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_3.getText());
							else ttlsls = Double.parseDouble(psn_sls_1.getText());
						}catch(Exception f){
							ttlsls = Double.parseDouble(psn_sls_1.getText());
						}
						cal_tips_2.setText("");
						
					}
				}
			}catch(Exception e){
				try{
					if(psn_sls_2.getText() != null && psn_sls_2.getText().compareTo("") != 0){
						try{
							if(psn_sls_3.getText() != null && psn_sls_3.getText().compareTo("") != 0){
								ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
							}else ttlsls = Double.parseDouble(psn_sls_2.getText());
						}catch(Exception f){
							ttlsls = Double.parseDouble(psn_sls_2.getText());
						}
					}else{
						try{
							if(psn_sls_3.getText() != null && psn_sls_3.getText().compareTo("") != 0){
								ttlsls = Double.parseDouble(psn_sls_3.getText());
							}else ttlsls = 0.0;
						}catch(Exception f){
							try{
								if(psn_sls_3.getText() != null && psn_sls_3.getText().compareTo("") != 0){
									ttlsls = Double.parseDouble(psn_sls_3.getText());
								}else ttlsls = 0.0;
							}catch(Exception g){
								ttlsls = 0.0;
							}
						}
						cal_tips_2.setText("");
					}
				}catch(Exception f){
					try{
						if(psn_sls_3.getText() != null && psn_sls_3.getText().compareTo("") != 0){
							ttlsls = Double.parseDouble(psn_sls_3.getText());
						}else ttlsls = 0.0;
					}catch(Exception g){
						ttlsls = 0.0;
					}
					cal_tips_2.setText("");
				}
				cal_tips_1.setText("");
			}
			break;
		case 4:
			try{
				if(psn_sls_1.getText() == null || psn_sls_1.getText().compareTo("") == 0){
					cal_tips_1.setText("");
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0) {
							cal_tips_2.setText("");
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												ttlsls = 0.0;
												cal_tips_4.setText("");
											}else{
												ttlsls = Double.parseDouble(psn_sls_4.getText());
											}
										}catch(Exception e){
											ttlsls = 0.0;
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											ttlsls = Double.parseDouble(psn_sls_3.getText());
											cal_tips_4.setText("");
										}else{
											ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = 0.0;
								cal_tips_3.setText("");
							}
						}else{
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												ttlsls = Double.parseDouble(psn_sls_2.getText());
												cal_tips_4.setText("");
											}else{
												ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText());
											}
										}catch(Exception e){
											ttlsls = Double.parseDouble(psn_sls_2.getText());
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
											cal_tips_4.setText("");
										}else{
											ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_2.getText());
								cal_tips_3.setText("");
							}
						}
					}catch(Exception e){
						ttlsls = 0.0;
						cal_tips_2.setText("");
					}
				}else{
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0) {
							cal_tips_2.setText("");
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												ttlsls = Double.parseDouble(psn_sls_1.getText());
												cal_tips_4.setText("");
											}else{
												ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_4.getText());
											}
										}catch(Exception e){
											ttlsls = Double.parseDouble(psn_sls_1.getText());
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_3.getText());
											cal_tips_4.setText("");
										}else{
											ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_1.getText());
								cal_tips_3.setText("");
							}
						}else{
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText());
												cal_tips_4.setText("");
											}else{
												ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText());
											}
										}catch(Exception e){
											ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText());
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
											cal_tips_4.setText("");
										}else{
											ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText());
								cal_tips_3.setText("");
							}
						}
					}catch(Exception e){
						ttlsls = Double.parseDouble(psn_sls_1.getText());
						cal_tips_2.setText("");
					}
				}
			}catch(Exception e){
				ttlsls = 0.0;
				cal_tips_1.setText("");
			}
			break;
		case 5:
			try{
				if(psn_sls_1.getText() == null || psn_sls_1.getText().compareTo("") == 0){
					cal_tips_1.setText("");
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0) {
							cal_tips_2.setText("");
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												cal_tips_4.setText("");
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = 0.0;
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = 0.0;
													cal_tips_5.setText("");
												}
											}else{
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = Double.parseDouble(psn_sls_4.getText());
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}
											}
										}catch(Exception e){
											ttlsls = 0.0;
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											cal_tips_4.setText("");
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_3.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_3.getText());
												cal_tips_5.setText("");
											}
										}else{
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
												cal_tips_5.setText("");
											}
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = 0.0;
								cal_tips_3.setText("");
							}
						}else{
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												cal_tips_4.setText("");
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = Double.parseDouble(psn_sls_2.getText());
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = Double.parseDouble(psn_sls_2.getText());
													cal_tips_5.setText("");
												}
											}else{
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText());
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}
											}
										}catch(Exception e){
											ttlsls = Double.parseDouble(psn_sls_2.getText());
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											cal_tips_4.setText("");
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
												cal_tips_5.setText("");
											}
										}else{
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
												cal_tips_5.setText("");
											}
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_2.getText());
								cal_tips_3.setText("");
							}
						}
					}catch(Exception e){
						ttlsls = 0.0;
						cal_tips_2.setText("");
					}
				}else{
					try{
						if(psn_sls_2.getText() == null || psn_sls_2.getText().compareTo("") == 0) {
							cal_tips_2.setText("");
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												cal_tips_4.setText("");
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = 0.0;
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = 0.0;
													cal_tips_5.setText("");
												}
											}else{
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = Double.parseDouble(psn_sls_4.getText());
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}
											}
										}catch(Exception e){
											ttlsls = 0.0;
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											cal_tips_4.setText("");
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_3.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_3.getText());
												cal_tips_5.setText("");
											}
										}else{
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
												cal_tips_5.setText("");
											}
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = 0.0;
								cal_tips_3.setText("");
							}
						}else{
							try{
								if(psn_sls_3.getText() == null || psn_sls_3.getText().compareTo("") == 0){
									cal_tips_3.setText("");
										try{
											if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
												cal_tips_4.setText("");
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = Double.parseDouble(psn_sls_2.getText());
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = Double.parseDouble(psn_sls_2.getText());
													cal_tips_5.setText("");
												}
											}else{
												try{
													if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
														ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText());
														cal_tips_5.setText("");
													}else{
														ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
													}
												}catch(Exception f){
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}
											}
										}catch(Exception e){
											ttlsls = Double.parseDouble(psn_sls_2.getText());
											cal_tips_4.setText("");
										}
								}else{
									try{
										if(psn_sls_4.getText() == null || psn_sls_4.getText().compareTo("") == 0){
											cal_tips_4.setText("");
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
												cal_tips_5.setText("");
											}
										}else{
											try{
												if(psn_sls_5.getText() == null || psn_sls_5.getText().compareTo("") == 0){
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
													cal_tips_5.setText("");
												}else{
													ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
												}
											}catch(Exception f){
												ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText());
												cal_tips_5.setText("");
											}
										}
									}catch(Exception e){
										ttlsls = Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText());
										cal_tips_4.setText("");
									}
								}
							}catch(Exception e){
								ttlsls = Double.parseDouble(psn_sls_2.getText());
								cal_tips_3.setText("");
							}
						}
					}catch(Exception e){
						ttlsls = 0.0;
						cal_tips_2.setText("");
					}
				}
			}catch(Exception e){
				ttlsls = 0.0;
				cal_tips_1.setText("");
			}
			ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText());
			break;
		case 6:
			ttlsls = Double.parseDouble(psn_sls_1.getText())+Double.parseDouble(psn_sls_2.getText())+Double.parseDouble(psn_sls_3.getText())+Double.parseDouble(psn_sls_4.getText())+Double.parseDouble(psn_sls_5.getText())+Double.parseDouble(psn_sls_6.getText());
			break;
		default:
			ttlsls = 0;
			break;
	}
		for(int i = c; i > 0; i--){
			try{
				switch(i){
					case 1:
						if(psn_sls_1.getText()==null || psn_sls_1.getText().compareTo("")==0);
						else{
							rate = Double.parseDouble(psn_sls_1.getText())/ttlsls;
							cal_tips_1.setText(df.format(ttltps*rate));
						}
						break;
					case 2:
						if(psn_sls_2.getText()==null || psn_sls_2.getText().compareTo("")==0);
						else{
							rate = Double.parseDouble(psn_sls_2.getText())/ttlsls;
							cal_tips_2.setText(df.format(ttltps*rate));
						}
						break;
					case 3:
						if(psn_sls_3.getText()==null || psn_sls_3.getText().compareTo("")==0);
						else{
							rate = Double.parseDouble(psn_sls_3.getText())/ttlsls;						
							cal_tips_3.setText(df.format(ttltps*rate));
						}
						break;
					case 4:
						if(psn_sls_4.getText()==null || psn_sls_4.getText().compareTo("")==0);
						else{
							rate = Double.parseDouble(psn_sls_4.getText())/ttlsls;
							cal_tips_4.setText(df.format(ttltps*rate));
						}
						break;
					case 5:
						if(psn_sls_5.getText()==null || psn_sls_5.getText().compareTo("")==0);
						else{
							rate = Double.parseDouble(psn_sls_5.getText())/ttlsls;
							cal_tips_5.setText(df.format(ttltps*rate));
						}
						break;
					case 6:
						if(psn_sls_6.getText()==null || psn_sls_6.getText().compareTo("")==0);
						else{
							rate = Double.parseDouble(psn_sls_6.getText())/ttlsls;
							cal_tips_6.setText(df.format(ttltps*rate));
						}
						break;
					default:
						break;
				}
			}catch(Exception e){
				switch(i){
					case 1:
						cal_tips_1.setText("Wrong input!F");
						break;
					case 2:
						cal_tips_2.setText("Wrong input!G");
						break;
					case 3:
						cal_tips_3.setText("Wrong input!H");
						break;
					case 4:
						cal_tips_4.setText("Wrong input!I");
						break;
					case 5:
						cal_tips_5.setText("Wrong input!J");
						break;
					case 6:
						cal_tips_6.setText("Wrong input!K");
						break;
					default:
						break;
				}
			}
		}
	}
}
