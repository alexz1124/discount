package buu.informatics.s59160129.discountandcoupon


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160129.discountandcoupon.databinding.ActivityMainBinding
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentCalculateBinding
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass.
 */
class CalculateFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentCalculateBinding>(
            inflater,
            R.layout.fragment_calculate,
            container,
            false
        )
        binding.btnOk.setOnClickListener {
            if (binding.inputOriginalPrice.text.toString().length != 0 && binding.inputDiscount.text.toString().length != 0) {
//                Log.i("Test", "FFF")
                var result = calculate(
                    binding.inputOriginalPrice.text.toString().toInt(),
                    binding.inputDiscount.text.toString().toInt(), true
                )
                binding.textFinalPrice.setText(result.toString())
                var save = calculate(
                    binding.inputOriginalPrice.text.toString().toInt(),
                    binding.inputDiscount.text.toString().toInt(), false
                )
                binding.textYourSave.setText(save.toString())
                val snack = Snackbar.make(it,"Save to history",Snackbar.LENGTH_LONG)
                snack.show()
                binding.invalidateAll()
            }else{
                
            }
        }
        return binding.root
    }
    fun calculate(original: Int = 0, discount: Int = 0, boolean: Boolean): Int {
        var sum = (original * discount) / 100
        var save = sum
        sum = original - sum
        Log.i("Test", save.toString() + "=" + sum.toString())
        if (boolean) {
            return sum
        }
        return save
    }
}
