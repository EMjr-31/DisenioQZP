package com.example.disenioquizup

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import fragamentos.MenuInicioFragment

class MenuUsuario : AppCompatActivity(), MenuInicioFragment.OnFragmentInteractionListener {
    lateinit var FragmentInicio: MenuInicioFragment;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FragmentInicio= MenuInicioFragment()

        supportFragmentManager.beginTransaction().replace(R.id.fragmentMenu, FragmentInicio).commit()

    }
}