package com.danieladams.android.aca.solitaire

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var counter = 0
        relativeLayout {
            val counterTextView = textView {
                id = 21
                text = "0"
                textSize = 24f
            }
            button {
                onClick {
                    counter++
                    counterTextView.text= counter.toString()
                }
            }.lparams {
                below(counterTextView)
            }
        }


    }
}
