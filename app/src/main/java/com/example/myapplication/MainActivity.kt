package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceImg : ImageView
    lateinit var numberTxt : TextView
    lateinit var playerName : TextView
    lateinit var Edit_Player_Name : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImg = findViewById(R.id.diceImage)
        numberTxt = findViewById(R.id.textview)
        playerName = findViewById(R.id.playerName)
        Edit_Player_Name = findViewById(R.id.editPlayerTxt)
        val rollBtn:Button = findViewById(R.id.rollButton)
        rollBtn.setOnClickListener { rollDice() }
        val updateBtn:Button = findViewById(R.id.update_Button)
        updateBtn.setOnClickListener { updateName() }
    }

    private fun updateName(view :View){
        playerName.text = Edit_Player_Name.text

    }

    private fun rollDice(){
        val randNum = (1..6).random()
        //val numberTxt : TextView = findViewById(R.id.textview)
        numberTxt.text = randNum.toString()

        //val diceImg : ImageView = findViewById(R.id.diceImage)
        val imgSrc = when (randNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        diceImg.setImageResource(imgSrc)

    }
}