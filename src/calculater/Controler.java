package calculater;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class Controler implements ActionListener {
	static view v;
	static Model m;
	
	public static void main(String[] args) {
		v = new view();
		v.setVisible(true);
		m = new Model();

	}// main 

	@Override
	public void actionPerformed(ActionEvent e) {
    	m.flag=!m.flag;

	        double n1=0,n2=0,res=0;
	        String arr[] = new String[4];
	      //  String arr1[] = new String[4];

			v.setjTextField1(v.getjTextField1() + ((JButton)e.getSource()).getText());
			
		if ( ((AbstractButton) e.getSource()).getText() == " = ") {
			
			
			arr= v.getjTextField1().split(" ", 4);
			
			try {
				
				Integer.parseInt(arr[2]);
			if(!(arr[2].equals("="))) {n2= Double.parseDouble(arr[2]);}
		       n1= Double.parseDouble(arr[0]);
			}
			catch (Exception ee) {
				
				  n1= Double.parseDouble(arr[0]);
				if (arr[1].equals("s")) {
					n1= m.sqrroot(n1);	
					 v.setjTextField1(""+n1);
				 }
					
			}
			
			 if (arr[1].equals("+")) {
				res= m.add(n1, n2);	
				 v.setjTextField1(""+ res);
			 }
		
			 else if (arr[1].equals("-")) {
					n1= m.sub(n1, n2);
					 v.setjTextField1(""+ n1);
				 }
			 else if (arr[1].equals("×")) {
					n1= m.mul(n1, n2);	
					 v.setjTextField1(""+ n1);
				 }
			 else if (arr[1].equals("÷")) {
					n1= m.div(n1, n2);	
					 v.setjTextField1(""+ n1);
				 }
			 else if (arr[1].equals("%")) {
					n1= m.mod(n1, n2);	
					 v.setjTextField1(""+ n1);
				 }
			
		    
		}
			
	}
}
