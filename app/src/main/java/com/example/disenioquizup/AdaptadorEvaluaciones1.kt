package com.example.disenioquizup

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorEvaluaciones1:RecyclerView.Adapter<AdaptadorEvaluaciones1.ViewHolder>() {

    val titulos= arrayOf("Contabilidad","Fisica","Matematica")
    val preguntas= arrayOf("20 Preguntas","10 Preguntas","15 Preguntas")
    val img= arrayOf(R.drawable.contabilidad,R.drawable.contabilidad,R.drawable.contabilidad)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitulo.text=titulos[i]
        viewHolder.itemPreguntas.text=preguntas[i]
        viewHolder.itemImg.setImageResource(img[i])
    }

    override fun getItemCount(): Int {
        return titulos.size
    }

    inner class ViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
        lateinit var itemImg:ImageView
        lateinit var itemTitulo:  TextView
        lateinit var itemPreguntas: TextView

        init{
            itemTitulo=itemview.findViewById(R.id.texto_item)
            itemPreguntas=itemview.findViewById(R.id.subtexto_item)
            itemImg=itemview.findViewById(R.id.item_image)
        }
    }
}