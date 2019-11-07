package buu.informatics.s59160129.discountandcoupon


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160129.discountandcoupon.databinding.FragmentHomeBinding
import buu.informatics.s59160129.discountandcoupon.viewModel.LoadViewmodel

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    private lateinit var viewModel: LoadViewmodel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )
        Log.i("LoadFragment", "Called ViewModelProviders.of")
        viewModel = ViewModelProviders.of(this).get(LoadViewmodel::class.java)


        binding.btnCalculate.setOnClickListener{  view : View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_calculateFragment) }

        binding.btnCoupon.setOnClickListener{  view : View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_couponFragment) }
        setHasOptionsMenu(true)
        Log.i("HomeFragment", "onCreateView called")
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.i("HomeFragment", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("HomeFragment", "onCreate called")
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("HomeFragment", "onActivityCreated called")
    }
    override fun onStart() {
        super.onStart()
        Log.i("HomeFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("HomeFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("HomeFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("HomeFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("HomeFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("HomeFragment", "onDetach called")
    }
}