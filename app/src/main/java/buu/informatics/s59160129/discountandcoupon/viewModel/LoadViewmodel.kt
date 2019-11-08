package buu.informatics.s59160129.discountandcoupon.viewModel

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoadViewmodel : ViewModel(){
    var aa = MutableLiveData<String>()
    init {
        Log.i("LoadViewModel", "LoadViewModel created!")
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("LoadViewModel", "LoadViewModel destroyed!")
    }
    fun test(count :String){
        aa.value += count
        Log.i("LoadViewModel",aa.value)
    }
}