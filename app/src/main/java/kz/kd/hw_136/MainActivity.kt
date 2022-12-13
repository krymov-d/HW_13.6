package kz.kd.hw_136

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

const val TAG = "MAIN ACTIVITY"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fl_headings, Headings(), "Headings").commit()

        val tvBack: TextView = findViewById(R.id.tv_back)
        tvBack.setOnClickListener {
            supportFragmentManager.popBackStack()
        }

        val tvForward: TextView = findViewById(R.id.tv_forward)
        tvForward.setOnClickListener {
            contentChange()
        }
    }

    private fun contentChange() {
        val contentOne: Fragment? = supportFragmentManager.findFragmentByTag("ContentOne")
        val contentTwo: Fragment? = supportFragmentManager.findFragmentByTag("ContentTwo")
        val contentThree: Fragment? = supportFragmentManager.findFragmentByTag("ContentThree")
        val contentFour: Fragment? = supportFragmentManager.findFragmentByTag("ContentFour")
        val contentFive: Fragment? = supportFragmentManager.findFragmentByTag("ContentFive")
        val contentSix: Fragment? = supportFragmentManager.findFragmentByTag("ContentSix")

        if (contentOne != null && contentOne.isVisible) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fl_content,
                    ContentTwo(),
                    "ContentTwo"
                )
                .addToBackStack(null)
                .commit()
        }
        else if (contentTwo != null && contentTwo.isVisible) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fl_content,
                    ContentThree(),
                    "ContentThree"
                )
                .addToBackStack(null)
                .commit()
        }
        else if (contentThree != null && contentThree.isVisible) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fl_content,
                    ContentFour(),
                    "ContentFour"
                )
                .addToBackStack(null)
                .commit()
        }
        else if (contentFour != null && contentFour.isVisible) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fl_content,
                    ContentFive(),
                    "ContentFive"
                )
                .addToBackStack(null)
                .commit()
        }
        else if (contentFive != null && contentFive.isVisible) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fl_content,
                    ContentSix(),
                    "ContentSix"
                )
                .addToBackStack(null)
                .commit()
        }
        else if (contentSix != null && contentSix.isVisible) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fl_content,
                    ContentOne(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }
        else {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fl_content,
                    ContentOne(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }
    }
}