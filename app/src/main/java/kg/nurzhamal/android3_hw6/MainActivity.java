package kg.nurzhamal.android3_hw6;

import android.os.Bundle;

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


    }
}