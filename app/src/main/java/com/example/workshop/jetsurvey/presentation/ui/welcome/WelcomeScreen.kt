package com.example.workshop.jetsurvey.presentation.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.workshop.jetsurvey.R
import com.example.workshop.jetsurvey.presentation.theme.JetsurveyTheme
import com.example.workshop.jetsurvey.presentation.util.supportWideScreen

@Composable
fun WelcomeScreen(){
    Surface(modifier = Modifier.supportWideScreen()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Branding(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
            SignInCreateAccount(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            )
        }
    }

}

@Composable
fun Branding(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .wrapContentHeight(align = Alignment.CenterVertically)
    ) {
        Logo(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 76.dp)
        )
        Text(
            text = stringResource(id = R.string.app_tagline),
            style = MaterialTheme.typography.subtitle1,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun Logo(
    modifier: Modifier = Modifier,
    lightTheme: Boolean = MaterialTheme.colors.isLight
){
    val assetId = if (lightTheme){
        R.drawable.ic_logo_light
    }else{
        R.drawable.ic_logo_dark
    }

    Image(
        painter = painterResource(id = assetId),
        modifier = modifier,
        contentDescription = null
    )
}

@Composable
fun SignInCreateAccount(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium ) {
            Text(
                text = stringResource(id = R.string.sign_in_create_account),
                style = MaterialTheme.typography.subtitle2,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 64.dp, bottom = 12.dp)
            )
        }


        Email()

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp, bottom = 3.dp)
        ) {
            Text(
                text = stringResource(id = R.string.user_continue),
                style = MaterialTheme.typography.subtitle2
            )
        }

        OrSignInAsGuest(
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun Email(){
    OutlinedTextField(
        value = "texto",
        onValueChange = {},
        label = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(
                    text = stringResource(id = R.string.email),
                    style = MaterialTheme.typography.body2
                )
            }
        },
        modifier = Modifier
            .fillMaxWidth(),
        textStyle = MaterialTheme.typography.body2
    )
}

@Composable
fun OrSignInAsGuest(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(
                    text = stringResource(id = R.string.or),
                    style = MaterialTheme.typography.subtitle2,
                    modifier = Modifier.paddingFromBaseline(top = 25.dp)
                )
            }
        }
        
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 24.dp)
        ) {
            Text(text = stringResource(id = R.string.sign_in_guest))
        }
    }
}

@Preview(
    name = "Welcome tema light",
    showBackground = true,
    widthDp = 520
)
@Composable
fun WelcomeScreenPreview(){
    JetsurveyTheme {
        WelcomeScreen()
    }
}

@Preview(
    name = "Welcome tema dark ",
    showBackground = true,
    widthDp = 950
)
@Composable
fun WelcomeScreenPreviewDark(){
    JetsurveyTheme(darkTheme = true) {
        WelcomeScreen()
    }
}