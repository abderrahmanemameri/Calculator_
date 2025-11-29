package com.example.calculator_

import android.util.Log
import androidx.lifecycle.ViewModel

class calculaterViewModel : ViewModel() {

    fun onButtonClick(btn: String)
    {
        Log.i("clicked Button",btn)
    }
}