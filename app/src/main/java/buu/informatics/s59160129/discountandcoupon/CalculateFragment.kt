package buu.informatics.s59160129.discountandcoupon


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import buu.informatics.s59160129.discountandcoupon.data.ValueCalculate
import buu.informatics.s59160129.discountandcoupon.databinding.ActivityMainBinding
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentCalculateBinding
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentHomeBinding
import buu.informatics.s59160129.discountandcoupon.viewModel.CalculateViewModel
import buu.informatics.s59160129.discountandcoupon.viewModel.LoadViewmodel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_calculate.*

/**
 * A simple [Fragment] subclass.
 */
class CalculateFragment : Fragment() {
    private val myValue: ValueCalculate = ValueCalculate()
    private lateinit var viewModel: CalculateViewModel


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
        val args = CalculateFragmentArgs.fromBundle(arguments!!)
//        Log.i("Test", "$args")
        Toast.makeText(context, "${args.name}", Toast.LENGTH_SHORT).show()
        viewModel = ViewModelProviders.of(this).get(CalculateViewModel::class.java)
        binding.btnOk.setOnClickListener {
            if (binding.inputOriginalPrice.text.toString().length != 0 && binding.inputDiscount.text.toString().length != 0) {
//                Log.i("Test", "FFF")
                var result = calculate(
                    binding.inputOriginalPrice.text.toString().toInt(),
                    binding.inputDiscount.text.toString().toInt(), true
                )
                //binding.textFinalPrice.setText(result.toString())
                //myValue.finalPrice = result.toString()
                viewModel.setFinalPrice(result.toString())
                var save = calculate(
                    binding.inputOriginalPrice.text.toString().toInt(),
                    binding.inputDiscount.text.toString().toInt(), false
                )
//                binding.textYourSave.setText(save.toString())
//                myValue.yourSave = result.toString()
                viewModel.setSavePrice(save.toString())
                val snack = Snackbar.make(it, "Save to history", Snackbar.LENGTH_LONG)
                snack.show()
            } else {

            }
            input_originalPrice.text.clear()
            input_discount.text.clear()
            binding.invalidateAll()
        }

        binding.myValue = myValue
        binding.myFinal = viewModel
        return binding.root
    }

    fun calculate(original: Int = 0, discount: Int = 0, boolean: Boolean): Int {
        var sum = (original * discount) / 100
        var save = sum
        sum = original - sum
        // Log.i("Test", save.toString() + "=" + sum.toString())
        if (boolean) {
            return sum
        }
        return save
    }
}
