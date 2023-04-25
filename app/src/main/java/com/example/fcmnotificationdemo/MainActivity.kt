package com.example.fcmnotificationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token.addOnCompleteListener({task->
          if (!task.isSuccessful){
              Log.e("msg","received")
              return@addOnCompleteListener

          }
            //To get the token
            var token=task.getResult()
            Log.e("My TOKEN",token)
        })


//My TOKEN: dt9zAGb1S0G0U2Lgekxgao:APA91bHPB81JfG9zgHX64Zv6LxxKhVcY7GC_6bhd_564LeZb-WW8RtOOokzpbflBMn74XrXMQWmUf973IIs2hMaBeC7RYHL_WlDyE6cE6cq6-udljyX7gj5WUTIwf-DQi7sEVx9n6a2e
    }
}
// After connection establish with firebase,generate token for app, by using syntax    FirebaseMessaging.getInstance().token.addOnCompleteListener({task->
//          if (!task.isSuccessful){
//              Log.e("msg","received")
//              return@addOnCompleteListener
//
//          }
//            //To get the token
//            var token=task.getResult()
//            Log.e("My TOKEN",token)
//        })