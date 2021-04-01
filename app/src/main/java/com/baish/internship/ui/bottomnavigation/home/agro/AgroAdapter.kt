package com.baish.internship.ui.bottomnavigation.home.agro

import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.baish.internship.R
import com.baish.internship.databinding.ItemRecyclerBinding
import com.baish.internship.utils.IntFaceClickRecycler
import com.baish.internship.utils.setCornerRadius
import kotlinx.parcelize.Parcelize
import kotlin.random.Random

class AgroAdapter(private val listener: IntFaceClickRecycler) :
    RecyclerView.Adapter<AgroViewHolder>() {

    private val data = arrayListOf<Dataclass>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgroViewHolder {
        return AgroViewHolder.create(parent, listener)
    }

    fun update(data: List<Dataclass>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: AgroViewHolder, position: Int) {
        holder.bind(data[position], listener)
    }

    override fun getItemCount() = data.size
}

class AgroViewHolder(private val bindnig: ItemRecyclerBinding) :
    RecyclerView.ViewHolder(bindnig.root) {
    fun bind(data: Dataclass, listener: IntFaceClickRecycler) {
        itemView.setOnClickListener {
            listener.gotoTheDetails(data)
        }

        bindnig.priceNumber.text = bindnig.root.context.getString(data.priceD)
        bindnig.nameOfFoods.text = bindnig.root.context.getString(data.title)
        bindnig.imageItem.setBackgroundResource(data.image)
        bindnig.itemCity.text = bindnig.root.context.getString(data.city)
        bindnig.imageItem.layoutParams.height = getRandomRange(250,250)

        val radius =
            itemView.context.resources.getDimension(R.dimen.material_filled_edittext_font_1_3_padding_bottom)
        bindnig.imageItem.setCornerRadius(
            topRight = radius,
            topLeft = radius,
            bottomRight = radius,
            bottomLeft = radius
        )
    }

    private val random = java.util.Random()

    private fun getRandomRange(max : Int, min : Int): Int{
        return random.nextInt(max - min + min) + min

    }

    companion object {
        fun create(parent: ViewGroup, listener: IntFaceClickRecycler): AgroViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler, parent, false)
            val binding = ItemRecyclerBinding.bind(view)
            return AgroViewHolder(binding)
        }
    }
}

@Parcelize
data class Dataclass(
    val priceD: Int,
    val image: Int,
    val title: Int,
    val city: Int,
    val description: Int,
    val checked : Int,
    val date : Int

) : Parcelable