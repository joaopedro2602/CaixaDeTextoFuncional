package com.example.caixadetextofuncional.telas

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun TaskScreen(){

    var vlrDoTextField = remember {
        mutableStateOf("Ola Amigo!")
    }

    Column(
        modifier= Modifier
            .padding(20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = " Escreva um Texto Na Caixa Abaixo!")



        BasicTextField(value = vlrDoTextField.value, onValueChange = {
            vlrDoTextField.value = it
            Log.i("dajskdjaskjdasd", it)
        })
        Spacer(modifier = Modifier.width(20.dp))
        Text(vlrDoTextField.value)
    }
}