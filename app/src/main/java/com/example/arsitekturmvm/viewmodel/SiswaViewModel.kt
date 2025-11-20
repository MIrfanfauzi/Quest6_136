package com.example.arsitekturmvm.viewmodel

import android.R
import androidx.lifecycle.ViewModel
import com.example.arsitekturmvm.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update



class SiswaViewModel: ViewModel() {
    private val _StatusUI = MutableStateFlow(value = Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls:MutableStateList<R.string>) {
        _StatusUI.update { statusSaatIni ->
        statusSaatIni.copy(name = ls[0], gender = ls[1], alamat = ls[2])
    }
    }


}