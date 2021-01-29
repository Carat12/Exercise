package com.example.week14day5_gorest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.week14day5_gorest.models.data.User
import com.example.week14day5_gorest.models.network.UserRepository
import javax.inject.Inject

class UserViewModel @Inject constructor(val repository: UserRepository): ViewModel() {

    val userList : LiveData<ArrayList<User>> by lazy {
        liveData {
            emit(repository.getUsers().data)
        }
    }
}