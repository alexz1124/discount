package buu.informatics.s59160129.discountandcoupon.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel

class LoadViewmodel : ViewModel(){
    init {
        Log.i("LoadViewModel", "LoadViewModel created!")
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("LoadViewModel", "LoadViewModel destroyed!")
    }
}