package com.harjot.activityfragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.harjot.activityfragments.databinding.FragmentSecondBinding
import com.harjot.activityfragments.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ThirdFragment : Fragment(), ActivityInterface2 {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var binding: FragmentThirdBinding? = null
    lateinit var fragmentActivity : FragmentActivity
    private  val TAG = "ThirdFragment"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentActivity = activity as FragmentActivity
        fragmentActivity.activityInterface2 = this
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding?.root
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun colorChange(color:Int) {
       when(color) {
           1-> binding?.rlRelative3?.setBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.red))
           2->binding?.rlRelative3?.setBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.green))
           3->binding?.rlRelative3?.setBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.yellow))
       }
    }
}