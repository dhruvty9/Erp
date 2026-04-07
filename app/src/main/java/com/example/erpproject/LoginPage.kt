package com.example.erpproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.erpproject.databinding.ActivityLoginBinding
import com.example.erpproject.databinding.ItemDemoCredentialBinding

class LoginPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Use ViewBinding to inflate the layout
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupDemoCredentials()

        binding.loginButton.setOnClickListener {
            // Navigate to Dashboard
            val intent = android.content.Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupDemoCredentials() {
        // Setup Admin credentials
        binding.demoAdmin.roleText.text = "Admin"
        binding.demoAdmin.emailText.text = "admin@example.com"
        binding.demoAdmin.passwordText.text = "123456"
        binding.demoAdmin.root.setOnClickListener {
            binding.emailEditText.setText("admin@example.com")
            binding.passwordEditText.setText("123456")
        }

        // Setup Employee credentials
        binding.demoEmployee.roleText.text = "Employee"
        binding.demoEmployee.emailText.text = "employee@example.com"
        binding.demoEmployee.passwordText.text = "123456"
        binding.demoEmployee.root.setOnClickListener {
            binding.emailEditText.setText("employee@example.com")
            binding.passwordEditText.setText("123456")
        }

        // Setup Client credentials
        binding.demoClient.roleText.text = "Client"
        binding.demoClient.emailText.text = "client@example.com"
        binding.demoClient.passwordText.text = "123456"
        binding.demoClient.root.setOnClickListener {
            binding.emailEditText.setText("client@example.com")
            binding.passwordEditText.setText("123456")
        }
    }
}
