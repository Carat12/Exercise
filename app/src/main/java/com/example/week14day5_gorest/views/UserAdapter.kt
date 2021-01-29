package com.example.week14day5_gorest.views

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.week14day5_gorest.databinding.ItemUserBinding
import com.example.week14day5_gorest.models.data.User

class UserAdapter(val context: Context) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    private var mList = ArrayList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(it: ArrayList<User>) {
        mList = it
        notifyDataSetChanged()
    }

    inner class ViewHolder(val itemUserBinding: ItemUserBinding) : RecyclerView.ViewHolder(itemUserBinding.root) {
        fun bind(user: User) {
              itemUserBinding.user = user
        }
    }
}
