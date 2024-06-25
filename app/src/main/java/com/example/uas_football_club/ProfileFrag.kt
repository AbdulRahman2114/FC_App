package com.example.uas_football_club

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ProfileFrag : Fragment() {
    private lateinit var profArrayList: ArrayList<Profile>
    lateinit var imgProfile: Array<Int>
    lateinit var nameProfile: Array<String>
    lateinit var descProfile: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val img_profile = view.findViewById<ImageView>(R.id.img_item_photo)
        img_profile.setImageResource(R.drawable.menu_profile)
        val tv_name = view.findViewById<TextView>(R.id.tv_item_name)
        tv_name.text= getText(R.string.abid)
        val tv_desc = view.findViewById<TextView>(R.id.tv_item_description)
        tv_desc.text = getText(R.string.desc_abid)

    }

//    private fun dataInitialize(){
//        profArrayList = arrayListOf<Profile>()
//
//        imgProfile = arrayOf(
//            R.drawable.profile_icon
//        )
//        nameProfile = arrayOf(
//            getString(R.string.abid)
//        )
//        descProfile = arrayOf(
//            getString(R.string.desc_abid)
//        )
//        for (i in imgProfile.indices){
//            val profile = Profile(imgProfile[i],nameProfile[i], descProfile[i])
//            profArrayList.add(profile)
//        }
//    }
}