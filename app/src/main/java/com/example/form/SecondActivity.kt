package com.example.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extras = intent.extras
        val fullName = extras?.getString("fullName")
        val gender = extras?.getString("gender")
        val currentWeight = extras?.getString("currentWeight")
        val height = extras?.getString("height")
        val goalWeight = extras?.getString("goalWeight")
        val age = extras?.getString("age")
        val phone = extras?.getString("phone")
        val address = extras?.getString("address")
        val checked = extras?.getString("checked")


        val tv_fullName = findViewById<TextView>(R.id.tv_full_name)
        val fullNameText = getString(R.string.full_name_placeholder, fullName)
        tv_fullName.text = fullNameText

        val tv_gender = findViewById<TextView>(R.id.tv_gender)
        val genderText = getString(R.string.gender_placeholder, gender)
        tv_gender.text = genderText

        val tv_currentWeight = findViewById<TextView>(R.id.tv_current_weight)
        val currentWeightText = getString(R.string.current_weight_placeholder, currentWeight)
        tv_currentWeight.text = currentWeightText

        val tv_height = findViewById<TextView>(R.id.tv_height)
        val heightText = getString(R.string.height_placeholder, height)
        tv_height.text = heightText

        val tv_goalWeight = findViewById<TextView>(R.id.tv_goal_weight)
        val goalWeightText = getString(R.string.goal_weight_placeholder, goalWeight)
        tv_goalWeight.text = goalWeightText

        val tv_age = findViewById<TextView>(R.id.tv_age)
        val ageText = getString(R.string.age_placeholder, age)
        tv_age.text = ageText

        val tv_phone = findViewById<TextView>(R.id.tv_phone)
        val phoneText = getString(R.string.phone_placeholder, phone)
        tv_phone.text = phoneText

        val tv_address = findViewById<TextView>(R.id.tv_address)
        val addressText = getString(R.string.address_placeholder, address)
        tv_address.text = addressText

        val tv_checked = findViewById<TextView>(R.id.tv_checked)
        val checkedText = getString(R.string.checked, checked)
        tv_checked.text = checkedText

    }
}
