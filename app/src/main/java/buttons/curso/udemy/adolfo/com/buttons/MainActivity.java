package buttons.curso.udemy.adolfo.com.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * AdolfoDev - Buttons
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void metodoPresioname(View view) {
        System.out.println("presionaste el boton!!");
    }
}
