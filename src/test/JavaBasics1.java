package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasics1 {
    public static void main(String[] args) throws IOException {
    	System.out.println("何か入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
//scannerでも同じコード作成可能
//BufferedReaderとScannerの使用用途
//入力が大量、または高速処理したい	BufferedReader
//コンテスト・競技プログラミングなど	BufferedReader
//入力を型ごとに分けて楽に扱いたい	Scanner
//学習・簡単なスクリプト・確認用途など	Scanner