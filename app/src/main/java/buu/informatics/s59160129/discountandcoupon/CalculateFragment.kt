package buu.informatics.s59160129.discountandcoupon


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentCalculateBinding
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentHomeBinding

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
        return binding.root
    }


}
