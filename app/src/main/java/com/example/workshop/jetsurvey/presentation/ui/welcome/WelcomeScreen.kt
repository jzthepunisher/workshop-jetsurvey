package com.example.workshop.jetsurvey.presentation.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.workshop.jetsurvey.R
import com.example.workshop.jetsurvey.presentation.theme.JetsurveyTheme

@Composable
fun WelcomeScreen(){
    Column {
        Branding(modifier = Modifier)
        SignInCreateAccount(modifier = Modifier)
    }
}

@Composable
fun Branding(
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Logo()
        Text(text = "Texto")
    }
}

@Composable
fun Logo(
    modifier: Modifier = Modifier
){
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        modifier = modifier,
        contentDescription = null
    )
}

@Composable
fun SignInCreateAccount(
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Text(text = "Iniciar Sesión")

        Email()

        Button(onClick = {}) {
            Text(text = "button")
        }

        OrSignInAsGuest()
    }
}

@Composable
fun Email(){
    OutlinedTextField(
        value = "texto",
        onValueChange = {},
        label = {
            Text(text = "Correo")
        }
    )
}

@Composable
fun OrSignInAsGuest(
    modifier: Modifier = Modifier
){
    Column {
        Text(text = "Correo")

        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "Iniciar Sesión como invitado")
        }
    }
}

@Preview(name = "Welcome tema light", showBackground = true)
@Composable
fun WelcomeScreenPreview(){
    JetsurveyTheme {
        WelcomeScreen()
    }
}

@Preview(name = "Welcome tema dark", showBackground = true)
@Composable
fun WelcomeScreenPreviewDark(){
    JetsurveyTheme(darkTheme = true) {
        WelcomeScreen()
    }
}