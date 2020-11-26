package com.android.mvp_architecture_kotlin.widget.recyclerview.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.mvp_architecture_kotlin.R
import com.android.mvp_architecture_kotlin.widget.recyclerview.CustomRecyclerView
import com.android.mvp_architecture_kotlin.widget.recyclerview.item.NoneItem

class NoneViewHolder(viewGroup: ViewGroup) :
    CustomRecyclerView.ViewHolder<NoneItem>(newInstance(viewGroup)) {
    override fun bind(item: NoneItem) = Unit

    companion object {
        fun newInstance(viewGroup: ViewGroup): View {
            return LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_none, viewGroup, false)
        }
    }
}
