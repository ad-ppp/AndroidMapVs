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

            Log.d(TAG, sparse.toString())

            Log.d(TAG, "count " + count + " consume time " + (System.currentTimeMillis() - time) + "ms")
            count *= 100
        }

        tvRandom.setOnClickListener {

        }

        tvDelete.setOnClickListener {
            val array = SparseArray<Int>()
            for (i in 9 downTo 0) {
                array.put(i * 2, i)
            }

            val v = 5
            val size = array.size()
            for (i in size - 1 downTo 0) {
                if (v < i) {
                    Log.d(TAG, "value ${array.valueAt(i)} , toString: $array")
                    array.remove(array.keyAt(i))
                }

                if (v == i) {
                    break
                }
            }
            Log.d(TAG, "result $array")
            Log.d(TAG, "get key = 100 not add to sparse = ${array[100]}")
        }
    }
}
