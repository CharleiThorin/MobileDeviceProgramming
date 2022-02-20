package com.example.charles.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.charles.dinnerdecider.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var foodList:ArrayList<String> = ArrayList()

    private lateinit var activityBinder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBinder.root)

        foodList.add("Hamburger")
        foodList.add("Pizza")
        foodList.add("Mexican")
        foodList.add("American")
        foodList.add("Chinese")

        activityBinder.add.setOnClickListener{
           var addedFood = activityBinder.name.text.toString()
           if(addedFood.isNotEmpty()){
               foodList.add(addedFood)
               print(foodList)
           }
        }

        activityBinder.decide.setOnClickListener {
            activityBinder.msg.text = foodList[Random.nextInt(foodList.size)]
        }










    }
}