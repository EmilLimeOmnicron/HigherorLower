package evangelista.emil.higherorlower;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;

   public class MainActivity extends AppCompatActivity{
         ArrayList cardValue = new ArrayList();
        // private String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};

      @Override
      protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         Button higherButton = (Button) findViewById(R.id.higherButton);
         Button lowerButton = (Button) findViewById(R.id.lowerButton);
         Button saveButton = (Button) findViewById(R.id.saveButton);
         Button loadButton = (Button) findViewById(R.id.loadButton);
         Button startButton = (Button) findViewById(R.id.startButton);
         Button resetButton = (Button) findViewById(R.id.resetButton);
         TextView currentStreak = (TextView) findViewById(R.id.currentStreakValue);
         TextView bestStreak = (TextView) findViewById(R.id.bestStreakValue);

      }

      public String generateRandomCardValue() {
         int randomNumber, value;
         Random rand = new Random(); //https://stackoverflow.com/questions/3535574/getting-current-date-time-for-a-random-number-generators-
         randomNumber = rand.nextInt(13) + 1 ; // 0 <= n < 12 + 1.
        //value = cardValue.
         //return value;
         return "0";
      }


      public String generateRandomSuit() {
         String suit;
         int randomSuit;
         Random rand = new Random();
         randomSuit = rand.nextInt(4) + 1;

         switch(randomSuit) {
            case 1: suit = "Clubs";
               return suit;
            case 2: suit = "Spades";
               return suit;
            case 3: suit = "Hearts";
               return suit;
            case 4: suit = "Diamonds";
               return suit;
         }
         return "0";
      }

      public String generateCard() {

         String suit = generateRandomSuit();
        // int card = generateRandomCardValue();
       //  String compiledCard = card + ", " + suit;
         return "0";
      }

      public void checkResult(View view) {



         String message;

      }
   }




