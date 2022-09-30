package com.diyarbek.guessacouple.ui

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

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

    @SuppressLint("ResourceType")
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

                val front = binding.iv1Front
                val back = binding.iv1Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[0]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[0] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[0] = true
                }
            }
            cv2.setOnClickListener {
                val front = binding.iv2Front
                val back = binding.iv2Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[1]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[1] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[1] = true
                }
            }
            cv3.setOnClickListener {
                val front = binding.iv3Front
                val back = binding.iv3Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[2]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[2] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[2] = true
                }
            }
            cv4.setOnClickListener {
                val front = binding.iv4Front
                val back = binding.iv4Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[3]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[3] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[3] = true
                }
            }
            cv5.setOnClickListener {
                val front = binding.iv5Front
                val back = binding.iv5Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[4]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[4] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[4] = true
                }
            }
            cv6.setOnClickListener {
                val front = binding.iv6Front
                val back = binding.iv6Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[5]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[5] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[5] = true
                }
            }
            cv7.setOnClickListener {
                val front = binding.iv7Front
                val back = binding.iv7Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[6]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[6] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[6] = true
                }
            }
            cv8.setOnClickListener {
                val front = binding.iv8Front
                val back = binding.iv8Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[7]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[7] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[7] = true
                }
            }
            cv9.setOnClickListener {
                val front = binding.iv9Front
                val back = binding.iv9Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[8]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[8] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[8] = true
                }
            }
            cv10.setOnClickListener {
                val front = binding.iv10Front
                val back = binding.iv10Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[9]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[9] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[9] = true
                }
            }
            cv11.setOnClickListener {
                val front = binding.iv11Front
                val back = binding.iv11Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[10]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[10] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[10] = true
                }
            }
            cv12.setOnClickListener {
                val front = binding.iv12Front
                val back = binding.iv12Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[11]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[11] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[11] = true
                }
            }
            cv13.setOnClickListener {
                val front = binding.iv13Front
                val back = binding.iv13Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[12]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[12] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[12] = true
                }
            }
            cv14.setOnClickListener {
                val front = binding.iv14Front
                val back = binding.iv14Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[13]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[13] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[13] = true
                }
            }
            cv15.setOnClickListener {
                val front = binding.iv15Front
                val back = binding.iv15Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[14]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[14] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[14] = true
                }
            }
            cv16.setOnClickListener {
                val front = binding.iv16Front
                val back = binding.iv16Back

                front_anim = AnimatorInflater.loadAnimator(context, R.animator.flip) as AnimatorSet
                back_anim =
                    AnimatorInflater.loadAnimator(context, R.animator.flip_back) as AnimatorSet
                if (isFront[15]) {
                    front_anim.setTarget(front)
                    back_anim.setTarget(back)
                    front_anim.start()
                    back_anim.start()
                    isFront[15] = false
                } else {
                    front_anim.setTarget(back)
                    back_anim.setTarget(front)
                    back_anim.start()
                    front_anim.start()
                    isFront[15] = true
                }
            }

        }
    }

    private fun setData() {
        images = Constants.getImages()
        currentImage = images[index]
        var shuffled = currentImage.images.shuffled()
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

    private fun checkCards() {

        var isFrontFalse = 0
        repeat(16) {
            if (!isFront[it]) {
                isFrontFalse++
            }
        }
        if (isFrontFalse >= 2) {
            repeat(16) {
                isFront[it] = true
            }
        }
        isFrontFalse = 0

    }
}