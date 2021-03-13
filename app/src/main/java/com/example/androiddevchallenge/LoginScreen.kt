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
package com.example.androiddevchallenge

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.pink900

@Composable
fun LoginScreen(onClick: () -> Unit) {
    var emailAddress by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Log in with email",
            Modifier
                .paddingFromBaseline(top = 184.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.h1
        )
        OutlinedTextField(
            value = emailAddress,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            onValueChange = {
                emailAddress = it
            },
            label = {
                Text(
                    text = "Email address",
                    style = MaterialTheme.typography.body1
                )
            }
        )
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(
            value = emailAddress,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {
                emailAddress = it
            },
            label = {
                Text(
                    text = "Password (8+ characters)",
                    style = MaterialTheme.typography.body1,
                )
            }
        )
        Text(
            buildAnnotatedString {
                val str1 = "By Clicking below, you agree to our "
                val str2 = "Terms of Use"
                val str3 = " and consent to our "
                val str4 = "Privacy Policy"
                append(str1)
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append(str2)
                }
                append(str3)
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append(str4)
                }
            },
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .paddingFromBaseline(top = 24.dp, bottom = 16.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body2,
            color = Color.Gray,
        )
        Button(
            onClick = onClick,
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
    }
}
