package com.harjot.activityfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import com.harjot.activityfragments.databinding.ActivityFragmentBinding
import java.util.concurrent.locks.Condition

class FragmentActivity : AppCompatActivity() {
    lateinit var activityInterface: ActivityInterface
    lateinit var activityInterface1: ActivityInterface1
    lateinit var activityInterface2: ActivityInterface2
    lateinit var binding: ActivityFragmentBinding
    private  val TAG = "FragmentActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }

    public fun fragmentFunction() {
        System.out.println("in fragment function")
        Toast.makeText(
            this,
            "This is invoked from first fragment",
            Toast.LENGTH_SHORT
        )
            .show()
    }


    fun Red(view: View) {
        binding?.cb1stFragment?.setOnClickListener {
            if (binding?.rbRed?.isEnabled == true && binding?.cb1stFragment?.isEnabled == true) {
                activityInterface.colorChange(1)
            }
        }

            binding?.cb2ndFragment?.setOnClickListener{
                if(binding?.rbRed?.isEnabled==true && binding?.cb2ndFragment?.isEnabled==true){
                    activityInterface1.colorChange(1)
                }
            }
            binding?.cb3rdFragment?.setOnClickListener{
                if(binding?.rbRed?.isEnabled==true && binding?.cb3rdFragment?.isEnabled==true){
                    activityInterface2.colorChange(1)
                }
            }


    }

    fun Green(view: View) {
        binding?.cb1stFragment?.setOnClickListener {
            if (binding?.rbGreen?.isEnabled == true && binding?.cb1stFragment?.isEnabled == true) {
                activityInterface.colorChange(2)
            } else if (binding?.rbRed?.isEnabled == false) {
                binding?.cb1stFragment?.setChecked(false)
            }
        }

            binding?.cb2ndFragment?.setOnClickListener{
                if(binding?.rbGreen?.isEnabled==true && binding?.cb2ndFragment?.isEnabled==true){
                    activityInterface1.colorChange(2)
                }
            }
            binding?.cb3rdFragment?.setOnClickListener{
                if(binding?.rbGreen?.isEnabled==true && binding?.cb3rdFragment?.isEnabled==true){
                    activityInterface2.colorChange(2)
                }
            }



    }

    fun Yellow(view: View) {
        binding?.cb1stFragment?.setOnClickListener {
            if (binding?.rbYellow?.isEnabled == true && binding?.cb1stFragment?.isEnabled == true) {
                activityInterface.colorChange(3)
            }
        }

            binding?.cb2ndFragment?.setOnClickListener{
                if(binding?.rbYellow?.isEnabled==true && binding?.cb2ndFragment?.isEnabled==true){
                    activityInterface1.colorChange(3)
                }
            }
            binding?.cb3rdFragment?.setOnClickListener{
                if(binding?.rbYellow?.isEnabled==true && binding?.cb3rdFragment?.isEnabled==true){
                    activityInterface2.colorChange(3)
                }
            }



    }

}