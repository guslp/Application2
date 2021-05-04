package fr.gravendev.application2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

import fr.gravendev.application2.R

class OfferAdapter(private val layoutId: Int) : RecyclerView.Adapter<OfferAdapter.ViewHolder>(){

    //boite pour ranger tous les composanta à controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        //image de l'offre
        val OfferImage = view.findViewById<ImageView>(R.id.image_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(layoutId,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int = 5
}