package com.example.nameinputchallangeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var etFirstName: EditText? = null
    private var etLastName: EditText? = null
    private var etEmail: EditText? = null
    private var btnRegister: Button? = null
    private var tvFirst: TextView? = null
    private var tvLast: TextView? = null
    private var tvEmail: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etFirstName = findViewById(R.id.etFirstName)
        etLastName = findViewById(R.id.etLastName)
        etEmail = findViewById(R.id.etEmail)
        btnRegister = findViewById(R.id.btnRegister)
        tvFirst = findViewById(R.id.tvFirst)
        tvLast = findViewById(R.id.tvLast)
        tvEmail = findViewById(R.id.tvEmail)

        btnRegister!!.setOnClickListener {
            textDisplay()
        }

    }

    private fun textDisplay() {
        tvFirst!!.text = "First Name: ${etFirstName?.text}"
        tvLast!!.text = "Last Name: ${etLastName?.text}"
        tvEmail!!.text = "Email: ${etEmail?.text}"
    }
}