package com.novadev.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.text = "Let's roll"

        roll_button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) +1

        when(randomInt){
            1->  iv_diceRoll.setImageResource(R.drawable.dice_1)
            2->  iv_diceRoll.setImageResource(R.drawable.dice_2)
            3->  iv_diceRoll.setImageResource(R.drawable.dice_3)
            4->  iv_diceRoll.setImageResource(R.drawable.dice_4)
            5-> iv_diceRoll.setImageResource(R.drawable.dice_5)
            else-> iv_diceRoll.setImageResource(R.drawable.dice_6)
        }
    }
}
