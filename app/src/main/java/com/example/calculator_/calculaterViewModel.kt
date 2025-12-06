package com.example.calculator_

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class calculaterViewModel : ViewModel() {
    private val _equation= MutableLiveData("")
    val equation : LiveData<String> =_equation

    private val _result= MutableLiveData("0")
    val result: LiveData<String> =_result
    fun onButtonClick(btn: String)
    {
        Log.i("clicked Button",btn)
       _equation.value?.let{
            if (btn=="AC"){
                _equation.value=""
                _result.value="0"
                return
            }
           if (btn=="C"){
               if (it.isNotEmpty()){
                   _equation.value=it.substring(0,it.length-1)
                    return
               }


           }

        }

    }
}