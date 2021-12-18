package com.example.a19485441_truongnguyenduytan_ad_todoapp

interface UpdateAndDelete {
    fun modifyItem(itemUID: String, isDone: Boolean)
    fun onItemDelete(itemUID: String)
}