package ua.`in`.valentin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var button3 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener(listener)

        button3 = findViewById(R.id.button3)
        button3.setOnClickListener(listener3)

    }

    private val listener = View.OnClickListener { view ->
        when (view.getId()) {
            R.id.button -> {
                val textView = findViewById<TextView>(R.id.textData)
                textView.text = "мы нажали  на кнопку 12"
                Log.d("button", "мы нажали  на кнопку")
            }
        }
    }

    private val listener3 = View.OnClickListener { view ->
        when (view.getId()) {
            R.id.button3 -> {
                val textView = findViewById<TextView>(R.id.textData)
                textView.text = "мы нажали  на кнопку 3"
                Log.d("button", "мы нажали  на кнопку 3")






            }
        }
    }



}