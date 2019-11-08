package buu.informatics.s59160129.discountandcoupon.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculateViewModel : ViewModel() {
    private val _final = MutableLiveData<String>()
    val final: LiveData<String>
        get() = _final

    private val _save = MutableLiveData<String>()
    val save: LiveData<String>
        get() = _save

    init {
        _final.value = "0"
        _save.value = "0"
        Log.i("CalculateViewModel", "CalculateViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("CalculateViewModel", "CalculateViewModel destroyed!")
    }

    //    fun calculate(original: Int = 0, discount: Int = 0, boolean: Boolean): Int {
//        var sum = (original * discount) / 100
//        var save = sum
//        sum = original - sum
//        Log.i("Test", save.toString() + "=" + sum.toString())
//        if (boolean) {
//            return sum
//        }
//        return save
//    }
    fun setFinalPrice(finalPrice:String){
//        Log.i("Test","---${final.value.toString()}")
        _final.value = finalPrice
    }
    fun setSavePrice(savePrice:String){
//        Log.i("Test","---${final.value.toString()}")
        _save.value = savePrice
    }
}