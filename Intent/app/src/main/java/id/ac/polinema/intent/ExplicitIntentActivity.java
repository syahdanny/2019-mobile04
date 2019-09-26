package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText inputNama;
    private TextView outputNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        inputNama = findViewById(R.id.input_name);
        outputNama = findViewById(R.id.text_output);

    }

    public void handleSubmit(View view) {
        String nama = inputNama.getText().toString();
        outputNama.setText(nama);

    }

}
