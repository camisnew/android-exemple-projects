package com.camisnew.emotinaltracker.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.camisnew.emotinaltracker.R


class Transaction {
    companion object {
        lateinit var fragmentTransaction : FragmentTransaction

        fun transactionMainFrame(thisName : String, fragment : Fragment, fragmentManager : FragmentManager) {
            fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.mainFrame, fragment)
            fragmentTransaction.addToBackStack(thisName)
            fragmentTransaction.commit()
        }
    }
}