package kg.nurzhamal.android3_hw6;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import kg.nurzhamal.android3_hw6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.add(oper1, oper2)));
        });

        binding.btnMinus.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.minus(oper1, oper2)));
        });

        binding.btnMultiply.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.multiply(oper1, oper2)));
        });

        binding.btnDivision.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.division(oper1, oper2)));
        });

        binding.etOper1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable input) {
                String text = binding.etOper1.getText().toString();
                if (text.matches("[а-яА-Я_a-zA-Z_]+")){
                    Toast.makeText(MainActivity.this, "Please enter Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.etOper2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable input) {
                String text = binding.etOper2.getText().toString();
                if (text.matches("[а-яА-Я_a-zA-Z_]+")){
                    Toast.makeText(MainActivity.this, "Please enter Number", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}