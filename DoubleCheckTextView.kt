package com.app.app

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.app.app.databinding.DoubleCheckTextviewBinding


class DoubleCheckTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    var status = 0
    private var binding: DoubleCheckTextviewBinding

    init {

        binding = DoubleCheckTextviewBinding.inflate(LayoutInflater.from(context))
        addView(binding.root)
        binding.no.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.yes.isChecked = false
                status = 1
            } else {
                status = 0
            }
            Log.w("TAG", "no=============      $status: ")
        }
        binding.yes.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.no.isChecked = false
                status = 2
            } else {
                status = 0
            }
            Log.w("TAG", "yes=============      $status: ")
        }
    }
    
    fun setTextContent(text: String) {
        binding.text.text = text
    }
}
