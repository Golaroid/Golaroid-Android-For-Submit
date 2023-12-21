package com.idea_festival.design_system.component.tobar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.idea_festival.design_system.component.icon.GoBackIcon
import com.idea_festival.design_system.theme.GolaroidAndroidTheme

@Composable
fun GoBackTopBar(
    modifier: Modifier = Modifier,
    icon: @Composable () -> Unit,
    text: String,
    onClick: () -> Unit
) {
    GolaroidAndroidTheme { colors, typography ->
        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(color = colors.BLACK)
        ) {
            Spacer(
                modifier = modifier.width(16.dp)
            )
            IconButton(
                onClick = onClick,
                modifier = modifier
                    .height(24.dp)
                    .width(24.dp)
                    .align(Alignment.CenterVertically)
            ) {
                icon()
            }
            Spacer(
                modifier = modifier.width(6.dp)
            )
            Text(
                modifier = modifier
                    .align(Alignment.CenterVertically),
                text = text,
                style = typography.labelMedium,
                color = colors.WHITE
            )
        }
    }
}

@Preview
@Composable
fun GoBackTopBarPre() {
    GoBackTopBar(
        icon = { (GoBackIcon()) },
        text = "돌아가기"
    ) {

    }
}