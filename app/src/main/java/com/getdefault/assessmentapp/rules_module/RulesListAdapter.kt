package com.getdefault.assessmentapp.rules_module

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getdefault.assessmentapp.R

class RulesListAdapter(private val rulesList : Array<String>) : RecyclerView.Adapter<RulesListAdapter.RulesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RulesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rules_item, parent, false)
        return RulesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RulesViewHolder, position: Int) {
        val rule = rulesList[position]
        holder.rulesText.text = rule
    }

    override fun getItemCount() = rulesList.size

    class RulesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rulesText : TextView = itemView.findViewById(R.id.tv_item_rules)
    }
}