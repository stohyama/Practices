package practices;

/**
 * 5の倍数と、5の付く数字のときに "buzz" と返却する関数 buzz を作成しなさい
 * <p>
 * 引数：整数
 * 返却："buzz" / "" (あてはまらない場合は空文字)
 */

public class Practice017 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        buzz(0);
    }

    // 5の倍数と、5の付く数字なら"buzz"
    public static String buzz(int n) {
        String buzzBuzz = "";
        String t = String.valueOf(n);
        if (n == 0) {
            buzzBuzz = "";
        } else if (n % 5 == 0) {
            buzzBuzz = "buzz";
        } else if (t.contains("5")) {
            buzzBuzz = "buzz";
        } else if (n % 5 != 0 && !t.contains("5")) {
            buzzBuzz = "";
        }
        return buzzBuzz;
    }
}

