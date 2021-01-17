package com.example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.R
import com.example.databinding.ActivityMainBinding
import com.example.interfaces.OperationPresenter
import com.example.interfaces.OperationView
import com.example.presenters.OperationPresenterImpl
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), OperationView {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: OperationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = resources.getText(R.string.str_title)
        presenter = OperationPresenterImpl(this)
        events()
    }


    fun events() {
        binding.btnSum.setOnClickListener {
            try {
                val num1: Int = binding.edtNum1.text.toString().toInt()
                val num2: Int = binding.edtNum2.text.toString().toInt()
                presenter.sum(num1, num2)
            } catch (e: NumberFormatException) {
                invalidOperation()
            }
        }
        binding.btnSub.setOnClickListener {
            try {
                val num1: Int = binding.edtNum1.text.toString().toInt()
                val num2: Int = binding.edtNum2.text.toString().toInt()
                presenter.substract(num1, num2)
            } catch (e: NumberFormatException) {
                invalidOperation()
            }
        }
        binding.btnMul.setOnClickListener {
            try {
                val num1: Int = binding.edtNum1.text.toString().toInt()
                val num2: Int = binding.edtNum2.text.toString().toInt()
                presenter.multiply(num1, num2)
            } catch (e: NumberFormatException) {
                invalidOperation()
            }
        }
        binding.btnDiv.setOnClickListener {
            try {
                val num1: Int = binding.edtNum1.text.toString().toInt()
                val num2: Int = binding.edtNum2.text.toString().toInt()
                presenter.divide(num1, num2)
            } catch (e: NumberFormatException) {
                invalidOperation()
            }
        }
    }

    override fun showResult(result: String) {
        binding.txtResult.text = result
    }

    override fun invalidOperation() {
        Toast.makeText(this, "Operación invalida", Toast.LENGTH_SHORT).show()
    }
}