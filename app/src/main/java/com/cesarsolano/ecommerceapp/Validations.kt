package com.cesarsolano.ecommerceapp

import android.util.Patterns

//retornar un true si es valido o un false si no es valido
//tambien retorne una cadena que me diga que paso si no es valido


fun validateEmail(email:String): Pair<Boolean, String>{
    return when {
        email.isEmpty() -> Pair(false, "El correo es obligatorio")
        !Patterns.EMAIL_ADDRESS.matcher(email).matches()-> Pair(false, "El correo es invalido")
        !email.endsWith(suffix = "gmail.com") -> Pair(false, "El correo debe ser @gmail")
        else -> Pair(true,"")
    }
}

fun validatePassword(passsword:String): Pair<Boolean, String>{
    return when {
        passsword.isEmpty() -> Pair(false, "El correo es obligatorio")
        passsword.length < 8 -> Pair(false,("La contraseña debe tener al menos 8 caracteres " ))
        !passsword.any {it.isDigit() }->Pair(false, "la contraseña debe tener al menos un número")
        else -> Pair(true,"")
    }
}
fun validateName(name:String): Pair<Boolean, String>{
    return when {
        name.isEmpty() -> Pair(false, "El nombre siempre es requerido.")
        name.length <3 -> Pair(false, "El nombre debe tener al menos 3 caracteres")
        else -> Pair(true,"")
    }
}

fun validateConfirmPassword(password: String, confirmPassword: String): Pair<Boolean, String>{
    return when{
        confirmPassword.isEmpty() -> Pair(false, "LA contraseña es requerida.")
        confirmPassword != password -> Pair(false,"Las contraseñas no coinciden.")
        else -> Pair(true, "")
    }
}
