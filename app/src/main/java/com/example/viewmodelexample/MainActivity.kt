package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel
//    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this ,R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

    //加在activity layout那
//        binding.addButton.setOnClickListener {
//            viewModel.addone()
//            //binding.showText.text = viewModel.counter.toString()
//        }
//        binding.resetButton.setOnClickListener {
//            viewModel.resest()
//            //binding.showText.text = viewModel.counter.toString()
//        }
    }
}