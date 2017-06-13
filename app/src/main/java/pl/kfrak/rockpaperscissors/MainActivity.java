package pl.kfrak.rockpaperscissors;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.R.attr.onClick;
import static pl.kfrak.rockpaperscissors.R.id.paper_picture;
import static pl.kfrak.rockpaperscissors.R.id.rock_picture;
import static pl.kfrak.rockpaperscissors.R.id.scissors_picture;

public class MainActivity extends AppCompatActivity {

    private Drawable rock_picture;
    private Drawable paper_picture;
    private Drawable scissors_picture;


    @BindView(R.id.my_choice_picture)
    ImageView my_choice_picture;

    @BindView(R.id.computers_choice_picture)
    ImageView computers_choice_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        rock_picture = ContextCompat.getDrawable(this, R.drawable.rock);
        paper_picture = ContextCompat.getDrawable(this, R.drawable.paper);
        scissors_picture = ContextCompat.getDrawable(this, R.drawable.scissors);
    }

    public void rockChoosen(View view){
        my_choice_picture.setImageDrawable(rock_picture);
        //playGame();
    }

    public void paperChoosen(View view){
        my_choice_picture.setImageDrawable(paper_picture);
        //playGame();
    }

    public void scissorsChoosen(View view){
        my_choice_picture.setImageDrawable(scissors_picture);
        //playGame();
    }

//    private void playGame(){
//        //ustaw zdjęcie wyboru komputera
//        //porównaj wybory - oblicz zwycięzcę
//        //zaktualizuj wynik
//    }

}
