package com.spendex.view

import androidx.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import java.lang.ref.WeakReference

abstract class BasePresenter<View> : ScopedPresenter<View> {

    private var view: WeakReference<View>? = null
    private val disposables = CompositeDisposable()

    override fun setView(view: View) {
        this.view = WeakReference(view)
    }

    protected fun getView(): View? = view?.get()

    protected fun addDisposable(disposable: Disposable) = disposables.add(disposable)

    private fun disposeAll() = disposables.clear()

    @CallSuper
    override fun activate() {
    }

    @CallSuper
    override fun deactivate() = disposeAll()
}
