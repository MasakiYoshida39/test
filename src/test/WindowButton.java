package test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//Frame を継承したクラス
public class WindowButton extends Frame{
	
	private Button bt;
	
	public static void main(String[] args) {
		WindowButton sm = new WindowButton ();
		    }
	
	
	
	public WindowButton() {
    	//ウィンドウのタイトル
    	super("test");
        
        //ボタンの作成
        bt = new Button("sam");
        //ボタンの追加
        add(bt);
        
        addWindowListener(new SampleWindowListener());
        //イベントを受け取る
        bt.addActionListener(new SampleActionListener());
        
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
    //イベントを処理する。
    class SampleActionListener implements ActionListener{
    	//イベントが発生したら呼びだされる処理
    	public void actionPerformed(ActionEvent e) {
    		bt.setLabel("OK");
    	}
    }
}


