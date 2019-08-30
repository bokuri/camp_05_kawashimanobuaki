package des;

public class main2 {
    public static void main(String[] args) {
        String[] greetings;
        greetings = new String[4];
//                メモリ領域の確保 newでインスタンス化
        greetings[0] = "hello";
        greetings[1] = "こんにちは";
        greetings[2] = "ニーハオ";
        greetings[3] = "ボンジュール";
        greetings[3] = "チャオ";

        System.out.println(greetings[0]);
        System.out.println(greetings[1]);
        System.out.println(greetings[2]);
        System.out.println(greetings[3]);
//        配列には配列の関数が用意されている
        System.out.println(greetings.length);
//        .を入れると使える関数が自動で出てくる
//        変数宣言と初期化と出力
        String[] greetings2 = {"hello", "こんにちは", "ニーハオ", "チャオ"};
        System.out.println(greetings2.length);

        int[] num_array = {1, 2, 3, 4, 5};
        System.out.println(num_array[0]);
        System.out.println(num_array[1]);
        System.out.println(num_array[2]);
        System.out.println(num_array[3]);
        System.out.println(num_array[4]);
//        配列あるある　アドレス指定してはいけない

        for(int i = 0; i<5; i++){
            System.out.println(num_array[i]);
        }
    }
}
