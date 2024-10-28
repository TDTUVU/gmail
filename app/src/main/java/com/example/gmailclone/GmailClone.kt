package com.example.gmailclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmailclone.adapter.EmailAdapter // Đảm bảo đúng namespace
import com.example.gmailclone.model.EmailItem // Đảm bảo đúng namespace
import com.example.gmailclone.databinding.ActivityMainBinding // Import ActivityMainBinding

class GmailClone : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Khai báo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Khởi tạo binding
        setContentView(binding.root) // Đặt nội dung view cho Activity

        // Khởi tạo danh sách email mẫu
        val emailList = generateSampleEmails()

        // Thiết lập RecyclerView với LinearLayoutManager và EmailAdapter
        binding.recyclerViewEmails.layoutManager = LinearLayoutManager(this) // Sử dụng binding để truy cập recyclerView
        binding.recyclerViewEmails.adapter = EmailAdapter(emailList) // Truyền emailList cho adapter

        // Thiết lập sự kiện click cho nút FAB
        binding.fab.setOnClickListener {
            // Xử lý sự kiện click vào nút soạn email
        }
    }

    // Hàm tạo dữ liệu email mẫu
    private fun generateSampleEmails(): List<EmailItem> {
        return listOf(
            EmailItem("Edurila.com", "Discount Offer", "Get 50% off on all courses!", "12:34 PM", "E"), // Icon là chữ cái
            EmailItem("Chris Abad", "Feedback Request", "We would love your thoughts!", "11:22 AM", "C"),
            EmailItem("Tuto.com", "New Courses Available", "Check out our latest tutorials.", "11:04 AM", "T"),
            EmailItem("Support", "Service Update", "Your service has been updated.", "10:26 AM", "S"),
            EmailItem("Matt from Ionic", "New Feature", "Try the new creator tool!", "9:56 AM", "M")
        )
    }
}
