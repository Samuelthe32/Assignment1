package st10477312vcconnect.edu.mealplanner

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Declarations
        val radioGroupTime = findViewById<RadioGroup>(R.id.radioGroupTime)
        val rbMorning = findViewById<RadioButton>(R.id.rbMorning)
        val rbMidMorning = findViewById<RadioButton>(R.id.rbMidMorning)
        val rbAfternoon = findViewById<RadioButton>(R.id.rbAfternoon)
        val rbMidAfternoon = findViewById<RadioButton>(R.id.rbMidAfternoon)
        val rbDinner = findViewById<RadioButton>(R.id.rbDinner)
        val txtSuggestion = findViewById<TextView>(R.id.txtSuggestion)
        val btnSuggestion = findViewById<Button>(R.id.btnSuggestion)
        val btnClear = findViewById<Button>(R.id.btnClear)


        btnSuggestion.setOnClickListener {

        //A user will check a RadioButton and text will be displayed
            if (rbMorning.isChecked)
            {
                txtSuggestion.text = "Suggested meal : Pancakes, Eggs and bacon, or cereal"
            }
            else if (rbMidMorning.isChecked)
            {
                txtSuggestion.text = "Suggested meal: Yogurt bowl, protein bar or smoothie"
            }
             else if (rbAfternoon.isChecked)
            {
                txtSuggestion.text = "Suggested meal : Chicken Salad, Sandwich, or pasta"
            }
            else if (rbMidAfternoon.isChecked)
            {
                txtSuggestion.text = "Suggested meal : Fruit mix, snack bar or nuts"
            }
            else if (rbDinner.isChecked)
            {
                txtSuggestion.text = "Suggested meal : Grilled chicken or steak, with rice and mash"
            }
            //This text will display as error or when the user didn't click any button
            else
            {
                txtSuggestion.text = "Please select a time of day." //This text will display as an error or when the user didn't select a time of day
            }
        }

        btnClear.setOnClickListener {
            txtSuggestion.text = " "
            rbDinner.isChecked = false
            rbMorning.isChecked = false
            rbAfternoon.isChecked = false
            rbMidAfternoon.isChecked = false
            rbMidMorning.isChecked = false
        }

    // I received assistance from ChatGPT in structuring the logic for the if statements and implementing RadioButton selection.







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}