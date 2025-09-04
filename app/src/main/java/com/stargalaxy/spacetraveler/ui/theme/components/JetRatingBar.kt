package com.stargalaxy.spacetraveler.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.microsoft.fluent.mobile.icons.R

@Composable
fun JetRatingBar(
    rating: Int,
    modifier: Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(3.dp),
    ) {
        (1..5).forEach { starRating ->
            val color = if (starRating <= rating) Color.Yellow else Color.Gray
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_fluent_star_20_filled),
                contentDescription = "",
                tint = color
            )
        }
    }
}

@Preview
@Composable
private fun JetRatingBarPreview() {
    JetRatingBar(
        rating = 3,
        modifier = Modifier
    )
}