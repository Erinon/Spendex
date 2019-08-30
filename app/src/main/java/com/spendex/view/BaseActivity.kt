package com.spendex.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<View> : AppCompatActivity() {

    abstract fun getPresenter(): ScopedPresenter<View>

    override fun onStart() {
        super.onStart()

        getPresenter().activate()
    }

    override fun onStop() {
        getPresenter().deactivate()

        super.onStop()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getPresenter().setView(this as View)
    }
}
