package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WebWindow {

    public static void main(String[] args) {
        Sample1 sm = new Sample1();
    }
}

// Frame を継承したクラス
class Sample1 extends Frame {
    // フィールドとして宣言（←これが必要）
    private Label lb;

    
    public Sample1() {
    	//ウィンドウのタイトル
        super("test");
        
        //ラベルの作成
        lb = new Label("sam");
        //ラベルの表示
        add(lb);
        
        //文字色を変更
        lb.setForeground(Color.blue);
        //"serif"：フォントの種類（書体）　Font.BOLD：フォントのスタイル　34：フォントサイズ（ピクセル）
        lb.setFont(new Font("serif",Font.BOLD,34));
        
        
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
