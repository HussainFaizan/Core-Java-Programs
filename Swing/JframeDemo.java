import javax.swing.JButton;
import javax.swing.*;

public class Jframedemo {

	public static void main(String[] args) {
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(100,100,150, 30);//x axis, y axis, width, height  
		f.add(b);//adding button in JFrame          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}

}

//REPEL.it all ide