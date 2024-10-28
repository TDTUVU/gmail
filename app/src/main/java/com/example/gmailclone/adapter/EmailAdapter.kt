package com.example.gmailclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailclone.databinding.EmailItemBinding
import com.example.gmailclone.model.EmailItem

class EmailAdapter(private val emailList: List<EmailItem>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(private val binding: EmailItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(email: EmailItem) {
            binding.senderIconText.text = email.senderIcon
            binding.senderName.text = email.sender
            binding.emailSubject.text = email.subject
            binding.emailPreview.text = email.preview
            binding.emailTime.text = email.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val binding = EmailItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return EmailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emailList[position])
    }

    override fun getItemCount(): Int = emailList.size
}
