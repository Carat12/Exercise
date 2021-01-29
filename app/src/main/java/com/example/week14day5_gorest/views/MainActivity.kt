package com.example.week14day5_gorest.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week14day5_gorest.R
import com.example.week14day5_gorest.di.DaggerAppComponent
import com.example.week14day5_gorest.viewmodel.MyViewModelFactory
import com.example.week14day5_gorest.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: MyViewModelFactory
    private val viewModel by viewModels<UserViewModel> { viewModelFactory }

    private val userAdapter by lazy { UserAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {

        DaggerAppComponent.create().inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        recycler_view.apply {
            adapter = userAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
        }

        viewModel.userList.observe(this, {
            userAdapter.setData(it)
        })
    }
}