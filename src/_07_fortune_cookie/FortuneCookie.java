package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FortuneCookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(700,700);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
        if(rand==0) {
        	JOptionPane.showMessageDialog(null, "You will be super rich");
        }
        else if (rand==1){
        	JOptionPane.showMessageDialog(null, "Something you wished for will come true");
        }
        else if (rand==2){
        	JOptionPane.showMessageDialog(null, "Everyone in your family will be healthy");
        }
        else if (rand==3) {
        	JOptionPane.showMessageDialog(null, "Nothing bad is going to happen to you");
        }
        else if (rand==4) {
        	JOptionPane.showMessageDialog(null, "You will get a new phone");
        }
		
	}
	
}
