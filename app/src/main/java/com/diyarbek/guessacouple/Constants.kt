package com.diyarbek.guessacouple

import com.diyarbek.guessacouple.data.Images

object Constants {
    fun getImages() : List<Images>{
        return listOf(
            Images(
                images = listOf(
                    R.drawable.car_1,
                    R.drawable.car_2,
                    R.drawable.car_3,
                    R.drawable.car_4,
                    R.drawable.car_5,
                    R.drawable.car_6,
                    R.drawable.car_7,
                    R.drawable.car_8,
                ),
            )
        )
    }
}