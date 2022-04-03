package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var profileAdapter: ProfileAdapter
    val datas = mutableListOf<ProfileData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView = findViewById<RecyclerView>(R.id.rv_profile)

        initRecycler(recyclerView)
    }
    private fun initRecycler(recyclerView : RecyclerView) {
        profileAdapter = ProfileAdapter(this)
        recyclerView.adapter = profileAdapter
        datas.apply {
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "mary", age = 24))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "jenny", age = 26))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "jhon", age = 27))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "ruby", age = 21))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "yuna", age = 23))
            profileAdapter.datas = datas
            profileAdapter.notifyDataSetChanged()
        }
    }
}