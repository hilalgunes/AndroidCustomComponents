package com.hilal.androidcustomcomponents

import android.animation.ObjectAnimator
import android.view.View

/**
 * Created by Hilal Güneş on 29.04.2024
 */
class Animator {
    companion object{
        fun scale(view: View, from: Float, to: Float, duration: Long) {
            ObjectAnimator.ofFloat(view, "scaleX", from, to).apply {
                setDuration(duration)
                start()
            }
            ObjectAnimator.ofFloat(view, "scaleY", from, to).apply {
                setDuration(duration)
                start()
            }
        }

        fun rotate(view: View, from: Float, to: Float, duration: Long) {
            ObjectAnimator.ofFloat(view, "rotation", from, to).apply {
                setDuration(duration)
                start()
            }
        }

        fun translate(view: View, fromX: Float, toX: Float, fromY: Float, toY: Float, duration: Long) {
            ObjectAnimator.ofFloat(view, "translationX", fromX, toX).apply {
                setDuration(duration)
                start()
            }
            ObjectAnimator.ofFloat(view, "translationY", fromY, toY).apply {
                setDuration(duration)
                start()
            }
        }

        fun fade(view: View, from: Float, to: Float, duration: Long) {
            ObjectAnimator.ofFloat(view, "alpha", from, to).apply {
                setDuration(duration)
                start()
            }
        }

    }
}