package com.example.uas_123

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(ContactUIState1())
    val stateUI: StateFlow<ContactUIState1> = _stateUI.asStateFlow()

    fun setContact(listData: MutableList<String>){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = listData[0],
                alamat = listData[1],
                noTelp = listData[2],
            )
        }
    }
}