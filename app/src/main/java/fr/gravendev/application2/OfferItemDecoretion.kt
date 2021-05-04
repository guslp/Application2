package fr.gravendev.application2

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class OfferItemDecoretion : RecyclerView.ItemDecoration(){

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.bottom = 20
    }
}