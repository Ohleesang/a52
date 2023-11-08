package com.example.a52

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {

            fun solution(a: Int, b: Int, n: Int): Int {
                var answer: Int = 0
                //빈병 a개를 주면 콜라 b병
                //빈병 n개 주면 몇개를 받을수 있나?
                var coke = 0
                var bottle = n
                var takeBottle = 0
                while(bottle>=a){
                    //
                    takeBottle =bottle/a
                    coke += (takeBottle)*b
                    // 20 - 18 + 6
                    bottle = bottle - (takeBottle)*a + (takeBottle)*b

                }
                answer = coke
                return answer
            }
        }
        val a =Solution()
        a.solution(2,1,20)//19
        a.solution(3,1,20)//9
    }
}