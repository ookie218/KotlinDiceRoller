package com.ookie.kotlindiceroller

class Dice (val numSides: Int) {

    //Roll and return random number between 1 & 6
    fun roll(): Int {
        return (1..numSides).random()

    }
}