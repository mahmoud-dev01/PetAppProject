package org.example.petapp.ui.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import petappproject.composeapp.generated.resources.Res
import petappproject.composeapp.generated.resources.logotakee
import petappproject.composeapp.generated.resources.notification

@Composable
fun HeaderSection() {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(Res.drawable.logotakee),
            "Logo"
        )
        Icon(
            painter = painterResource(Res.drawable.notification),
            "notification"
        )
    }
    // Video 4 in 14
}