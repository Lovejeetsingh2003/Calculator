package com.example.calc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    lateinit var tvCalculator : TextView
    lateinit var tvNumber : TextView
    lateinit var tlCalculator : TableLayout
    lateinit var trRow1 : TableRow
    lateinit var trRow2 : TableRow
    lateinit var trRow3 : TableRow
    lateinit var trRow4 : TableRow
    lateinit var trRow5 : TableRow
    lateinit var btnPercentage : Button
    lateinit var btnClr : Button
    lateinit var btnDel: Button
    lateinit var btnDiv: Button
    lateinit var btnOne: Button
    lateinit var btnTwo: Button
    lateinit var btnThree: Button
    lateinit var btnFour: Button
    lateinit var btnFive: Button
    lateinit var btnSix: Button
    lateinit var btnSeven: Button
    lateinit var btnEight: Button
    lateinit var btnNine: Button
    lateinit var btnZero: Button
    lateinit var btn_Zero: Button
    lateinit var btnDot: Button
    lateinit var btnResult: Button
    lateinit var btnAdd: Button
    lateinit var btnMul: Button
    lateinit var btnMin: Button

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCalculator = findViewById(R.id.tvCalculator)
        tvNumber = findViewById(R.id.tvNumber)
        tlCalculator = findViewById(R.id.tlCalculator)
        trRow1 = tlCalculator.findViewById(R.id.trRow1)
        trRow2 = tlCalculator.findViewById(R.id.trRow2)
        trRow3 = tlCalculator.findViewById(R.id.trRow3)
        trRow4 = tlCalculator.findViewById(R.id.trRow4)
        trRow5 = tlCalculator.findViewById(R.id.trRow5)
        btnPercentage = trRow1.findViewById(R.id.btnPercentage)
        btnClr = trRow1.findViewById(R.id.btnClr)
        btnDel = trRow1.findViewById(R.id.btnDel)
        btnDiv = trRow1.findViewById(R.id.btnDiv)
        btnSeven = trRow2.findViewById(R.id.btnSeven)
        btnEight = trRow2.findViewById(R.id.btnEight)
        btnNine = trRow2.findViewById(R.id.btnNine)
        btnMul = trRow2.findViewById(R.id.btnMul)
        btnFour = trRow3.findViewById(R.id.btnFour)
        btnFive = trRow3.findViewById(R.id.btnFive)
        btnSix = trRow3.findViewById(R.id.btnSix)
        btnMin = trRow3.findViewById(R.id.btnMin)
        btnOne = trRow4.findViewById(R.id.btnOne)
        btnTwo = trRow4.findViewById(R.id.btnTwo)
        btnThree = trRow4.findViewById(R.id.btnThree)
        btnAdd = trRow4.findViewById(R.id.btnAdd)
        btn_Zero = trRow5.findViewById(R.id.btn_Zero)
        btnZero = trRow5.findViewById(R.id.btnZero)
        btnDot = trRow5.findViewById(R.id.btnDot)
        btnResult = trRow5.findViewById(R.id.btnResult)


        btn_Zero.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "00") }
        btnZero.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "0") }
        btnDot.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + ".") }
        btnOne.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "1") }
        btnTwo.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "2") }
        btnThree.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "3") }
        btnFour.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "4") }
        btnFive.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "5") }
        btnSix.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "6") }
        btnSeven.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "7") }
        btnEight.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "8") }
        btnNine.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "9") }
        btnAdd.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "+") }
        btnMin.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "-") }
        btnMul.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "×") }
        btnDiv.setOnClickListener {
            tvNumber.text = (tvNumber.text.toString() + "÷") }
        btnClr.setOnClickListener {
            tvNumber.text = "" }
        btnDel.setOnClickListener {

            var str: String = tvNumber.text.toString()
            if (str != "") {
                str = str.substring(0, str.length - 1)
                tvNumber.text = str }
        }
    }
}


