package com.example.calculator_

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class calculaterViewModel : ViewModel() {
    private var _equation by mutableStateOf("")
        private set

     private var _result by mutableStateOf("0")
        private set


    fun onButtonClick(btn: String)
    {
        Log.i("clicked Button",btn)
       _equation?.let{
            if (btn=="AC"){
                _equation=""
                _result="0"
                return
            }
           if (btn=="C"){
               if (_equation.isNotEmpty()){
                   _equation=_equation.dropLast(1)

               }
               return
           }
           if (btn=="="){
                _equation=_result
               return
           }
            _equation=_equation+btn
           
        }

    }
}