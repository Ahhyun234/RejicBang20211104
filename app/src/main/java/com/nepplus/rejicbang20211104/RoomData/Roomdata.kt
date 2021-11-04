package com.nepplus.rejicbang20211104.RoomData

import java.io.Serializable
import java.lang.NumberFormatException
import java.text.NumberFormat
import java.util.*

class Roomdata(val price: Int, val address: String, val floor: Int, val description: String):Serializable {

    fun getFormattedPrice(): String {

        if (this.price < 10000) {
            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return priceStr
        } else {
            val uk = this.price / 10000
            val rest = this.price % 10000
            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            val priceStr = "${uk}억 ${restCommaStr}"

            return priceStr
        }


    }

    fun getFormattedFloor(): String {

        if (this.floor > 0) {
            return "${this.floor}"
        } else if (this.floor == 0) {
            return "반지하"
        } else {
            return "지하${-this.floor}층"
        }


    }
}