package com.easyhz.daypet.home.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.easyhz.daypet.design_system.extension.screenHorizonPadding
import com.easyhz.daypet.design_system.theme.Heading1

@Composable
fun HomeTopBar(
    title: String,
) {
    Box(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .screenHorizonPadding(),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                modifier = Modifier.height(32.dp),
                text = title,
                style = Heading1
            )
            Icon(
                modifier = Modifier.size(32.dp),
                imageVector = Icons.AutoMirrored.Outlined.KeyboardArrowRight,
                contentDescription = "KeyboardArrowRight"
            )
        }
        InfoTab(
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
}

@Stable
@Composable
private fun InfoTab(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            imageVector = Icons.Outlined.Notifications,
            contentDescription = "Notification"
        )
        Icon(
            modifier = Modifier.size(32.dp),
            imageVector = Icons.Outlined.AccountCircle,
            contentDescription = "AccountCircle"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeTopBarPreview() {
    Scaffold(
        topBar = { HomeTopBar(title = "5월") }
    ) { it ->
        Text(text = it.toString(), Modifier.padding(it))
    }
}