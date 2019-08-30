package des;

public class main3 {
    public static void main(String[] args) {
        int[] num_array = {1, 2, 3, 4, 5};
        String[] greetings2 = {"hello", "こんにちは", "ニーハオ", "チャオ", "null"};
        for(int i = 0; i < 5; i++) {
//            System.out.println(i + "回目のhello");
            System.out.println(num_array[i]);
            System.out.println(greetings2[i]);

        }
//while文　初期処理がない。　初期処理はwhile文の外に書く。
        int i = 0;
        while (i < 5) {
//            繰り返し処理　この後の処理がぬけがちだからあまり使わない。
            i++;
        }
    }
}
