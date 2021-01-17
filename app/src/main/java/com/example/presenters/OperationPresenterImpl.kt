package com.example.presenters

import com.example.interactors.OperationInteractorImpl
import com.example.interfaces.OperationInteractor
import com.example.interfaces.OperationPresenter
import com.example.interfaces.OperationView

class OperationPresenterImpl(view: OperationView) : OperationPresenter {
    private var view: OperationView
    private var interactor: OperationInteractor

    init {
        this.view = view
        this.interactor = OperationInteractorImpl(this)
    }

    override fun showResult(result: String) {
        if (view != null) view.showResult(result)
    }

    override fun invalidOperation() {
        if (view != null) view.invalidOperation()
    }

    override fun sum(num1: Int, num2: Int) {
        if (interactor != null) interactor.sum(num1, num2)
    }

    override fun substract(num1: Int, num2: Int) {
        if (interactor != null) interactor.substract(num1, num2)
    }

    override fun multiply(num1: Int, num2: Int) {
        if (interactor != null) interactor.multiply(num1, num2)
    }

    override fun divide(num1: Int, num2: Int) {
        if (interactor != null) interactor.divide(num1, num2)
    }
}