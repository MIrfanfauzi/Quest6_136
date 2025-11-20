package com.example.arsitekturmvm.viewmodel

import android.R
import androidx.lifecycle.ViewModel
import com.example.arsitekturmvm.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.flow.asStateFlow

class SiswaViewModel : ViewModel() {


    private val _statusUI = MutableStateFlow(Siswa())

    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2]
            )
        }
    }
}