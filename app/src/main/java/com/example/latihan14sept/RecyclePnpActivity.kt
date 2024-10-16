package com.example.latihan14sept

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan14sept.adapter.PnpAdapter
import com.example.latihan14sept.model.Mocklist
import com.example.latihan14sept.model.ModelPnp

class RecyclePnpActivity : AppCompatActivity() {

    private lateinit var rv_pnp : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_pnp)

        rv_pnp = findViewById(R.id.rv_pnp)

        rv_pnp.layoutManager = GridLayoutManager(this, 1)
        val adapter = PnpAdapter(Mocklist.getModel() as ArrayList<ModelPnp>, this)
        rv_pnp.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_wisata)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}