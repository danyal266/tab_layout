package com.example.whatsapp_clone.Fragment.fragment_adapter

import android.os.Parcel
import android.os.Parcelable
import android.telecom.Call
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.whatsapp_clone.Fragment.Calles_Fragment
import com.example.whatsapp_clone.Fragment.Chats_Fragment
import com.example.whatsapp_clone.Fragment.Status_Fragment


class viewpagerAdapter(fragmentManager: FragmentManager,lifecycle:Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
     return   when (position) {
            0 -> {
                Chats_Fragment()
            }
            1 -> {
                Status_Fragment()
            }
            else -> {
                Calles_Fragment()
            }


        }

    }
    }






