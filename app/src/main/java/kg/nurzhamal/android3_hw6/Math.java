package kg.nurzhamal.android3_hw6;

import android.widget.Toast;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division (int a, int b) {
        if (b == 0 || 0 == a) {
            Toast.makeText(App.appContext, "На ноль делить нельзя", Toast.LENGTH_SHORT).show();
        } else {
            int result = a / b;
            return result;
        }
        return 0;
    }
}
