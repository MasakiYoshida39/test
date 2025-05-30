package test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Frame{
	int x = 10;
	int y = 10;
	

	public static void main(String[] args) {
		
		Drawing  dg = new Drawing() ;

	}
	public Drawing () {
		super("お絵描き");
		
		addWindowListener(new SampleWindowListener());
		addMouseListener((new SampleMouseAdapter()));
		//ウィンドウのサイズと表示
        setSize(250, 200);
        setVisible(true);
	}
	
	public void paint (Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, 10, 10);
	}
	
	//ウィンドウクローズ処理
    class SampleWindowListener extends WindowAdapter {
    	// ウィンドウを閉じる
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
	
	class SampleMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
			
		}
	}

}
