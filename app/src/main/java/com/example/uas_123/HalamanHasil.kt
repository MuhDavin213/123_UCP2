package com.example.uas_123

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun HalamanDua(
    contactUiState: ContactUIState1,
    onClickBackButton: () -> Unit
) {
    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(text = "Nama")
        Text(text = contactUiState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Alamat")
        Text(text = contactUiState.alamat)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "No Telepon")
        Text(text = contactUiState.noTelp)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { onClickBackButton }) {
            Text(text = stringResource(id = R.string.btn_back))

        }
    }
}