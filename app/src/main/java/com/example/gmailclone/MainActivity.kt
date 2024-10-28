package com.example.gmailclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmailclone.adapter.EmailAdapter
import com.example.gmailclone.databinding.ActivityMainBinding
import com.example.gmailclone.model.EmailItem

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var emailAdapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Sử dụng ViewBinding để truy cập giao diện
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Khởi tạo danh sách dữ liệu email
        val emailList = generateFakeEmails()

        // Thiết lập RecyclerView với LinearLayoutManager và Adapter
        emailAdapter = EmailAdapter(emailList)
        binding.recyclerViewEmails.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = emailAdapter
        }
    }

    // Hàm tạo dữ liệu giả cho danh sách email
    private fun generateFakeEmails(): List<EmailItem> {
        return listOf(
            EmailItem(
                sender = "Edurila.com",
                subject = "Learn Web Designing",
                preview = "Are you looking to Learn Web Designing...",
                time = "12:34 PM",
                senderIcon = "E"
            ),
            EmailItem(
                sender = "Chris Abad",
                subject = "Campaign Monitor Update",
                preview = "Help make Campaign Monitor better...",
                time = "11:22 AM",
                senderIcon = "C"
            ),
            EmailItem(
                sender = "Tuto.com",
                subject = "Free Course Available!",
                preview = "Learn Photoshop, SEO, and more...",
                time = "11:04 AM",
                senderIcon = "T"
            ),
            EmailItem(
                sender = "Support",
                subject = "Your account has been updated",
                preview = "Click here to view your updates...",
                time = "10:26 AM",
                senderIcon = "S"
            ),
            EmailItem(
                sender = "Matt from Ionic",
                subject = "Ionic Creator Is Here!",
                preview = "Announcing the all-new Ionic Creator...",
                time = "9:18 AM",
                senderIcon = "M"
            )
        )
    }
}
