package buu.informatics.s59160129.discountandcoupon.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel

class CalculateViewModel(original: Int = 0, discount: Int = 0, boolean: Boolean) : ViewModel(){
    init {
        Log.i("CalculateViewModel", "LoadViewModel created!")
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("CalculateViewModel", "LoadViewModel destroyed!")
    }
}