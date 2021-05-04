package fr.gravendev.application2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment()  {
    //commit de test
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_home, container, false)

        // creer une liste qui va stocker les offres
        val OfferList = arrayListOf<OfferModel>()

        //enregistrer une première offre dans notre liste
        OfferList.add(OfferModel(
            "Ps4",
            "Parfaite état",
            "https://cdn.pixabay.com/photo/2017/05/19/14/09/ps4-2326616__340.jpg",

            ))



        //recuperer le recyclerview
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalRecyclerView.adapter = OfferAdapter(R.layout.item_horizontal_offer)

        //recuperer le second recyclerview
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = OfferAdapter(R.layout.item_vertical_offer)
        verticalRecyclerView.addItemDecoration(OfferItemDecoretion())

        return view


    }
}