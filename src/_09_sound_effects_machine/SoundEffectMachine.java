package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {
	JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(700,700);
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.add(panel);
        frame.pack();
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button1.setText("sound 1");
        button2.setText("sound 2");
        button3.setText("sound 3");
        button4.setText("sound 4");
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			playSound("button1.wav");
		}
		else if(e.getSource()==button2) {
			playSound("button2.wav");
		}
		else if(e.getSource()==button3) {
			playSound("button3.wav");
		}
		else if(e.getSource()==button4) {
			playSound("button4.wav");
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	

}
