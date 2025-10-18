package com.orla.journal

object ScrollManager {
    private val scrolls = mutableListOf<String>()
    fun save(scroll: String) { scrolls.add(scroll) }
    fun list(): List<String> = scrolls
}
