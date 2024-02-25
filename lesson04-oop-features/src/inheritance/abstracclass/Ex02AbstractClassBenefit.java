package inheritance.abstracclass;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Ex02AbstractClassBenefit {
	
	public static void main(String[] args) {
		
		JButton button = new JButton("Submit");
		
		button.addMouseListener(new MouseEnteredListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		
	}
	
}
