Practical 3:calculator
MainActivity.kt:
package com.example.kavyashree_249662_3
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val num1=findViewById<EditText>(R.id.num1)
        val num2= findViewById<EditText>(R.id.num2)
        val add= findViewById<Button>(R.id.add)
        val sub= findViewById<Button>(R.id.sub)
        val mul= findViewById<Button>(R.id.mul)
        val div= findViewById<Button>(R.id.div)
        val result= findViewById<TextView>(R.id.result)

        add.setOnClickListener{
            val num1= num1.text.toString().toInt()
            val num2= num2.text.toString().toInt()
            val add= num1+num2

            result.text=add.toString()
        }
        sub.setOnClickListener {
            val num1= num1.text.toString().toInt()
            val num2= num2.text.toString().toInt()
            val sub= num1-num2

            result.text=sub.toString()
        }
        mul.setOnClickListener {
            val num1= num1.text.toString().toInt()
            val num2= num2.text.toString().toInt()
            val mul= num1*num2

            result.text=mul.toString()
        }
        div.setOnClickListener {
            val num1= num1.text.toString().toInt()
            val num2= num2.text.toString().toInt()
            val div= num1/num2

            result.text=div.toString()
        }
    }
}



Activity_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#F8F9FA"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/title"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Simple Calculator"
        android:textSize="24sp"
        android:textStyle="bold"
        android:gravity="center"
        android:padding="8dp"
        android:textColor="#333333" />

    <EditText
        android:id="@+id/num1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="numberDecimal"
        android:hint="Enter 1st number"
        android:padding="12dp"
        android:layout_marginTop="16dp"
        android:background="@drawable/edittext_background"
        android:textSize="18sp" />

    <EditText
        android:id="@+id/num2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="numberDecimal"
        android:hint="Enter 2nd number"
        android:padding="12dp"
        android:layout_marginTop="12dp"
        android:background="@drawable/edittext_background"
        android:textSize="18sp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginTop="16dp"
        android:weightSum="2">

        <Button
            android:id="@+id/add"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/button_background"
            android:text="Add"
            android:textColor="#FFFFFF"
            android:textSize="18sp"
            android:layout_marginEnd="8dp" />

        <Button
            android:id="@+id/sub"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/button_background"
            android:text="Subtract"
            android:textColor="#FFFFFF"
            android:textSize="18sp"
            android:layout_marginStart="8dp" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginTop="12dp"
        android:weightSum="2">

        <Button
            android:id="@+id/mul"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/button_background"
            android:text="Multiply"
            android:textColor="#FFFFFF"
            android:textSize="18sp"
            android:layout_marginEnd="8dp" />

        <Button
            android:id="@+id/div"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/button_background"
            android:text="Divide"
            android:textColor="#FFFFFF"
            android:textSize="18sp"
            android:layout_marginStart="8dp" />
    </LinearLayout>

    <TextView
        android:id="@+id/result"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:padding="16dp"
        android:background="@drawable/result_background"
        android:textSize="20sp"
        android:textColor="#333333"
        android:gravity="center"
        android:text="Result will be shown here" />
</LinearLayout>


Practical 4:intent
MainActivity.kt:
package com.example.mayur_249663_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val name=findViewById<EditText>(R.id.name)
        val age=findViewById<EditText>(R.id.age)
        val email=findViewById<EditText>(R.id.email)

        btn.setOnClickListener{
            val userName=name.text.toString()
            val userAge=age.text.toString()
            val userEmail=email.text.toString()
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("user_name",userName)
            intent.putExtra("user_age",userAge)
            intent.putExtra("user_email",userEmail)
            startActivity(intent)
        }
    }
}


xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="20dp"
    android:gravity="center"
    android:orientation="vertical"
    android:background="#F5F5F5"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/name"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:inputType="text"
        android:hint="Enter your name"
        android:textSize="18sp"
        android:padding="12dp"
        android:background="@android:drawable/editbox_background"
        android:textColor="#000000"
        android:textColorHint="#757575" />

    <EditText
        android:id="@+id/age"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:inputType="number"
        android:hint="Enter your age"
        android:textSize="18sp"
        android:padding="12dp"
        android:background="@android:drawable/editbox_background"
        android:textColor="#000000"
        android:textColorHint="#757575"
        android:layout_marginTop="12dp"/>

    <EditText
        android:id="@+id/email"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:inputType="textEmailAddress"
        android:hint="Enter your email"
        android:textSize="18sp"
        android:padding="12dp"
        android:background="@android:drawable/editbox_background"
        android:textColor="#000000"
        android:textColorHint="#757575"
        android:layout_marginTop="12dp"/>

    <Button
        android:id="@+id/btn"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:text="Next"
        android:textSize="18sp"
        android:background="#2196F3"
        android:textColor="#FFFFFF"
        android:layout_marginTop="20dp"/>

</LinearLayout>

MainActivity2.kt:
package com.example.mayur_249663_4
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val btn2 = findViewById<Button>(R.id.btn2)
        val txt1=findViewById<TextView>(R.id.resultName)
        val userName=intent.getStringExtra("user_name")
        val txt2=findViewById<TextView>(R.id.resultAge)
        val userAge=intent.getStringExtra("user_age")
        val txt3=findViewById<TextView>(R.id.resultEmail)
        val userEmail=intent.getStringExtra("user_email")

        txt1.text="Namaste,$userName"
        txt2.text="$userAge"
        txt3.text="$userEmail"

        btn2.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

activity_main2.xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="20dp"
    android:gravity="center"
    android:orientation="vertical"
    android:background="#00BCD4"
    tools:context=".MainActivity2">

    <TextView
        android:id="@+id/resultName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="22sp"
        android:textColor="#673AB7"
        android:background="@color/white"
        android:gravity="center"
        android:padding="10dp"
        android:layout_marginBottom="10dp"
        android:textStyle="bold"/>

    <TextView
        android:id="@+id/resultAge"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="22sp"
        android:textColor="#673AB7"
        android:background="@color/white"
        android:gravity="center"
        android:padding="10dp"
        android:layout_marginBottom="10dp"
        android:textStyle="bold"/>

    <TextView
        android:id="@+id/resultEmail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="22sp"
        android:textColor="#673AB7"
        android:background="@color/white"
        android:gravity="center"
        android:padding="10dp"
        android:textStyle="bold"/>

    <Button
        android:id="@+id/btn2"
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:text="Back"
        android:textSize="18sp"
        android:background="#FFFFFF"
        android:textColor="#ffffff"
        android:layout_marginTop="20dp"
        android:gravity="center"/>
</LinearLayout>



Practical 5: life cycle

MainActivity.kt:

import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val TAG= "Main Activity 1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}



activitiy_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:gravity="center">

   <Button
       android:id="@+id/btn"
       android:layout_width="wrap_content"
       android:layout_height="70dp"
       android:text="Next"/>
</LinearLayout>


MainActivity2.kt:

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    val TAG= "Main Activity 2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "onCreate: ")
        val btn2 = findViewById<Button>(R.id.btn2)

        btn2.setOnClickListener{
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}


activity_main2.xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity2"
    android:background="#00bcd4"
    android:gravity="center">

    <Button
        android:id="@+id/btn2"
        android:layout_width="wrap_content"
        android:layout_height="70dp"
        android:text="Back"/>
</LinearLayout>




Practical 6:-notification

