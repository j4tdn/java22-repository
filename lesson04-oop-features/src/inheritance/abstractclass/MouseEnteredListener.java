package inheritance.abstractclass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// bắt buộc phải override hàm mouseEnter
// còn lại thì ko bắt buộc
public abstract class MouseEnteredListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}