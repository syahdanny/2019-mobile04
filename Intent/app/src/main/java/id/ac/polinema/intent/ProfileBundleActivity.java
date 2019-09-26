package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static id.ac.polinema.intent.BundleActivity.AGE_KEY;
import static id.ac.polinema.intent.BundleActivity.NAME_KEY;
import static id.ac.polinema.intent.BundleActivity.USERNAME_KEY;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Bundle bundle = getIntent().getExtras();
            String username = bundle.getString(USERNAME_KEY);
            String name = bundle.getString(NAME_KEY);
            int age = bundle.getInt(AGE_KEY);

            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(String.valueOf(age));

            // TODO: display value here

        }
    }
}
