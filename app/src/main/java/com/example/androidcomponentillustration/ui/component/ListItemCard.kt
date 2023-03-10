package com.example.androidcomponentillustration.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ComponentItem(
    name: String,
    imageIcon: Int,
    forwardIcon: Int,
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    itemSeparation: Dp = 16.dp,
    onClick: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(1f)
                .clickable { onClick() }
                .padding(vertical = itemSeparation)
        ) {
            ComponentIcon(imageIcon, iconModifier.size(38.dp))
            Spacer(modifier = Modifier.width(16.dp))
            InterestContent(name)
            Spacer(modifier = Modifier.width(200.dp))
            ForwardIcon(forwardIcon = forwardIcon,iconModifier.size(38.dp))
        }
//        NiaIconToggleButton(
//            checked = following,
//            onCheckedChange = onFollowButtonClick,
//            icon = {
//                Icon(
//                    imageVector = NiaIcons.Add,
//                    contentDescription = stringResource(
//                        id = string.card_follow_button_content_desc
//                    )
//                )
//            },
//            checkedIcon = {
//                Icon(
//                    imageVector = NiaIcons.Check,
//                    contentDescription = stringResource(
//                        id = string.card_unfollow_button_content_desc
//                    )
//                )
//            }
//        )
    }
}

@Composable
private fun InterestContent(name: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = name,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(vertical = 0.dp)
        )
    }
}

@Composable
private fun ComponentIcon(iconImage: Int, modifier: Modifier = Modifier) {
    Icon(
        modifier = modifier
            .background(MaterialTheme.colors.surface)
            .padding(4.dp),
        painter = painterResource(id = iconImage),
        contentDescription = null, // decorative image
    )
}

@Composable
private fun ForwardIcon(forwardIcon: Int, modifier: Modifier = Modifier) {
    Icon(
        modifier = modifier
            .background(MaterialTheme.colors.surface)
            .padding(4.dp),
        painter = painterResource(id = forwardIcon),
        contentDescription = null, // decorative image
    )
}