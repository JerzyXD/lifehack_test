package com.jerzyxd.lifehack_test.ui.screens.companies

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.jerzyxd.lifehack_test.BuildConfig.BASE_URL
import com.jerzyxd.lifehack_test.R
import com.jerzyxd.lifehack_test.domain.models.CompanyModel
import kotlinx.android.synthetic.main.item_company_list.view.*

class CompaniesAdapter(
    private val list: List<CompanyModel>,
    private val context: Context,
    private val callback: (String) -> Unit
    ): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return CompaniesHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_company_list, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as CompaniesHolder).bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class CompaniesHolder(itemView: View) : ViewHolder(itemView) {

        fun bind(companyModel: CompanyModel) {

            val companyImage: ImageView = itemView.company_image
            val companyName: TextView = itemView.company_name
            val companyCard: CardView = itemView.company_card

            Glide.with(context).load(BASE_URL + companyModel.img).into(companyImage)
            companyName.text = companyModel.name

            companyCard.setOnClickListener {
                callback(companyModel.id)
            }
        }
    }
}