package com.example.islamiapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class sebha : Fragment() {
    companion object{
        var rand=1
    }
    lateinit var imageView: ImageView
    lateinit var tasbeehTimer: TextView
    lateinit var zekr:TextView
    var counter:Int=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sebha, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }
    fun initView(){
        imageView=requireView().findViewById(R.id.body_sebha)
        tasbeehTimer=requireView().findViewById(R.id.tasbeeh_timer)
        zekr=requireView().findViewById(R.id.zekr)
        imageView.setOnClickListener {
            imageView.rotation=imageView.rotation+11
            counter++
            tasbeehTimer.setText("$counter")
            changeTasbeeh()
        }

    }
    fun changeTasbeeh(){
        if (counter==32){
            counter=0;
            randomZekr()
        }
    }
    fun randomZekr(){
        if (rand==1){
            zekr.setText("الحمدلله")
            rand++
        }
        else if (rand==2){
            zekr.setText("الله اكبر")
            rand++
        }
        else if (rand==3){
            zekr.setText("سبحان الله")
            rand++
        }
        else if (rand==4){
            zekr.setText("لا اله الا الله")
            rand++
        }
        else if (rand==5){
            zekr.setText("أعوذ بكلمات اللّه التّامّات\nمن شرّ ما خلق.")
            rand=1
        }
    }
}