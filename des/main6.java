package des;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
//        Scannerでインスタンス化
//        スキャナーのメソッドを出して、文字列のinput変数に代入。
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
//        nextの実行結果をinputに格納
//        nextメソッドを利用している
            System.out.println(input);
            if (input.equals("exit")) {
                break;
            }
        }
//        データ保持　配列
            }
}
