/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.pink900

@Composable
fun WelcomeScreen(onClick: () -> Unit) {
    // TODO Background Day/Night
    Column() {
        Spacer(Modifier.height(72.dp))
        Logo()
        // Create Account
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = pink900),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text(
                text = "Create account",
                color = Color.White
            )
        }
        Spacer(Modifier.height(8.dp))
        // LogIn
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(56.dp)
                .clickable(onClick = onClick)
        ) {
            Text(
                text = "Log in",
                Modifier
                    .align(Alignment.Center)
                    .width(200.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Column(modifier) {
        Box(
            Modifier
                .fillMaxWidth()
                .offset(x = 88.dp)
                .height(300.dp)
                .background(Color.Black)
        ) // TODO illos Image
        Spacer(Modifier.height(48.dp))
        // TODO Bloom Image
        // Title Image
        Box(
            Modifier
                .align(Alignment.CenterHorizontally)
                .width(200.dp)
                .height(40.dp)
                .background(Color.Black)
        )
        Text(
            text = "Beautiful home garden solutions",
            Modifier
                .paddingFromBaseline(top = 32.dp, bottom = 40.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}
