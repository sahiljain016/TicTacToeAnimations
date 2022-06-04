package com.gic.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    int activePlayer = 0;

    boolean gameActive = true;


    public void HomerC(View view){
        ImageView iv=(ImageView) findViewById(R.id.imageView);//homer
        ImageView iv1=(ImageView) findViewById(R.id.imageView1);//homer1
        ImageView iv2=(ImageView) findViewById(R.id.imageView2);//homer2
        ImageView iv3=(ImageView) findViewById(R.id.imageView3);//homer3
        ImageView iv4=(ImageView) findViewById(R.id.loading);//loading
        ImageView iv5=(ImageView) findViewById(R.id.loading2);//welcome
        ImageView iv6=(ImageView) findViewById(R.id.imageView4);//homer4
        ImageView iv7=(ImageView) findViewById(R.id.imageView5);//homer5
        ImageView iv8=(ImageView) findViewById(R.id.hom);//ttc board
        TextView et=(TextView) findViewById(R.id.t1);
        iv4.setAlpha((float) 1.00);

        iv5.setX(1000);

        iv5.setAlpha(1.00f);
        iv8.setX(1000);

        iv8.setAlpha(1.00f);

        iv.animate().alpha(0).setStartDelay(500).setDuration(20);

        iv1.animate().setStartDelay(2000).alpha(0).setDuration(20);

        iv2.animate().setStartDelay(3000).alpha(0).setDuration(20);

        iv4.animate().translationX(-1000).setStartDelay(5000).alpha(0).setDuration(2000);



        iv3.animate().setStartDelay(5000).alpha(0).setDuration(20);



        iv6.animate().setStartDelay(6000).alpha(0).setDuration(20);

iv7.animate().setStartDelay(7000).alpha(0).setDuration(20);

    iv5.animate().setStartDelay(5000).translationX(-1000).setDuration(5000);
    iv7.animate().setStartDelay(8500).translationX(-1000).setDuration(2000);
        iv8.animate().setStartDelay(8500).translationX(-10).setDuration(2000);
        et.animate().translationYBy(-1000).setDuration(1000);
        iv.setEnabled(false);
    }

    public void Homermarge(View view) {

        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2 && gameActive) {
            gameState[tappedCounter] = activePlayer;
            counter.setTranslationY(-2000);
            if (activePlayer == 0) {

                counter.setImageResource(R.drawable.clipart1327420);

                activePlayer = 1;

            } else if(activePlayer == 1){

                counter.setImageResource(R.drawable.homerpng);

                activePlayer = 0;

            }else{

                activePlayer = 2;
            }}

        counter.animate().translationYBy(2000f).rotation(720).setDuration(1000);
            for (int[] winningPosition : winningPositions) {

                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[0]] != 2) {

                    // Somone has won!

                    gameActive = false;

                    String winner = "";
                    String winners = "";
                    if (activePlayer == 1) {

                        winner = "HOMER";
                        winners = "MARGE";
                    } else if(activePlayer == 0){

                        winner = "MARGE";
                        winners = "HOMER";
                    }
                    else{

                        winner = "NOBODY";
                        winners="NOBODY";
                    }
                    Button playAgain=(Button) findViewById(R.id.pa);

                    TextView winnerMessages= (TextView) findViewById(R.id.winnerMessage);
winnerMessages.setText(winner +" HAS WON! " + winners +" HAS LOST!");
playAgain.setVisibility(View.VISIBLE);
                    winnerMessages.setVisibility(View.VISIBLE);
        }}}

        public void playAgainBut(View view){

            ImageView b1=(ImageView) findViewById(R.id.hom1);//block1
            ImageView b2=(ImageView) findViewById(R.id.hom2);//block2
            ImageView b3=(ImageView) findViewById(R.id.hom3);//block3
            ImageView b4=(ImageView) findViewById(R.id.hom4);//block4
            ImageView b5=(ImageView) findViewById(R.id.hom5);//lock5
            ImageView b6=(ImageView) findViewById(R.id.hom6);//block6
            ImageView b7=(ImageView) findViewById(R.id.hom7);//block7
            ImageView b8=(ImageView) findViewById(R.id.home8);//block8
            ImageView b9=(ImageView) findViewById(R.id.home9);//block9

            Button playAgain=(Button) findViewById(R.id.pa);
            TextView winnerMessages= (TextView) findViewById(R.id.winnerMessage);

            playAgain.setVisibility(View.INVISIBLE);
            winnerMessages.setVisibility(View.INVISIBLE);
for(int i=0; i < gameState.length; i++){

     gameState[i]= 2;
}

             activePlayer = 0;
             gameActive = true;

            b1.setImageDrawable(null);
            b2.setImageDrawable(null);
            b3.setImageDrawable(null);
            b4.setImageDrawable(null);
            b5.setImageDrawable(null);
            b6.setImageDrawable(null);
            b7.setImageDrawable(null);
            b8.setImageDrawable(null);
            b9.setImageDrawable(null);


        }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}