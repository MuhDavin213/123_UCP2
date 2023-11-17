package com.example.uas_123

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClick: (MutableList<String>) -> Unit

) {
    var namaTxt by rememberSaveable {
        mutableStateOf("")
    }
    var nimTxt by rememberSaveable {
        mutableStateOf("")
    }
    var konsenTxt by rememberSaveable {
        mutableStateOf("")
    }
    var judulTxt by rememberSaveable {
        mutableStateOf("")
    }


    var listDataTxt: MutableList<String> = mutableListOf(namaTxt, nimTxt, konsenTxt,judulTxt)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Data Pelanggan",
            modifier = Modifier.padding(20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = namaTxt,
            onValueChange = {
                namaTxt = it
            },
            label = { Text(text = "Nama") }
        )
        OutlinedTextField(
            value = nimTxt,
            onValueChange = {
                nimTxt = it
            },
            label = { Text(text = "No Telepon") }
        )
        OutlinedTextField(
            value = konsenTxt,
            onValueChange = {
                konsenTxt = it
            },
            label = { Text(text = "Alamat") }
        )

        OutlinedTextField(
            value = judulTxt,
            onValueChange = {
                judulTxt = it
            },
            label = { Text(text = "Alamat") }
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .weight(1f, false),
            verticalAlignment = Alignment.Bottom
        ) {
            Button(
                onClick = { onSubmitButtonClick(listDataTxt) },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                Text(text = "Next")

            }
        }
    }
}