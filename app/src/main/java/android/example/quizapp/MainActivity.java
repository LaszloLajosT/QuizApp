package android.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score = 0;
    private int goodAnswer = 0;
    private int wrongAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumbitAnswers(View view) {
        checkQuestion_01();
        checkQuestion_02();
        checkQuestion_03();
        checkQuestion_04();

        /*
         * Calculate the Score system:
         * Good answers - wrong answers.
         * Score point cannot be less than zero
         */
        score = goodAnswer - wrongAnswer;
        score = score <= 0 ? 0 : score;

        //Show the result for the user:
        Toast.makeText(this, "Your score is: " + score, Toast.LENGTH_LONG).show();

        //Test the score system
        //Toast.makeText(this, "Good answer: " + goodAnswer + "\n Wrong answer: "+wrongAnswer + "\nYour score is: " + score, Toast.LENGTH_LONG).show();

        //Needed to set the points to zero after submit
        score = 0;
        goodAnswer = 0;
        wrongAnswer = 0;
    }

    /**
     * Check the user's answer(s)
     * If an answer is correct then increase good answer point by 1
     * If an answer is wrong then increase wrong answer point by 1
     */
    private void checkQuestion_01(){
        //User gives his/her answer(s) for question_01
        CheckBox question_01_checkbox_01 = findViewById(R.id.question_01_checkbox_01);
        CheckBox question_01_checkbox_02 = findViewById(R.id.question_01_checkbox_02);
        CheckBox question_01_checkbox_03 = findViewById(R.id.question_01_checkbox_03);
        CheckBox question_01_checkbox_04 = findViewById(R.id.question_01_checkbox_04);

        if (question_01_checkbox_01.isChecked())
            wrongAnswer++;
        if (question_01_checkbox_02.isChecked())
            wrongAnswer++;
        if (question_01_checkbox_03.isChecked())
            goodAnswer++;
        if (question_01_checkbox_04.isChecked())
            goodAnswer++;
    }

    /**
     * Check the user's answer(s)
     * If an answer is correct then increase good answer point by 1
     * If an answer is wrong then increase wrong answer point by 1
     */
    private void checkQuestion_02(){
        //User gives his/her answer(s) for question_02
        CheckBox question_02_checkbox_01 = findViewById(R.id.question_02_checkbox_01);
        CheckBox question_02_checkbox_02 = findViewById(R.id.question_02_checkbox_02);
        CheckBox question_02_checkbox_03 = findViewById(R.id.question_02_checkbox_03);
        CheckBox question_02_checkbox_04 = findViewById(R.id.question_02_checkbox_04);

        if (question_02_checkbox_01.isChecked())
            wrongAnswer++;
        if (question_02_checkbox_02.isChecked())
            goodAnswer++;
        if (question_02_checkbox_03.isChecked())
            wrongAnswer++;
        if (question_02_checkbox_04.isChecked())
            goodAnswer++;
    }

    /**
     * Check the user's answer
     * If the answer is correct then increase good answer point by 1
     * If the answer is wrong then increase wrong answer point by 1
     */
    private void checkQuestion_03(){
        ////User gives his/her answer for question_03
        RadioButton question_03_radiobutton_01 = findViewById(R.id.question_03_radio_button_01);
        RadioButton question_03_radiobutton_02 = findViewById(R.id.question_03_radio_button_02);
        RadioButton question_03_radiobutton_03 = findViewById(R.id.question_03_radio_button_03);
        RadioButton question_03_radiobutton_04 = findViewById(R.id.question_03_radio_button_04);

        if (question_03_radiobutton_01.isChecked())
            wrongAnswer++;
        if (question_03_radiobutton_02.isChecked())
            goodAnswer++;
        if (question_03_radiobutton_03.isChecked())
            wrongAnswer++;
        if (question_03_radiobutton_04.isChecked())
            wrongAnswer++;
    }

    /**
     * Check the user's answer:
     * If the answer is correct then increase good answer point by 1
     * If the answer is wrong then increase wrong answer point by 1
     */
    private void checkQuestion_04() {
        //User gives his/her answer for question_04
        EditText answerForQuestion_04 = findViewById(R.id.question_04_edittext_01);

        //save the user's answer to a variable
        String userAnswer = answerForQuestion_04.getText().toString();

        //save the correct answer from strings.xml
        String correctAnswer = getString(R.string.question_04_answer);

        /*
         * compare two strings. If the answer is correct -> increase good answer point by 1
         * otherwise, increase the wrong answer point by 1
         */
        if ( userAnswer.equalsIgnoreCase(correctAnswer)) {
            goodAnswer++;
        }
        else { wrongAnswer++;}

    }
}
