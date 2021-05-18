package com.example.lab3_parteandres

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class ListJobApp : Fragment() {

    var usuarios: ArrayList<Usuario>? = null

    var lista: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var adaptador:AdaptadorCustom? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        usuarios = ArrayList()
        usuarios?.add(Usuario(nombre = "Ana", apellido = "Torroja", R.drawable.f1))
        usuarios?.add(Usuario(nombre = "Hernan", apellido = "Medford", R.drawable.f2))
        usuarios?.add(Usuario(nombre = "Luis", apellido = "Canales", R.drawable.f3))
        usuarios?.add(Usuario(nombre = "Bryan", apellido = "Ruiz", R.drawable.f4))
        usuarios?.add(Usuario(nombre = "Carla", apellido = "Brenes", R.drawable.f5))
        usuarios?.add(Usuario(nombre = "Hector", apellido = "Vargas", R.drawable.f6))
        usuarios?.add(Usuario(nombre = "Carlos", apellido = "Gomez", R.drawable.f7))
        usuarios?.add(Usuario(nombre = "Andrés", apellido = "Salas", R.drawable.f8))
        usuarios?.add(Usuario(nombre = "María", apellido = "Jimenez", R.drawable.f9))
        usuarios?.add(Usuario(nombre = "Valeria", apellido = "Zuñiga", R.drawable.f10))

        /*lista = findViewById(R.id.rvLista)
        layoutManager = LinearLayoutManager(this)
        adaptador = AdaptadorCustom(usuarios!!)
        lista?.layoutManager = layoutManager
        lista?.adapter = adaptador*/

        val root = inflater.inflate(R.layout.fragment_list_job_app, container, false)
        lista = root.findViewById(R.id.rvLista)
        lista?.layoutManager = LinearLayoutManager(context)
        lista?.adapter = AdaptadorCustom(usuarios!!)

        return root
    }


}