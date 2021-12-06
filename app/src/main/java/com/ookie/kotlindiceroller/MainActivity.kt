package com.ookie.kotlindiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val solutionTextView = findViewById<TextView>(R.id.solutionTextView)
        val rollButton = findViewById<Button>(R.id.rollButton)
        var diceImage = findViewById<ImageView>(R.id.imageView)


        //Instantiate Dice and pass in 6 sides
        val dice = Dice(6)

        //Start application with random Dice Roll to prevent blank screen at start
        dice.roll()

        rollButton.setOnClickListener {
            //Perform Roll Function on Dice
            val diceRoll = dice.roll()
            //var rollResult = dice.roll()

            /*
            when (rollResult) {
                luckyNumber -> println("You won!")
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }
            */

            val drawableResource = when (diceRoll) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)

            //for Screen Readers
            diceImage.contentDescription = diceRoll.toString()
        }
    }

}