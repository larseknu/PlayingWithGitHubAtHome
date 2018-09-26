package no.hiof.larseknu.playingwithgithubathome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goToMovieButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToMovieButton = findViewById(R.id.goToMovie);
    }

    public void goToMovies(View view) {
        startActivity(new Intent(this, MovieActivity.class));
    }
}
