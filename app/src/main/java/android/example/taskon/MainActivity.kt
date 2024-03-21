package android.example.taskon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var radioGroud: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroud = findViewById(R.id.rg_1)

        radioGroud.setOnCheckedChangeListener { group, checkedId ->

            // on below line we are getting radio button from our group.
            val radioButton = findViewById<RadioButton>(checkedId)

            // on below line we are displaying a toast message.
            Toast.makeText(
                this@MainActivity,
                "Selected Language is : " + radioButton.text,
                Toast.LENGTH_SHORT
            ).show()
        }

        val nextButton = findViewById<Button>(R.id.b_nextbtn)

        nextButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Recycler_View_P1::class.java)
            startActivity(intent)
        }


    }
}