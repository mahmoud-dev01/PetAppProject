// video 4 | 5

package org.example.petapp.ui.home.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.petapp.theme.categoryTextColor
import org.example.petapp.theme.roundedCornerShape100
import org.jetbrains.compose.resources.painterResource
import petappproject.composeapp.generated.resources.Res
import petappproject.composeapp.generated.resources.bсе
import kotlin.collections.listOf

@Composable
fun CategoriesSection() {

    val categoriesList = remember {
        listOf("All", "Cat", "Dog")
    }
    var selectedIndex by remember {
        mutableStateOf(0)
    }
    LazyRow(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
    ) {
        itemsIndexed(categoriesList) { index, item ->
            CategoryItem(selectedIndex, isSelected = index == selectedIndex)
        }
    }
}

@Composable
fun CategoryItem(item: String, isSelected: Boolean, onClick:() -> Unit) {

    val backgroundColor = animateColorAsState(
        if (isSelected) Color.Black.copy(alpha = 0.08F) else Color.White

    )
    Row(
        Modifier
            .height(52.dp)
            .background(color = Color.White, roundedCornerShape100)
            .border(
                width = 1.dp,
                color = Color.Black.copy(alpha = 0.08F),
                roundedCornerShape100
            )
            .clip(roundedCornerShape100)
            .padding(10.dp)
            .padding(end = 14.dp)
            .clickable {
                onClick()
            },
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(Res.drawable.bсе),
            modifier = Modifier
                .clip(CircleShape)
                .size(32.dp),
            contentDescription = "Category1"
        )
        Text(item, style = TextStyle(
            fontSize = 16.sp,
            color = categoryTextColor
        ))
    }
}