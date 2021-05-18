package com.example.lab3_parteandres

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_list_job_app.view.*
import kotlinx.android.synthetic.main.rv_template.view.*

class AdaptadorCustom(items:ArrayList<Usuario>): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>() {

    var items:ArrayList<Usuario>? = null

    var viewHolder:ViewHolder? = null

    init {
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorCustom.ViewHolder {
        val vista = LayoutInflater.from(parent?.context).inflate(R.layout.rv_template, parent, false)

        viewHolder = ViewHolder(vista)

        return viewHolder!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.nombre?.text = item?.nombre
        holder.apellido?.text = item?.apellido
        holder.foto?.setImageResource(item?.foto!!)
    }

    override fun getItemCount(): Int {
        return this.items?.count()!!
    }

    class ViewHolder(vista: View): RecyclerView.ViewHolder(vista){
        var vista = vista

        var foto:ImageView? = null

        var nombre:TextView? = null
        var apellido:TextView? = null

        init {
            foto = vista.ivFoto
            nombre = vista.tvNombre
            apellido = vista.tvApellido
        }
    }

}