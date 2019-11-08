package buu.informatics.s59160129.discountandcoupon


import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentHistoryBinding
import buu.informatics.s59160129.discountandcoupon.viewModel.LoadViewmodel

/**
 * A simple [Fragment] subclass.
 */
class HistoryFragment : Fragment() {
    private lateinit var viewModel: LoadViewmodel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHistoryBinding>(
            inflater,
            R.layout.fragment_history,
            container,
            false
        )
        viewModel = ViewModelProviders.of(this).get(LoadViewmodel::class.java)
        viewModel.test("yyy")
        val adapter = HistoryAdapter()
        binding.historyList.adapter = adapter
        setHasOptionsMenu(true)

        return binding.root
    }
}
