package com.swifto.unlimitedphoto


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val targetBtn: Button = findViewById(R.id.target)
        //this reads if the button is pressed
        targetBtn.setOnClickListener {
            Toast.makeText(this, "Target Mode Selected", Toast.LENGTH_LONG).show()
            //targetOpen()
        }
    }
}

//private fun targetOpen() {

//}