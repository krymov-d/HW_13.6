package kz.kd.hw_136

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNewsOne: TextView = findViewById(R.id.tv_news_1)
        tvNewsOne.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .add(R.id.fl_content, ContentOne(), "News 1")
                .addToBackStack(null)
                .commit()
        }

        val tvNewsTwo: TextView = findViewById(R.id.tv_news_2)
        tvNewsTwo.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .add(R.id.fl_content, ContentTwo(), "News 2")
                .addToBackStack(null)
                .commit()
        }
    }
}