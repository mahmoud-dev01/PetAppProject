package org.example.petapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.petapp.theme.buttonBackground
import org.example.petapp.theme.buttonTextColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import petappproject.composeapp.generated.resources.Res
import petappproject.composeapp.generated.resources.logotakee
import petappproject.composeapp.generated.resources.start_screen

@Composable
@Preview
fun SplashScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(resource = Res.drawable.start_screen),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize()
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .weight(weight = 1.0F)
                .padding(top = 36.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(resource = Res.drawable.logotakee),
                contentDescription = "Logo",

                )
        }
        Column(
            modifier = Modifier
                .weight(weight = 1.0F)
                .padding(bottom = 28.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Happiness is closer than you think",
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    fontSize = 36.sp,
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(52.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    buttonBackground
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp)
                    .padding(start = 18.dp, end = 18.dp),
                shape = RoundedCornerShape(100)

            ) {
                Text(
                    text = "Let's Go!",
                    style = TextStyle(color = buttonTextColor, fontSize = 17.sp)
                )
            }
        }
    }
}