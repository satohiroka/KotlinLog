package jp.techacademy.sato.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("ログ太郎",10,"明日の課題")
        human1.say()
        human1.think()

        val human2 = Human("ログ花子",15,"明後日の課題")
        human2.say()
        human2.think()
    }
}