package com.example.gmailclone.model

data class EmailItem(
    val sender: String,
    val subject: String,
    val preview: String,
    val time: String,
    val senderIcon: String
)
