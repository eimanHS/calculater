package calculater;

import java.awt.event.ActionListener;

public class Controler implements ActionListener {
	static view v;
	
	
	public static void main(String[] args) {
		v = new view();
		v.setVisible(true);
		System.out.println("111111111111");

	}// main 

	
	@Override
	public void actionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("222222222");
		
		//	v.setjTextField1(v.getjTextField1() + e.getSource() + "1");
//		  n= Integer.parseInt(jButton7.getText());
//	        jTextField1.setText(jTextField1.getText() + jButton7.getText());
//	    
	        
//	        o= jButton14.getText();
//	        jTextField1.setText(jTextField1.getText() + jButton14.getText());

	}
}
