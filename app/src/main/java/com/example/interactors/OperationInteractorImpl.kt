package com.example.interactors

import com.example.interfaces.OperationInteractor
import com.example.interfaces.OperationPresenter

class OperationInteractorImpl(presenter: OperationPresenter) : OperationInteractor {
    private var presenter: OperationPresenter

    init {
        this.presenter = presenter
    }

    override fun sum(num1: Int, num2: Int) = presenter.showResult("${num1 + num2}")
    override fun substract(num1: Int, num2: Int) = presenter.showResult("${num1 - num2}")
    override fun multiply(num1: Int, num2: Int) = presenter.showResult("${num1 * num2}")
    override fun divide(num1: Int, num2: Int) = when {
            (num2 == 0) -> presenter.invalidOperation()
            else -> presenter.showResult("${num1 / num2}")
        }
}