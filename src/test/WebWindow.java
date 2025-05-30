package test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WebWindow {

    public static void main(String[] args) {
        Sample1 sm = new Sample1();
    }
}

// Frame を継承したクラス
class Sample1 extends Frame {
    
    public Sample1() {
    	//ウィンドウのタイトル
        super("test");
        
        addWindowListener(new SampleWindowListener());
        //ウィンドウのサイズと表示
        setSize(250, 200);
        setVisible(true);
    }

    // ウィンドウクローズ処理
    class SampleWindowListener extends WindowAdapter {
    	// ウィンドウを閉じる
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
