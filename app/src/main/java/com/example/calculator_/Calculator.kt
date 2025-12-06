package com.example.calculator_

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel

val button_list = listOf(
    "C","(",")","/",
    "7","8","9","*",
    "4","5","6","+",
    "1","2","3","-",
    "AC","0",".","=",
)

@Composable
fun Calculator(modifier: Modifier= Modifier,viewModel: calculaterViewModel)
{
    Box(modifier = Modifier.background(Color.White).padding(bottom = 50.dp)) {
        Column (modifier = Modifier.fillMaxSize().padding(top = 20.dp, end = 10.dp),
            horizontalAlignment = Alignment.End)
        {
            Text(
                text = "123+456",

                textAlign = TextAlign.End,
                fontSize = 30.sp,
                color = Color.Black,
                maxLines = 5,
                overflow = TextOverflow.Ellipsis

            )
            Spacer(modifier= Modifier.weight(1f))

            Text(
                text = "123+456",

                textAlign = TextAlign.End,
                fontSize = 60.sp,
                color = Color.Black,
                maxLines = 2,
            )

            Spacer(modifier = Modifier.height(20.dp))

            LazyVerticalGrid( columns = GridCells.Fixed(4),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.padding(start = 20.dp)

                )
            {
                items(button_list){
               ButtonCalculator(it, onClick = {
                   viewModel.onButtonClick(it)})
                }


            }

        }




    }
}
@Composable
fun ButtonCalculator(btn : String,onClick:()-> Unit) {
Box (modifier = Modifier.padding(start = 10.dp))
{
    FloatingActionButton(
        onClick = onClick,
        modifier = Modifier,
        shape = CircleShape,
        containerColor =color_button(btn)
    )
    {
        Text(text = btn)
    } } }



fun color_button(btn: String): Color
{
    if (btn=="C"||btn=="AC")return Color.Red
    if (btn=="("||btn==")")return Color.Gray
    if (btn=="+"||btn=="-"||btn=="*"||btn=="="||btn=="/")return Color(0xFFFF9800)
    return Color.Blue



}