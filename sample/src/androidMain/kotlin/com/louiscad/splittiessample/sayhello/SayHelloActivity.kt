/*
 * Copyright 2019 Louis Cognault Ayeva Derman. Use of this source code is governed by the Apache 2.0 license.
 */
package com.louiscad.splittiessample.sayhello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import splitties.views.dsl.core.setContentView

class SayHelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SayHelloUi(this))
    }
}
