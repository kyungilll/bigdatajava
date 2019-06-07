package money;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
public class BankManager {
	private JTextField findid;
	private JTextField updateTel;
	private JTextField joinId;
	private JTextField joinName;
	private JTextField joinAge;
	private JTextField joinTel;

	/**
	 * @wbp.parser.entryPoint
	 */
	static String login=null;
	int idCheck=0;
	
	public BankManager() {
		BankDTO dto = new BankDTO();
		BankDAO dao = new BankDAO();
		JFrame f = new JFrame();
		f.getContentPane().setLayout(null);
		
		
		JButton updateBtn = new JButton("정보수정");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String idid = dao.select(findid.getText()).getId();
					
					if(idid!=null) {
						dao.update(findid.getText(), updateTel.getText());
						JOptionPane.showMessageDialog(null, "연락처가 변경되었습니다.");
					} else {
						JOptionPane.showMessageDialog(null, "존재하지 않는 ID입니다");
						findid.setText("");
						updateTel.setText("");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		updateBtn.setBounds(677, 367, 105, 27);
		f.getContentPane().add(updateBtn);
		
		JButton deletebtn = new JButton("탈퇴하기");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String idid = dao.select(findid.getText()).getId();
					if (idid!=null) {
						dao.delete(findid.getText()); //입력된 ID를 토대로 삭제
						JOptionPane.showMessageDialog(null, "해당 ID가 삭제되었습니다.");
						findid.setText("");
						updateTel.setText("");
					} else {
						JOptionPane.showMessageDialog(null, "존재하지 않는 ID입니다.");
						findid.setText("");
						updateTel.setText("");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		deletebtn.setBounds(677, 419, 105, 27);
		f.getContentPane().add(deletebtn);
		
		findid = new JTextField();
		findid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				findid.setText("");
			}
		});
		findid.setBounds(562, 321, 116, 24);
		f.getContentPane().add(findid);
		findid.setColumns(10);
		
		updateTel = new JTextField();
		updateTel.setBounds(562, 368, 116, 24);
		f.getContentPane().add(updateTel);
		updateTel.setColumns(10);
		
		JButton findBtn = new JButton("ID검색");
		findBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					BankDTO dto = dao.select(findid.getText());
					if(dto.getId()==null) {
						findid.setText("없는 ID입니다.");
						updateTel.setText("");
					} else {
						JOptionPane.showMessageDialog(null, "사용하는 연락처로 변경하세요.");
						updateTel.setText(dto.getTel());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		findBtn.setBounds(677, 320, 105, 27);
		f.getContentPane().add(findBtn);
		JList nameList = null;
		String[] nameArray = null;
		BankDTO[] idList1 = null;
		ArrayList listAll = dao.selectAll();
		nameArray = new String[listAll.size()];
		idList1= new BankDTO[listAll.size()];
		for (int i = 0; i < listAll.size(); i++) {
			idList1[i] = (BankDTO) listAll.get(i);
			nameArray[i]=idList1[i].getName();
		}
		System.out.println("배열에 이름 입력완료");
		nameList = new JList(nameArray);
		nameList.setForeground(Color.BLACK);
		nameList.setFont(new Font("돋움", Font.BOLD, 16));
		nameList.setBackground(new Color(255, 255, 0));
		nameList.setBounds(65, 214, 242, 404);
		f.getContentPane().add(nameList);
		
		joinId = new JTextField();
		joinId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				joinId.setText("");
			}
		});
		joinId.setText("ID입력");
		joinId.setBounds(562, 466, 116, 24);
		f.getContentPane().add(joinId);
		joinId.setColumns(10);
		
		JLabel label = new JLabel("검색,수정");
		label.setBounds(562, 291, 62, 18);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("회원가입");
		label_1.setBounds(562, 428, 62, 18);
		f.getContentPane().add(label_1);
		
		joinName = new JTextField();
		joinName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				joinName.setText("");
			}
		});
		joinName.setText("NAME입력");
		joinName.setColumns(10);
		joinName.setBounds(562, 512, 116, 24);
		f.getContentPane().add(joinName);
		
		joinAge = new JTextField();
		joinAge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				joinAge.setText("");
			}
		});
		joinAge.setText("AGE입력");
		joinAge.setColumns(10);
		joinAge.setBounds(562, 560, 116, 24);
		f.getContentPane().add(joinAge);
		
		joinTel = new JTextField();
		joinTel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				joinTel.setText("");
			}
		});
		joinTel.setText("TEL입력");
		joinTel.setColumns(10);
		joinTel.setBounds(562, 609, 116, 24);
		f.getContentPane().add(joinTel);
		
		JButton checkId = new JButton("중복검사");
		checkId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					BankDTO dto = dao.select(joinId.getText());
					if(dto.getId()==null) { //ID중복검사
						JOptionPane.showMessageDialog(null, "사용가능한 ID입니다.");
						idCheck = 1; //사용가능한 ID일 경우 1부여 > 회원가입시 체크
					} else {
						JOptionPane.showMessageDialog(null, "사용 중인 ID입니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		checkId.setBounds(677, 465, 105, 27);
		f.getContentPane().add(checkId);
		
		JButton joinBtn = new JButton("가입하기");
		joinBtn.setBackground(new Color(240, 248, 255));
		joinBtn.setForeground(new Color(0, 0, 0));
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(idCheck==1) {
				try {
					dto.setId(joinId.getText());
					dto.setName(joinName.getText());
					dto.setAge(joinAge.getText());
					dto.setTel(joinTel.getText());
					
					dao.insert(dto);
					JOptionPane.showMessageDialog(null, "가입이 완료되었습니다.");
					BankManager name = new BankManager();
					f.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
				} else {
					JOptionPane.showMessageDialog(null, "ID 중복검사를 실행하세요.");
				}
			}
		});
		joinBtn.setBounds(677, 648, 105, 27);
		f.getContentPane().add(joinBtn);
		
		JLabel lblNewLabel = new JLabel("전체회원이름");
		lblNewLabel.setBounds(65, 184, 133, 18);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("3차시험 - 정경일");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 30));
		lblNewLabel_1.setBounds(241, 69, 289, 68);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트창 클릭시 내용 지워짐");
		lblNewLabel_2.setBounds(426, 645, 204, 44);
		f.getContentPane().add(lblNewLabel_2);
		
		f.setSize(800, 800);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		BankManager name = new BankManager();
	}
}
