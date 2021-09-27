package com.ripper.onboardingscreens.onboarding

import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ripper.onboardingscreens.HomeFragment
import com.ripper.onboardingscreens.R
import com.ripper.onboardingscreens.databinding.FragmentViewPageBinding
import com.ripper.onboardingscreens.onboarding.screens.FirstScreen
import com.ripper.onboardingscreens.onboarding.screens.SecondScreen
import com.ripper.onboardingscreens.onboarding.screens.ThirdScreen

class ViewPageFragment : Fragment() {
    private var _binding: FragmentViewPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =FragmentViewPageBinding.inflate(inflater, container, false)
        val view = binding.root



        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val  adapter = ViewPageAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter
        return view

    }

}