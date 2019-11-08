package buu.informatics.s59160129.discountandcoupon.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculateViewModel : ViewModel() {
    private val _aa = MutableLiveData<String>()
    val aa: LiveData<String>
        get() = _aa

    init {
        _aa.value = "850"
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
    fun calculate(): String {
        Log.i("Test","---${aa.value.toString()}")
        return aa.value.toString()
    }
}