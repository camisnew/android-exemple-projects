package com.camisnew.aftertest.model

import android.provider.Settings.Global.getString
import com.camisnew.aftertest.R.string

class Month {
    companion object {
        fun identifyMonth(int: Int): Int {
            return when(int) {
                1 -> string.month1
                2 -> string.month2
                3 -> string.month3
                4 -> string.month4
                5 -> string.month5
                6 -> string.month6
                7 -> string.month7
                8 -> string.month8
                9 -> string.month9
                10 -> string.month10
                11 -> string.month11
                12 -> string.month12
                else -> string.selectNumberErrorMessage
            }
        }
    }
}