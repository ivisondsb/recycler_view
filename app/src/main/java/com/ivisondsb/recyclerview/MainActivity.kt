package com.ivisondsb.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ivisondsb.recyclerview.models.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var liveAdapter: LiveAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.liveAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {

        this.liveAdapter = LiveAdapter()

        rv.layoutManager = LinearLayoutManager(this@MainActivity)
        rv.adapter = this.liveAdapter
    }
}