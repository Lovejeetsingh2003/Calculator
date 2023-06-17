package com.example.calc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.calc.databinding.ActivityMainBinding
import java.lang.reflect.Array
import javax.xml.xpath.XPathExpression
import kotlin.collections.ArrayList




class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    private var result : Int = 0
    var value1 = 0
    var x = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn2Zero.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "00")
        }
        binding.btnZero.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "0")
        }
        binding.btnDot.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + ".")
        }
        binding.btnOne.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "1")
        }
        binding.btnTwo.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "2")
        }
        binding.btnThree.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "3")
        }
        binding.btnFour.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "4")
        }
        binding.btnFive.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "5")
        }
        binding.btnSix.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "6")
        }
        binding.btnSeven.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "7")
        }
        binding.btnEight.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "8")
        }
        binding.btnNine.setOnClickListener {
            binding.tvNumber.text = (binding.tvNumber.text.toString() + "9")
        }

        binding.btnAdd.setOnClickListener {
            value1 = binding.tvNumber.text.toString().toInt()
            result = value1.toString().toInt()
            binding.tvNumber.text = result.toString()
            result += value1
            binding.tvNumber.text = result.toString()
            binding.tvNumber.text = (binding.tvNumber.text.toString() + " + ")
        }
        binding.btnMin.setOnClickListener {
             value1  = binding.tvNumber.text.toString().toInt()
             x = value1.toString().toInt()
            result = x - value1
            value1 = 0
            binding.tvNumber.text = ""
            binding.tvNumber.text = result.toString()

            binding.tvNumber.text = (binding.tvNumber.text.toString() + " - ")
        }
        binding.btnMul.setOnClickListener {
            value1  = binding.tvNumber.text.toString().toInt()
            x = value1.toString().toInt()
            result = x * value1
            value1 = 0
            binding.tvNumber.text = ""
            binding.tvNumber.text = result.toString()
            binding.tvNumber.text = (binding.tvNumber.text.toString() + " × ")
        }
        binding.btnDiv.setOnClickListener {
            value1  = binding.tvNumber.text.toString().toInt()
            x = value1.toString().toInt()
            result = x / value1
            value1 = 0
            binding.tvNumber.text = ""
            binding.tvNumber.text = result.toString()
            binding.tvNumber.text = (binding.tvNumber.text.toString() + " ÷ ")
        }
        binding.btnClr.setOnClickListener {
            binding.tvNumber.text = ""
        }
        }}














