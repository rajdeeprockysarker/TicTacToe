package com.raj.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    var mValue_Player: Array<IntArray> = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0)
    )


    var mValue_Player1_true_false: Array<BooleanArray> = arrayOf(
        booleanArrayOf(false, false, false),
        booleanArrayOf(false, false, false),
        booleanArrayOf(false, false, false)
    )


    var mValue_Player2_true_false: Array<BooleanArray> = arrayOf(
        booleanArrayOf(false, false, false),
        booleanArrayOf(false, false, false),
        booleanArrayOf(false, false, false)
    )


    var player_one = true
    var player_one_wins = false
    var player_two_wins = false
    var draw = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_0_0.setOnClickListener(this)
        button_0_1.setOnClickListener(this)
        button_0_2.setOnClickListener(this)
        button_1_0.setOnClickListener(this)
        button_1_1.setOnClickListener(this)
        button_1_2.setOnClickListener(this)
        button_2_0.setOnClickListener(this)
        button_2_1.setOnClickListener(this)
        button_2_2.setOnClickListener(this)


    }


    override fun onClick(v: View?) {


        when (v?.getId()) {

            R.id.button_0_0 -> (


                    if (mValue_Player[0][0] == 0) {
                        image_0_0.visibility = View.VISIBLE
                        if (player_one) {
                            image_0_0.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[0][0] = true
                        } else {
                            image_0_0.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[0][0] = true
                        }
                        player_one = !player_one
                        mValue_Player[0][0] = 1
                    }


//                    if (!mValue_Player1_true_false[0][0]) {
//                        mValue_Player1_true_false[0][0] = true
//                        mValue_Player[0][0] = 1
//
//                        if (player_one) {
//                            button_0_0.setBackgroundColor(Color.RED)
//                            player_one = !player_one
//                        } else {
//                            button_0_0.setBackgroundColor(Color.BLUE)
//                            player_one = !player_one
//                        }
//                    }

                    )

            R.id.button_0_1 -> (

                    if (mValue_Player[0][1] == 0) {
                        image_0_1.visibility = View.VISIBLE
                        if (player_one) {
                            image_0_1.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[0][1] = true
                        } else {
                            image_0_1.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[0][1] = true
                        }
                        player_one = !player_one
                        mValue_Player[0][1] = 1
                    }


//                    if (!mValue_Player1_true_false[0][1]) {
//                        mValue_Player1_true_false[0][1] = true
//                        mValue_Player[0][1] = 1
//
//
//                        if (player_one) {
//                            button_0_1.setBackgroundColor(Color.RED)
//                            player_one = !player_one
//                        } else {
//                            button_0_1.setBackgroundColor(Color.BLUE)
//                            player_one = !player_one
//                        }
//                    }

                    )

            R.id.button_0_2 -> (

                    if (mValue_Player[0][2] == 0) {
                        image_0_2.visibility = View.VISIBLE
                        if (player_one) {
                            image_0_2.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[0][2] = true
                        } else {
                            image_0_2.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[0][2] = true
                        }
                        player_one = !player_one
                        mValue_Player[0][2] = 1
                    }

                    )


            R.id.button_1_0 -> (

                    if (mValue_Player[1][0] == 0) {
                        image_1_0.visibility = View.VISIBLE
                        if (player_one) {
                            image_1_0.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[1][0] = true
                        } else {
                            image_1_0.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[1][0] = true
                        }
                        player_one = !player_one
                        mValue_Player[1][0] = 1
                    }

                    )

            R.id.button_1_1 -> (

                    if (mValue_Player[1][1] == 0) {
                        image_1_1.visibility = View.VISIBLE
                        if (player_one) {
                            image_1_1.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[1][1] = true
                        } else {
                            image_1_1.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[1][1] = true
                        }
                        player_one = !player_one
                        mValue_Player[1][1] = 1
                    }

                    )
            R.id.button_1_2 -> (

                    if (mValue_Player[1][2] == 0) {
                        image_1_2.visibility = View.VISIBLE
                        if (player_one) {
                            image_1_2.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[1][2] = true
                        } else {
                            image_1_2.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[1][2] = true
                        }
                        player_one = !player_one
                        mValue_Player[1][2] = 1
                    }

                    )


            R.id.button_2_0 -> (


                    if (mValue_Player[2][0] == 0) {

                        image_2_0.visibility = View.VISIBLE

                        if (player_one) {
                            image_2_0.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[2][0] = true
                        } else {
                            image_2_0.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[2][0] = true
                        }
                        player_one = !player_one
                        mValue_Player[2][0] = 1
                    }

                    )
            R.id.button_2_1 -> (

                    if (mValue_Player[2][1] == 0) {
                        image_2_1.visibility = View.VISIBLE
                        if (player_one) {
                            image_2_1.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[2][1] = true
                        } else {
                            image_2_1.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[2][1] = true
                        }
                        player_one = !player_one
                        mValue_Player[2][1] = 1
                    }

                    )
            R.id.button_2_2 -> (

                    if (mValue_Player[2][2] == 0) {
                        image_2_2.visibility = View.VISIBLE
                        if (player_one) {


                            image_2_2.setBackgroundResource(R.drawable.cross)
                            mValue_Player1_true_false[2][2] = true
                        } else {
                            image_2_2.setBackgroundResource(R.drawable.zero)
                            mValue_Player2_true_false[2][2] = true
                        }
                        player_one = !player_one
                        mValue_Player[2][2] = 1
                    }


                    )


        }


        when (getResult()) {
            true -> {
                Log.v("Finished", "Finished")

                if (player_one_wins)
                    showDialog("Player One",false)
                if (player_two_wins)
                    showDialog("Player Two",false)
                if (draw)
                    showDialog("",true)


            }
            else ->
                Log.v("Finished", "Finished")


        }


    }

    fun showDialog(player:String,isDraw:Boolean){
        val builder = AlertDialog.Builder(this@MainActivity)



        // Display a message on alert dialog
        if(!isDraw)
        builder.setMessage("$player Wins")
        else{
            builder.setMessage("Match Draw")
        }

        // Set a positive button and its click listener on alert dialog
        builder.setPositiveButton("Play Again"){dialog, which ->
            reset()
        }


        // Display a negative button on alert dialog
        builder.setNegativeButton("EXIT"){dialog,which ->
            onBackPressed()
            finish()
        }



        // Finally, make the alert dialog using builder
        val dialog: AlertDialog = builder.create()

        dialog.setCanceledOnTouchOutside(false)

        // Display the alert dialog on app interface
        dialog.show()
    }



    fun reset() {

        mValue_Player = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0)
        )


        mValue_Player1_true_false = arrayOf(
            booleanArrayOf(false, false, false),
            booleanArrayOf(false, false, false),
            booleanArrayOf(false, false, false)
        )





        mValue_Player2_true_false = arrayOf(
            booleanArrayOf(false, false, false),
            booleanArrayOf(false, false, false),
            booleanArrayOf(false, false, false)
        )


        player_one = true
        player_one_wins = false
        player_two_wins = false
        draw = false


        image_0_0.visibility=View.GONE;
        image_0_1.visibility=View.GONE;
        image_0_2.visibility=View.GONE;

        image_1_0.visibility=View.GONE;
        image_1_1.visibility=View.GONE;
        image_1_2.visibility=View.GONE;

        image_2_0.visibility=View.GONE;
        image_2_1.visibility=View.GONE;
        image_2_2.visibility=View.GONE;
    }


    public fun getResult(): Boolean {

        for (i in 0..mValue_Player.size - 1) {
            for (j in 0..mValue_Player1_true_false.size - 1) {
                Log.v("", "" + mValue_Player1_true_false[i][j])
            }

        }

        var flag = true

        if ((mValue_Player1_true_false[0][0] && mValue_Player1_true_false[0][1] && mValue_Player1_true_false[0][2]) ||
            (mValue_Player1_true_false[1][0] && mValue_Player1_true_false[1][1] && mValue_Player1_true_false[1][2]) ||
            (mValue_Player1_true_false[2][0] && mValue_Player1_true_false[2][1] && mValue_Player1_true_false[2][2]) ||

            (mValue_Player1_true_false[0][0] && mValue_Player1_true_false[1][0] && mValue_Player1_true_false[2][0]) ||
            (mValue_Player1_true_false[0][1] && mValue_Player1_true_false[1][1] && mValue_Player1_true_false[2][1]) ||
            (mValue_Player1_true_false[0][2] && mValue_Player1_true_false[1][2] && mValue_Player1_true_false[2][2]) ||


            (mValue_Player1_true_false[0][0] && mValue_Player1_true_false[1][1] && mValue_Player1_true_false[2][2]) ||
            (mValue_Player1_true_false[0][2] && mValue_Player1_true_false[1][1] && mValue_Player1_true_false[2][0])

        ) {
            player_one_wins = true
            return true
        } else if ((mValue_Player2_true_false[0][0] && mValue_Player2_true_false[0][1] && mValue_Player2_true_false[0][2]) ||
            (mValue_Player2_true_false[1][0] && mValue_Player2_true_false[1][1] && mValue_Player2_true_false[1][2]) ||
            (mValue_Player2_true_false[2][0] && mValue_Player2_true_false[2][1] && mValue_Player2_true_false[2][2]) ||

            (mValue_Player2_true_false[0][0] && mValue_Player2_true_false[1][0] && mValue_Player2_true_false[2][0]) ||
            (mValue_Player2_true_false[0][1] && mValue_Player2_true_false[1][1] && mValue_Player2_true_false[2][1]) ||
            (mValue_Player2_true_false[0][2] && mValue_Player2_true_false[1][2] && mValue_Player2_true_false[2][2]) ||


            (mValue_Player2_true_false[0][0] && mValue_Player2_true_false[1][1] && mValue_Player2_true_false[2][2]) ||
            (mValue_Player2_true_false[0][2] && mValue_Player2_true_false[1][1] && mValue_Player2_true_false[2][0])

        ) {
            player_two_wins = true
            return true
        } else if (flag) {

            for (i in 0..mValue_Player.size - 1) {
                for (j in 0..mValue_Player.size - 1) {
                    if (mValue_Player[i][j] == 0) {
                        flag = false
                        break
                    }


                }
            }

            if (flag) {
                draw = true
                return true
            } else {
                return false
            }
        } else {
            return false
        }



        return false


    }

}



