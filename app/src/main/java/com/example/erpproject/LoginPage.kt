package com.example.erpproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worksuite.databinding.ActivityLoginBinding
import com.example.worksuite.databinding.ItemDemoCredentialBinding

class LoginPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Use ViewBinding to inflate the layout
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupDemoCredentials()

        binding.loginButton.setOnClickListener {
            // handle login
        }
    }

    private fun setupDemoCredentials() {
        // Setup Admin credentials
        binding.demoAdmin.roleText.text = "Admin"
        binding.demoAdmin.emailText.text = "admin@example.com"
        binding.demoAdmin.passwordText.text = "123456"

        // Setup Employee credentials
        binding.demoEmployee.roleText.text = "Employee"
        binding.demoEmployee.emailText.text = "employee@example.com"
        binding.demoEmployee.passwordText.text = "123456"

        // Setup Client credentials
        binding.demoClient.roleText.text = "Client"
        binding.demoClient.emailText.text = "client@example.com"
        binding.demoClient.passwordText.text = "123456"
    }
}
