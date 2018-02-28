/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.camera2basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CameraActivity extends AppCompatActivity {

    Button botonFragCamaraHorizontal;
    Button botonFragCamaraVertical;
    Button botonFragVideoHorizontal;
    Button botonFragVideoVertical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        botonFragCamaraHorizontal = findViewById(R.id.changeCH);
        botonFragCamaraVertical = findViewById(R.id.changeCV);
        botonFragVideoHorizontal = findViewById(R.id.changeVH);
        botonFragVideoVertical = findViewById(R.id.changeVV);

        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }

        /*
        * pasar los botones a sus fragments correspondientes
        * hacer getctivity() y luego la transaction
        * */


        View.OnClickListener listenerVH = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToVH();
            }
        };
//
//        View.OnClickListener listenerVV = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switchToVV();
//            }
//        };
//
//        /*View.OnClickListener listenerCH = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switchToCH();
//            }
//        };
//
//        View.OnClickListener listenerCV = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switchToCV();
//            }
//        };*/
//
            //botonFragCamaraHorizontal.setOnClickListener(listenerVH);
        botonFragCamaraVertical.setOnClickListener(listenerVH);
//        //botonFragVideoHorizontal.setOnClickListener(listenerCH);
//        //botonFragVideoVertical.setOnClickListener(listenerCV);
//
//        /*
//        * View.OnClickListener listenera = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                switchtoFragmentA();
//            }
//        };
//        buttonA.setOnClickListener(listenera);
//        * */

    }

//    private void switchToVV() {
//        getFragmentManager().beginTransaction().replace(R.id.container, Camera2VideoFragment.newInstance()).commit();
//
//    }
/*
    private void switchToCH() {

    }

    private void switchToVV() {

    }
*/
    private void switchToVH() {
        getFragmentManager().beginTransaction().replace(R.id.container, Camera2VideoFragment.newInstance()).commit();
    }

}
