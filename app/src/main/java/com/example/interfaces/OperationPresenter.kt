package com.example.interfaces

interface OperationPresenter {
    fun showResult(result: String)
    fun invalidOperation()
    fun sum(num1: Int, num2: Int)
    fun substract(num1: Int, num2: Int)
    fun multiply(num1: Int, num2: Int)
    fun divide(num1: Int, num2: Int)
}