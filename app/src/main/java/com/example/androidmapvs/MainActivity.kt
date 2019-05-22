package com.example.androidmapvs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.util.SparseArray
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    var count: Long = 1L
    var time = 0L
    val sparse = SparseArray<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvConfirm.setOnClickListener {
            sparse.clear()
            time = System.currentTimeMillis()
            for (i in count downTo 0) {
                sparse.put(i.toInt(), i.toString())
            }

//            val l = sparse.size()
//            Log.d(TAG, "size : $l ")
//            for (i in 0 until l) {
//                Log.d(TAG, "[" + sparse.keyAt(i) + " , " + sparse.valueAt(i) + "]")
//            }

            Log.d(TAG, sparse.toString())

            Log.d(TAG, "count " + count + " consume time " + (System.currentTimeMillis() - time) + "ms")
            count *= 100
        }

        tvRandom.setOnClickListener {

        }
    }
}
