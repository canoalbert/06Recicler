package alberto.cano.a06recicler;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.view.View;



import alberto.cano.a06recicler.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}