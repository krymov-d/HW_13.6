package kz.kd.hw_136

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class Headings : Fragment(R.layout.headings) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvHeadingOne = view.findViewById<TextView>(R.id.tv_news_1)
        tvHeadingOne.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(
                    R.id.fl_content,
                    ContentOne(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }

        val tvHeadingTwo = view.findViewById<TextView>(R.id.tv_news_2)
        tvHeadingTwo.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(
                    R.id.fl_content,
                    ContentTwo(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }

        val tvHeadingThree = view.findViewById<TextView>(R.id.tv_news_3)
        tvHeadingThree.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(
                    R.id.fl_content,
                    ContentThree(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }

        val tvHeadingFour = view.findViewById<TextView>(R.id.tv_news_4)
        tvHeadingFour.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(
                    R.id.fl_content,
                    ContentFour(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }

        val tvHeadingFive = view.findViewById<TextView>(R.id.tv_news_5)
        tvHeadingFive.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(
                    R.id.fl_content,
                    ContentFive(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }

        val tvHeadingSix = view.findViewById<TextView>(R.id.tv_news_6)
        tvHeadingSix.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(
                    R.id.fl_content,
                    ContentSix(),
                    "ContentOne"
                )
                .addToBackStack(null)
                .commit()
        }
    }
}