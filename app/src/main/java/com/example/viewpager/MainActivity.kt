package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.viewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.slider?.adapter = MoviesAdapter(this)

        //View Pager
        val tabLayoutMediator = binding?.tabSlider?.let {
            binding?.slider?.let { it1 ->
                TabLayoutMediator(
                    it,
                    it1,
                    TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                        when (position) {
                            0 -> {
                                tab.setIcon(R.drawable.play)
                                tab.text = getString(R.string.badBoys)
                            }
                            1 -> {
                                tab.setIcon(R.drawable.drama)
                                tab.text = getString(R.string.avengers)
                            }
                            2 -> {
                                tab.setIcon(R.drawable.cruelty)
                                tab.text = getString(R.string.fast)
                            }
                            3 -> {
                                tab.setIcon(R.drawable.emotions)
                                tab.text = getString(R.string.transformers)
                            }
                        }
                    })
            }
        }
        tabLayoutMediator?.attach()


    }

    }

