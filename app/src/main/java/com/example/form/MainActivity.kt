package com.example.form

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var gender = ""
    private var fullName = ""
    private var currentWeight = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText: EditText = findViewById(R.id.et_name)
        val currentWeightEditText: EditText = findViewById(R.id.et_current_weight)
        val heightEditText: EditText = findViewById(R.id.et_height)
        val goalWeightEditText: EditText = findViewById(R.id.et_goal_weight)
        val ageEditText: EditText = findViewById(R.id.et_age)
        val phoneEditText: EditText = findViewById(R.id.et_phone)
        val addressEditText: EditText = findViewById(R.id.et_address)
        val conditionsCheckBox: CheckBox = findViewById(R.id.cb_conditions)
        val submitButton: Button = findViewById(R.id.btn_submit)
        submitButton.setOnClickListener {
            fullName = nameEditText.text.toString()
            currentWeight = currentWeightEditText.text.toString()
            val goalWeight = goalWeightEditText.text.toString()
            val age = ageEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val address = addressEditText.text.toString()
            val height = heightEditText.text.toString()
            val checkBoxState = conditionsCheckBox.isChecked

            val mIntent = Intent(this@MainActivity, SecondActivity::class.java )
            val mBundle = Bundle().apply {
                putString("fullName", fullName)
                putString("gender", gender)
                putString("currentWeight", currentWeight)
                putString("height", height)
                putString("goalWeight", goalWeight)
                putString("age", age)
                putString("phone", phone)
                putString("address", address)
                putString("checked", checkBoxState.toString())
            }

            mIntent.putExtras(mBundle)
            startActivity(mIntent)
        }
    }

    fun radioButtonHandler(view: View) {
        val checked = (view as RadioButton).isChecked

        when (view.getId()) {
            R.id.rb_male -> if (checked) {
                gender = "M"
            }

            R.id.rb_female -> if (checked) {
                gender = "F"
            }

            R.id.rb_other -> if (checked) {
                gender = "Other"
            }
        }
    }
}