MainActivity.kt:

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private val channelID = "com.example.notification_mayur_63"
    private val notificationID = 1  // Unique ID for notifications

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val show = findViewById<Button>(R.id.btn_show)

        // Create Notification Channel (Required for API 26+)
        createNotificationChannel()
        show.setOnClickListener {
            if (checkNotificationPermission()) {
                showNotification()
            } else {
                requestNotificationPermission()
            }
        }
    }
    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelID,
                "My Notification Channel",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                enableLights(true)
                lightColor = Color.RED
                enableVibration(true)
                description = "My notification description"
            }
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)
        }
    }
    private fun showNotification() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            this, 0, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        val builder = NotificationCompat.Builder(this, channelID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)  // Replace with your drawable
            .setContentTitle("Android Notification")
            .setContentText("New Message!!")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
            NotificationManagerCompat.from(this).notify(notificationID, builder.build())
        }
    }
    private fun checkNotificationPermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED
        } else {
            true
        }
    }
    private fun requestNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
        }
    }
    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                showNotification()
            }}
}


activity_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <Button
        android:id="@+id/btn_show"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        tools:layout_editor_absoluteX="16dp"
        tools:layout_editor_absoluteY="76dp" />

</LinearLayout>





Practical 8:-different views

MainActivity.kt:

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.et_name)
        val tvGender = findViewById<TextView>(R.id.tv_gender)
        val genderGroup = findViewById<RadioGroup>(R.id.genderGroup)
        val rbMale = findViewById<RadioButton>(R.id.rb_male)
        val rbFemale = findViewById<RadioButton>(R.id.rb_female)
        val tvHobbies = findViewById<TextView>(R.id.tv_hobbies)
        val cbCooking = findViewById<CheckBox>(R.id.cb_cooking)
        val cbReading = findViewById<CheckBox>(R.id.cb_reading)
        val cbGaming = findViewById<CheckBox>(R.id.cb_gaming)
        val btnOk = findViewById<Button>(R.id.btn_ok)
        val imgBtn = findViewById<ImageButton>(R.id.img_btn)

        var s = ""

        btnOk.setOnClickListener {
            val et_name = null
            etName.text = et_name.text()

        }
        tvHobbies.text = s
        imgBtn.setOn
    }
}


activity_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_marginTop="20dp"
    tools:context=".MainActivity">

    <LinearLayout
        android:id="@+id/container"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <EditText
            android:id="@+id/et_name"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your name" />

        <TextView
            android:id="@+id/tv_gender"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Gender: "
            android:textSize="20dp" />

        <RadioGroup
            android:id="@+id/genderGroup"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

            <RadioButton
                android:id="@+id/rb_male"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Male"
                android:textSize="20dp" />

            <RadioButton
                android:id="@+id/rb_female"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Female"
                android:textSize="20dp" />

        </RadioGroup>

        <TextView
            android:id="@+id/tv_hobbies"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hobbies: "
            android:textSize="20dp" />

        <CheckBox
            android:id="@+id/cb_cooking"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Cooking"
            android:textSize="20dp" />

        <CheckBox
            android:id="@+id/cb_reading"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Reading"
            android:textSize="20dp" />

        <CheckBox
            android:id="@+id/cb_gaming"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Gaming"
            android:textSize="20dp" />

        <Button
            android:id="@+id/btn_ok"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="OK"
            android:textSize="20dp"/>

        <ImageButton
            android:id="@+id/img_btn"
            android:layout_width="224dp"
            android:layout_height="133dp"
            android:contentDescription="Click me"
            android:scaleType="fitCenter"
            android:src="@drawable/mustang" />

    </LinearLayout>

</LinearLayout>




Practical 9:-Date, time , alert

