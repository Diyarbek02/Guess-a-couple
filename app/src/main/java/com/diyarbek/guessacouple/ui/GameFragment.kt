package com.diyarbek.guessacouple.ui

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.diyarbek.guessacouple.Constants
import com.diyarbek.guessacouple.R
import com.diyarbek.guessacouple.data.Images
import com.diyarbek.guessacouple.databinding.FragmentGameBinding

class GameFragment : Fragment(R.layout.fragment_game) {
    private lateinit var binding: FragmentGameBinding
    private lateinit var images: List<Images>
    private lateinit var currentImage: Images
    private var index = 0
    private lateinit var isFront: MutableList<Boolean>
    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentGameBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        isFront = mutableListOf<Boolean>()
        repeat(16) {
            isFront.add(true)
        }

        setData()
        binding.apply {

            cv1.setOnClickListener {
                loadAnimation(iv1Front, iv1Back, 0)
            }
            cv2.setOnClickListener {
                loadAnimation(iv2Front, iv2Back, 1)
            }
            cv3.setOnClickListener {
                loadAnimation(iv3Front, iv3Back, 2)
            }
            cv4.setOnClickListener {
                loadAnimation(iv4Front, iv4Back, 3)
            }
            cv5.setOnClickListener {
                loadAnimation(iv5Front, iv5Back, 4)
            }
            cv6.setOnClickListener {
                loadAnimation(iv6Front, iv6Back, 5)
            }
            cv7.setOnClickListener {
                loadAnimation(iv7Front, iv7Back, 6)
            }
            cv8.setOnClickListener {
                loadAnimation(iv8Front, iv8Back, 7)
            }
            cv9.setOnClickListener {
                loadAnimation(iv9Front, iv9Back, 8)
            }
            cv10.setOnClickListener {
                loadAnimation(iv10Front, iv10Back, 9)
            }
            cv11.setOnClickListener {
                loadAnimation(iv11Front, iv11Back, 10)
            }
            cv12.setOnClickListener {
                loadAnimation(iv12Front, iv12Back, 11)
            }
            cv13.setOnClickListener {
                loadAnimation(iv13Front, iv13Back, 12)
            }
            cv14.setOnClickListener {
                loadAnimation(iv14Front, iv14Back, 13)
            }
            cv15.setOnClickListener {
                loadAnimation(iv15Front, iv15Back, 14)
            }
            cv16.setOnClickListener {
                loadAnimation(iv16Front, iv16Back, 15)
            }
        }
    }

    private fun setData() {
        images = Constants.getImages()
        currentImage = images[index]
        val shuffled = currentImage.images.shuffled()
        binding.apply {
            iv1Back.setImageResource(shuffled[0])
            iv2Back.setImageResource(shuffled[0])
            iv3Back.setImageResource(shuffled[1])
            iv4Back.setImageResource(shuffled[1])
            iv5Back.setImageResource(shuffled[2])
            iv6Back.setImageResource(shuffled[2])
            iv7Back.setImageResource(shuffled[3])
            iv8Back.setImageResource(shuffled[3])
            iv9Back.setImageResource(shuffled[4])
            iv10Back.setImageResource(shuffled[4])
            iv11Back.setImageResource(shuffled[5])
            iv12Back.setImageResource(shuffled[5])
            iv13Back.setImageResource(shuffled[6])
            iv14Back.setImageResource(shuffled[6])
            iv15Back.setImageResource(shuffled[7])
            iv16Back.setImageResource(shuffled[7])
        }
    }

    private fun loadAnimation(front: View, back: View, _isFront: Int) {
        front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
        back_anim =
            AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
        if (isFront[_isFront]) {
            front_anim.setTarget(front)
            back_anim.setTarget(back)
            front_anim.start()
            back_anim.start()
            isFront[_isFront] = false
        } else {
            front_anim.setTarget(back)
            back_anim.setTarget(front)
            back_anim.start()
            front_anim.start()
            isFront[_isFront] = true
        }
    }
}