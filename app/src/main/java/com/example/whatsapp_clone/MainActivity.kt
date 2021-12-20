package com.example.whatsapp_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsapp_clone.Fragment.Calles_Fragment
import com.example.whatsapp_clone.Fragment.Chats_Fragment
import com.example.whatsapp_clone.Fragment.Status_Fragment

import com.example.whatsapp_clone.Fragment.fragment_adapter.viewpagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val adapter = viewpagerAdapter(supportFragmentManager,lifecycle)
        view_pager.adapter = adapter
        TabLayoutMediator(tab_layout,view_pager){tab,position->
            when(position){
               0->{
                   tab.text = "Chat"
               }
                1->{
                    tab.text = "Status"
                }
                else->{
                    tab.text = "Calls"
                }
            }

        }.attach()
    }

}