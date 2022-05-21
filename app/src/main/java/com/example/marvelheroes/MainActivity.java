package com.example.marvelheroes;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.marvelheroes.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        TextView message = (TextView) findViewById(R.id.avenger_info);

        ImageButton button1 = findViewById(R.id.ironman);

        button1.setOnClickListener((v -> {
            /*Toast.makeText(getApplicationContext(),
                    "Tony Stark",
                    Toast.LENGTH_LONG).show();*/
            Toast toast = Toast.makeText(this, "Ajustes guardados", Toast.LENGTH_LONG);
            toast.show();
            message.setText("Hero Information \n Name: Tony Stark \n Nick: Ironman \n Age: 53 Years Old");
        }));

        ImageButton button2 = (ImageButton) findViewById(R.id.ironman2);

        button2.setOnClickListener((v -> {
            Toast notification = Toast.makeText(MainActivity.this, "Wanda Maximoff", Toast.LENGTH_SHORT);
            notification.show();
            message.setText("Hero Information \n Name: Wanda Maximoff \n Nick: Scarlet Witch \n Age: 29 Years Old");
        }));

        ImageButton button3 = (ImageButton) findViewById(R.id.ironman3);
        button3.setOnClickListener(v -> {
            Toast notification = Toast.makeText(MainActivity.this, "Natasha Romanova", Toast.LENGTH_SHORT);
            notification.show();
            message.setText("Hero Information \n Name: Natasha Romanova \n Nick: Black Widow \n Age: 32  Years Old");


        });

        ImageButton button4 = (ImageButton) findViewById(R.id.ironman4);
        button4.setOnClickListener(v -> {
            Toast notification = Toast.makeText(MainActivity.this, "Steve Rogers", Toast.LENGTH_SHORT);
            notification.show();
            message.setText("Hero Information \n Name: Steve Rogers \n Nick: Captain America \n Age: 99 Years Old");
        });

     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onClick(View v) {

    }
}