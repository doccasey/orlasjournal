package com.orla.journal

import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.*

class OrlaTTS(context: Context) {
    private val tts = TextToSpeech(context) { status ->
        if (status == TextToSpeech.SUCCESS) {
            tts.language = Locale.UK
        }
    }
    fun speak(text: String) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
    }
}
