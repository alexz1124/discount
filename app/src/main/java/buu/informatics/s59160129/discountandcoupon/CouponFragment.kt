package buu.informatics.s59160129.discountandcoupon

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentCouponBinding

/**
 * A simple [Fragment] subclass.
 */
class CouponFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentCouponBinding>(
            inflater,
            R.layout.fragment_coupon,
            container,
            false
        )
        val args = CouponFragmentArgs.fromBundle(arguments!!)
//        Log.i("Test", "${args.name}")
        Toast.makeText(context,"${args.name}", Toast.LENGTH_SHORT).show()

        val myWebView: WebView = binding.loadWeb
        myWebView.loadUrl("https://couponbangsean.netlify.com/")
        return binding.root
    }


}
