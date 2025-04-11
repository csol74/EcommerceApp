package com.cesarsolano.ecommerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier
import com.cesarsolano.ecommerceapp.ui.theme.EcommerceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcommerceAppTheme {

                val myNavController= rememberNavController()
                val myStartDestination= "login"

                NavHost(

                    navController= myNavController,
                    startDestination= myStartDestination,
                    modifier= Modifier.fillMaxSize()
                ){
                    composable("login"){
                        LoginScreen(myNavController)
                }
                    composable( "register"){
                        RegisterScreen(myNavController)
                }
                    composable("home"){
                        HomeScreen()
                    }
                }


                }
            }
        }
    }


