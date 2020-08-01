package rsideas.android.audioenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnDog, btnWolf, btnPig, btnMonkey, btnLion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDog = (ImageButton) findViewById(R.id.btnDog);
        btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog();
            }
        });
        btnWolf = (ImageButton) findViewById(R.id.btnWolf);
        btnWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wolf();
            }
        });
        btnLion = (ImageButton) findViewById(R.id.btnLion);
        btnLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lion();
            }
        });
        btnMonkey = (ImageButton) findViewById(R.id.btnMonkey);
        btnMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monkey();
            }
        });
        btnPig = (ImageButton) findViewById(R.id.btnPig);
        btnPig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pig();
            }
        });


    }
    public void dog(){
        MediaPlayer.create(this,R.raw.perro).start();
    }
    public void wolf(){
        MediaPlayer.create(this,R.raw.lobo).start();
    }
    public void lion(){
        MediaPlayer.create(this,R.raw.leon).start();
    }
    public void monkey(){
        MediaPlayer.create(this,R.raw.mono).start();
    }
    public void pig(){
        MediaPlayer.create(this,R.raw.cerdo).start();
    }
}