MainActivity.kt:

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import java.util.Calendar

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {
    lateinit var btnPickDate: Button
    lateinit var tvDate: TextView
    lateinit var btnPickTime: Button
    lateinit var tvTime: TextView
    lateinit var btnClickMe: Button
    lateinit var tvAlertDialog: TextView

    var day: Int = 0
    var month: Int = 0
    var year: Int = 0
    var hour: Int = 0
    var minute: Int = 0
    var myDay: Int = 0
    var myMonth: Int = 0
    var myYear: Int = 0
    var myHour: Int = 0
    var myMinute: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPickDate = findViewById(R.id.btnPickDate)
        tvDate = findViewById(R.id.tvDate)
        btnPickTime = findViewById(R.id.btnPickTime)
        tvTime = findViewById(R.id.tvTime)
        btnClickMe = findViewById(R.id.btnClickMe)
        tvAlertDialog = findViewById(R.id.tvAlertDialog)

        btnPickDate.setOnClickListener{
            val calender = Calendar.getInstance()
            day = calender.get(Calendar.DAY_OF_MONTH)
            month = calender.get(Calendar.MONTH)
            year = calender.get(Calendar.YEAR)
            val datePickerDialog = DatePickerDialog(this@MainActivity, this@MainActivity, year, month, day)
            datePickerDialog.show()
        }
        btnPickTime.setOnClickListener{
            val calender = Calendar.getInstance()
            hour = calender.get(Calendar.HOUR)
            minute = calender.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(this@MainActivity, this@MainActivity, hour, minute, true)
            timePickerDialog.show()
        }
        btnClickMe.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Dialog Box")
            builder.setMessage("Deleting File may harm your system")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){ dialogInterface, which -> tvAlertDialog.text = "Clicked Yes"
            }
            builder.setNegativeButton("No"){ dialogInterface, which -> tvAlertDialog.text = "Clicked No"
            }
            builder.setNeutralButton("Cancel"){ dialogInterface, which -> tvAlertDialog.text = "Clicked Cancel\nOperation Cancelled"
            }
            val alertDialog:AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
        myYear = p1
        myMonth = p2+1
        myDay = p3
        tvDate.text = "Year: " + myYear + "\n" + "Month: " + myMonth + "\n" + "Day: " + myDay
    }
    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
        myHour = p1
        myMinute = p2
        tvTime.text = "Hour: " + myHour + "\n" + "Minute: "+ myMinute
    }
}


activity_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/tv1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="50dp"
        android:text="DatePicker Dialog"
        android:textSize="20dp" />
    <Button
        android:id="@+id/btnPickDate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="10dp"
        android:layout_below="@+id/tv1"
        android:textSize="20dp"
        android:text="Pick Date" />
    <TextView
        android:id="@+id/tvDate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/btnPickDate"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="10dp"
        android:textSize="20dp" />
    <TextView
        android:id="@+id/tv2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tvDate"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="50dp"
        android:text="TimePicker Dialog"
        android:textSize="20dp" />
    <Button
        android:id="@+id/btnPickTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tv2"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="10dp"
        android:textSize="20dp"
        android:text="Pick Time" />
    <TextView
        android:id="@+id/tvTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/btnPickTime"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="10dp"
        android:textSize="20dp" />
    <TextView
        android:id="@+id/tv3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tvTime"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="50dp"
        android:textSize="20dp"
        android:text="Alert Dialog" />
    <Button
        android:id="@+id/btnClickMe"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tv3"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="10dp"
        android:textSize="20dp"
        android:text="Show Alert Dialog Window"/>
    <TextView
        android:id="@+id/tvAlertDialog"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/btnClickMe"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="10dp"
        android:textSize="20dp" />
</RelativeLayout>




Practical 10:-
MainActivity.kt:

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mayur_249663_10.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var firebaseRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseRef = FirebaseDatabase.getInstance().getReference("test")

        binding.senddata.setOnClickListener{
            firebaseRef.setValue("TyIT-batch_A")
                .addOnCompleteListener{
                    Toast.makeText(this,"Successfully data submitted", Toast.LENGTH_SHORT).show()
                }
        }
        enableEdgeToEdge()

    }
}

activity_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    android:paddingTop="50dp">

    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Send Data"
        android:layout_margin="10dp"
        android:textAlignment="center"
        android:textSize="40dp"
        android:layout_centerHorizontal="true"/>

    <Button
        android:id="@+id/senddata"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Button"
        android:layout_below="@id/textView"
        android:layout_marginTop="20dp"/>
</RelativeLayout>


build.gradle:
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures{
        viewBinding= true
    }




































