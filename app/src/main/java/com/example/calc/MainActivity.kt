package com.example.calc

import android.annotation.SuppressLint
import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.calc.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression
import org.mozilla.javascript.Context
import org.mozilla.javascript.Scriptable
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var data  : String


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn2Zero.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "00"
        }
        binding.btnZero.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "0"
        }
        binding.btnDot.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = "$data."
        }
        binding.btnOne.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "1"
        }
        binding.btnTwo.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "2"
        }
        binding.btnThree.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "3"
        }
        binding.btnFour.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "4"
        }
        binding.btnFive.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "5"
        }
        binding.btnSix.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "6"
        }
        binding.btnSeven.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "7"
        }
        binding.btnEight.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "8"
        }
        binding.btnNine.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = data + "9"
        }

        binding.btnAdd.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = "$data + "
        }
        binding.btnMin.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = "$data - "
        }
        binding.btnMul.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = "$data × "
        }
        binding.btnDiv.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = "$data ÷ "
        }
        binding.btnPercentage.setOnClickListener {
            data = binding.tvNumber.text.toString()
            binding.tvNumber.text = "$data % "
        }
        binding.btnClr.setOnClickListener {
            binding.tvNumber.text = ""
        }
        binding.btnDel.setOnClickListener {

            var str: String = binding.tvNumber.text.toString()
            if (str != "") {
                str = str.substring(0, str.length - 1)
                binding.tvNumber.text = str }
        }
        binding.btnResult.setOnClickListener {

            showResult()

        }
    }




        private fun getInputExpression(): String {
            var expression = binding.tvNumber.text.replace(Regex("÷"), "/")
            expression = expression.replace(Regex("×"), "*")
            expression = expression.replace(Regex("%"), "/100")
            return expression
        }

         private fun showResult() {
             try {
                 val expression = getInputExpression()
                 val result = Expression(expression).calculate()
                 if (result.isNaN()) {
                     binding.tvNumber.text = ""
                 } else {
                     binding.tvNumber.text = DecimalFormat("0.######").format(result).toString()
                 }
             } catch (e: Exception) {
                 binding.tvNumber.text = ""
             }
         }}

















