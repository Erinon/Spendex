package com.spendex.view.main

import android.os.Bundle
import com.spendex.R
import com.spendex.view.BaseActivity
import com.spendex.view.ScopedPresenter
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<MainContract.View>(), MainContract.View {

    private val presenter: MainContract.Presenter by inject()

    override fun getPresenter(): ScopedPresenter<MainContract.View> = presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
